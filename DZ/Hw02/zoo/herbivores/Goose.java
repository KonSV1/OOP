package zoo.herbivores;

import zoo.Flyable;
import zoo.Runable;
import zoo.Waterfowlble;

public class Goose extends Herbivores implements Flyable, Runable, Waterfowlble {
    private int flightSpeed = 20;
    private int fowlbleSpeed = 7;
    private int runSpeed = 5;

    public Goose(String name) {
        super(name);
    }

    @Override
    public String say() {
        return "SHHHHHH!";
    }


    @Override
    public int getSpeedFlyable() {
        return this.flightSpeed;
    }

    @Override
    public int getSpeedRun() {
        return this.runSpeed;
    }

    @Override
    public int getSpeedWaterfowlble() {
        return this.fowlbleSpeed;
    }


}
