import java.util.List;

import zoo.*;
import zoo.herbivores.*;
import zoo.predator.*;
import zoo.radio.*;


public class Main {
    public static void main(String[] args) {

        List<Animal> animalsList = List.of(
                new Cow("Мурка"),
                new Crocodile("Гена"),
                new Leo("Симба - Леопольд"),
                new Goat("Маруська"),
                new Duck("Дональд"),
                new Goose("Мартин"),
                new Dolphin("Майкл")
        );

        Zoo zoo = new Zoo(animalsList, new Radio());

        for (Sayable animal : zoo.getSayable()) {
            System.out.println(animal.getName()+" Говорит " + animal.say());
        }
        System.out.println("______________________");
        for (Runable animal : zoo.getRunableList()) {
            System.out.println(((Animal)animal).getClass().getSimpleName() + " по кличке " +
            ((Animal)animal).getName()  + " бежит со скоростью " + animal.getSpeedRun());
        }
        System.out.println("______________________");
        for (Flyable animal : zoo.getFlyableList()) {
            System.out.println(((Animal)animal).getClass().getSimpleName() + " по кличке " +
            ((Animal)animal).getName()  + " летает со скоростью " + animal.getSpeedFlyable());
        }
        System.out.println("______________________");
        for (Waterfowlble animal : zoo.getWaterflyablesList()) {
            System.out.println(((Animal)animal).getClass().getSimpleName() + " по кличке " +
            ((Animal)animal).getName()  + " плавает со скоростью " + animal.getSpeedWaterfowlble());
        }

        System.out.println("\n____Определяем чемпиона по бегу_____");
        System.out.println(zoo.getRunChampion());
        System.out.println("\n____Определяем чемпиона по полётам_______");
        System.out.println(zoo.getFlightChampion());
        System.out.println("\n____Определяем чемпиона по плаванию_______");
        System.out.println(zoo.getWaterfowlChampion());

    }
}