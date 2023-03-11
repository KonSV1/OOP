package srp.Presenter;

import srp.Model.Persister;
import srp.Model.User;
import srp.View.ViewProcess;

public class App {
    String user;

    public App() {
    }

    public void start(String name){
        User user = new User(name);
        ViewProcess.report(user);
        Persister.preservationUser(user);
        ViewProcess.save(user);
       }
}

