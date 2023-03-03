package DZ.Hw04.warior;

import DZ.Hw04.armor.Heavy;
import DZ.Hw04.weapons.Sword;

public class SwordMan extends Warrior<Sword, Heavy> {
    public SwordMan(String name, Sword weapon, Heavy armor) {
        super(name, weapon, armor);
    }


     @Override
     public String toString() {
         return super.toString() + " defense  = " + getDefense();
     }
}
