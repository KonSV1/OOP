package zoo.predator;

import zoo.Waterfowlble;

public class Dolphin extends Predator implements Waterfowlble {
    private int fowlbleSpeed = 50;

    public Dolphin(String name) {
        super(name);
    }

    @Override
    public String say() {
        return "clicks";
    }

    @Override
    public int getSpeedWaterfowlble() {
        return this.fowlbleSpeed;
    }
}
