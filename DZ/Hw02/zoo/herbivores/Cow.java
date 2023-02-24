package zoo.herbivores;

import zoo.Runable;

public class Cow extends Herbivores implements Runable{
    private int runSpeed = 13;
    public Cow(String name) {
        super(name);
    }

    @Override
    public String say() {
        return "Muu!";
    }

    @Override
    public int getSpeedRun() {
        return this.runSpeed;
    }

}
