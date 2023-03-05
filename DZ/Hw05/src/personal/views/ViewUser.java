package personal.views;

import personal.controllers.UserController;
import personal.model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ViewUser {

    private UserController userController;

    public ViewUser(UserController userController) {
        this.userController = userController;
    }

    public void run(){
        Commands com = Commands.NONE;

        while (true) {
            String command = prompt("HELP - Помощь по командам; \nВведите команду: ");
            try{

                com = Commands.valueOf(command.toUpperCase());
                if (com == Commands.EXIT) return;
                switch (com) {
                    case HELP:
                        help();
                        break;
                    case CREATE:
                        createUser();
                        break;
                    case READ:
                        readUser();
                        break;
                    case LIST:
                        listUsers();
                        break;
                    case UPDATE:
                        updateUser();
                        break;
                    case DELETE:
                        delUser();
                        break;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private void updateUser() throws Exception {
        String readID = prompt("Для редактирования контакта введите его идентификатор: ");
        userController.updateUser(readID, inputUser());
    }
    private void delUser() throws Exception {
        String readID = prompt("Для удаления контакта введите его идентификатор: ");
        userController.deleteUser(readID);
    }
    private void listUsers() {
        List<User> listUsers = userController.readAllUsers();
        for (User user: listUsers) {
            System.out.println(user+"\n");
        }
    }

    private void readUser() throws Exception {
        String id = prompt("Введите идентификатор контакта: ");
        User user = userController.readUser(id);
        System.out.println(user+"\n");
    }

    private User inputUser() {
        String firstName = prompt("Имя: ");
        String lastName = prompt("Фамилия: ");
        String phone = prompt("Номер телефона: ");
        return new User(firstName,lastName,phone);
    }

    private void createUser() throws Exception {
        userController.saveUser(inputUser());
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    private void help() {
        System.out.println();
        System.out.println("CREAT - Создание нового контакта. Контакт добавляется в конец списка.");
        System.out.println("READ - Просмотр контакта. Просмотр контакта осуществляется по его идентификатору.");
        System.out.println("LIST - Просмотр всех контактов.");
        System.out.println("UPDATE - Обновление (изменение данных) контакта. Изменение контакта осуществляется по его идентификатору," +
                "\nидиентификатор при обновлении контакта остается прежним.");
        System.out.println("DELETE - Удаление контакта. Удаление контакта осуществляется по его идентификатору. " +
                "\nИдентификатор удаленного контакта остается свободным и отображется в общем списке (команда LIST). " +
                "\nСвободный идентификатор в дальнейшем может быть использован для нового контакта (команда UPDATE).\n");

    }
}
