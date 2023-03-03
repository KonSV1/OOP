package DZ.Hw04.weapons;

public class Bow implements Weapon {

    private int distance = 40;

    public int getDistance() {
        return distance;
    }

    @Override
    public int attack() {
        return 60;
    }

    @Override
    public String toString() {
        return "Long Bow { " + "distance =" + distance + " attack = " + attack() + " }";
    }
}
