package zoo.predator;

import zoo.Runable;

public class Crocodile extends Predator implements Runable {
    private int runSpeed = 15;

    public Crocodile(String name) {
        super(name);
    }

    @Override
    public String say() {
        return "Shhhhh";
    }

    @Override
    public int getSpeedRun() {
        return this.runSpeed;
    }
}
