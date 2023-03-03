package DZ.Hw04.armor;

public class Light implements Armor {
    int leatherHelmet = 2;
    int leatherBreastplate = 2;
    int leatherLeggings = 2;
    int leatherGauntlet = 2;
    int leatherBoots = 2;


    public Light() {
    }

    @Override
    public int defense() {
        int def = leatherHelmet + leatherBreastplate + leatherLeggings + leatherGauntlet + leatherBoots;
        return def;
    }

    @Override
    public String toString() {
        return "Защита = " + defense();
    }
}
