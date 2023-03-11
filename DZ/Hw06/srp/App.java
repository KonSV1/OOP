package srp;

public class App {
    String user;

    public App() {
    }

    public void start(String name){
        User user = new User(name);
        View.report(user);
        Persister.preservationUser(user);
        View.save(user);
       }
}

