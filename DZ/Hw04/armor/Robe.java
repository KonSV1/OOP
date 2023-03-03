package DZ.Hw04.armor;

public class Robe  implements  Armor{
    int circlet;
    int tunic;
    int stocking;
    int cloves;
    int shoes;
    int sigil;

    public Robe(int circlet, int tunic, int stocking, int cloves, int shoes, int sigil) {
        this.circlet = circlet;
        this.tunic = tunic;
        this.stocking = stocking;
        this.cloves = cloves;
        this.shoes = shoes;
        this.sigil = sigil;
    }



    @Override
    public int defense() {
        int def = circlet+tunic+stocking+cloves+shoes+sigil;
        return def;
    }

    @Override
    public String toString() {
        return "Защита = " + defense();
    }
}
