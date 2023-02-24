package zoo.herbivores;

import zoo.Runable;

public class Goat extends Herbivores implements Runable{
    private int runSpeed = 14;
    public Goat(String name) {
        super(name);
    }

    @Override
    public String say() {
        return "Beee!";
    }

    @Override
    public int getSpeedRun() {
        return this.runSpeed;
    }
}
