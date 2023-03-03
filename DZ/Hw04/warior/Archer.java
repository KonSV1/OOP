package DZ.Hw04.warior;

import DZ.Hw04.armor.Light;
import DZ.Hw04.armor.Robe;
import DZ.Hw04.weapons.Bow;

public class Archer extends Warrior<Bow, Light> implements DistanceAttacker {
    private int distance;

    public Archer(String name, Bow weapon, Light armor) {
        super(name, weapon, armor);

        distance = weapon.getDistance() + rnd.nextInt(10);
    }

    public int getDistance() {
        return distance;
    }

    @Override
    public String toString() {
        return super.toString() + " defense  = " + getDefense() + ", attack distance =" + distance;
    }
}
