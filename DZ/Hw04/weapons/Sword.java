package DZ.Hw04.weapons;

public class Sword implements Weapon {
    @Override
    public int attack() {
        return 70;
    }
    
    @Override
    public String toString() {
        return "One Hend Sword, attack = " + attack();
    }
}
