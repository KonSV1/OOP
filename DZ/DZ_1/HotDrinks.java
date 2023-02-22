import java.math.RoundingMode;

/**
 * HotDrinks
 */
public class HotDrinks extends Product {
    private int volume;

    public HotDrinks(String name, double cost, int volume) {
        super(name, cost);
        this.volume = volume;
    }

    @Override
    public String toString(){
        return String.format("наименование - %s, цена - %.2f руб., объем - %d мл.", name, cost, volume);
    }
}
    