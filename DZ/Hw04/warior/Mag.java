package DZ.Hw04.warior;

import DZ.Hw04.armor.Robe;
import DZ.Hw04.weapons.Staff;

public class Mag extends Warrior<Staff, Robe> implements DistanceAttacker{
    private int distance;

    public Mag(String name, Staff weapon, Robe armor) {
        super(name, weapon, armor);

        distance = weapon.getDistance();

    }
    public int getDistance() {
        return distance;
    }
    @Override
    public String toString() {
        return super.toString() + " defense  = " + getDefense() + " }";
    }
}


