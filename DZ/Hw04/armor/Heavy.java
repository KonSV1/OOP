package DZ.Hw04.armor;

public class Heavy implements Armor {
    int helmet = 3;
    int breastplate = 3;
    int leggings = 3;
    int gauntlet=3;
    int sabaton=3;
    int shield=3;

    public Heavy() {
    }

    @Override
    public int defense() {
        int def = helmet + breastplate + leggings + gauntlet + sabaton + shield;
        return def;
    }

    @Override
    public String toString() {
        return "Защита = " + defense();
    }
}
