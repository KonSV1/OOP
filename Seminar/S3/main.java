package Seminar.S3;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class main {
    public static void main(String[] args) {
        // User user1 = new User("Билл", "Клинтон", 76);
        // User user2 = new User("Моника", "Левински", 49);
        // User user3 = new User("Билл", "Гейтс", 67);
        // User user4 = new User("Том", "Кукуруз", 60);
        // User user5 = new User("Майкл", "Бэй", 58);

        // User[] users = new User[] {user1, user2, user3, user4, user5};
        
        User[] users = new User[] {
            new User("Билл", "Клинтон", 76),
            new User("Моника", "Левински", 49),
            new User("Билл", "Гейтс", 67),
            new User("Том", "Кукуруз", 60),
            new User("Майкл", "Бэй", 58)};

        Personal personal = new Personal(users);

        // for (User user : personal) {
        //     System.out.println(user);  
        // }
        System.out.println("***____________________***");
        List<User> myUsers = personal.toList();
        System.out.println(myUsers);
        Collections.sort(myUsers);
        System.out.println(myUsers);
    }
}
