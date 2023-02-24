package zoo.herbivores;

import zoo.Flyable;
import zoo.Runable;
import zoo.Waterfowlble;

public class Duck extends Herbivores implements Flyable, Runable, Waterfowlble {
    private int flightSpeed = 15;
    private int fowlbleSpeed = 5;
    private int runSpeed = 10;

    public Duck(String name) {
        super(name);
    }

    @Override
    public String say() {
        return "Krya Krya!";
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
