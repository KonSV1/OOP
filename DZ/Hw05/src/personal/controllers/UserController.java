package personal.controllers;

import personal.model.Repository;
import personal.model.User;
import personal.views.Validation;

import java.util.List;

public class UserController {
    private final Repository repository;
    private final Validation validator;

    public UserController(Repository repository, Validation validator) {
        this.repository = repository;
        this.validator = validator;
    }

    public void saveUser(User user) throws Exception {
        validator.validateUser(user);
        repository.CreateUser(user);
    }

    public User readUser(String userId) throws Exception {
        List<User> users = repository.getAllUsers();
        User user = userSerch(userId, users);
        return user;

    }

    private static User userSerch(String userId, List<User> users) throws Exception {
        for (User user : users) {
            if (user.getId().equals(userId)) {
                return user;
            }
        }
        throw new Exception("User not found");
    }

    public List<User> readAllUsers(){
        return repository.getAllUsers();
    }

    public void updateUser (String userID, User newUser) throws Exception {
        validator.validateUser(newUser);
        List<User> users = repository.getAllUsers();
        User user = userSerch(userID, users);
        user.setFirstName(newUser.getFirstName());
        user.setLastName(newUser.getLastName());
        user.setPhone(newUser.getPhone());
        repository.saveUsers(users);
    }
}
