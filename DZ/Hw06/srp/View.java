package srp;

public class View {
    private final String user;

    public View(String user) {
        this.user = user;
    }

    public static void report(User user) {
        System.out.println("Report for user: " + user);
    }

    public static void save(User user) {
        System.out.println("Save user: " + user);
    }


}
