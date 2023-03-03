package DZ.Hw04.weapons;

public class Staff implements Weapon {

    private int distance = 60;

    public int getDistance() {
        return distance;
    }

    @Override
    public int attack() {
        return 80;
    }

    @Override
    public String toString() {
        return "Staff of Life { " + "distance = " + distance + " attack = " + attack() + " }";
    }
}
