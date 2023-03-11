package srp.View;

import srp.Model.User;

public class ViewProcess {
    private final String user;

    public ViewProcess(String user) {
        this.user = user;
    }

    public static void report(User user) {
        System.out.println("Report for user: " + user);
    }

    public static void save(User user) {
        System.out.println("Save user: " + user);
    }


}
