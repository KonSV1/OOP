package DZ.Hw01;

import java.sql.Date;

public class Main {
    public static void main(String[] args) {
        VendingMachine machine = new VendingMachine();
        machine.addProduct(new Product("Lays", 100));
        machine.addProduct(new Product("Mars", 70));
        machine.addProduct(new Product("Twix", 70.99));
        machine.addProduct(new Product("Алёнка", 90));
        machine.addProduct(new Product("Колокольчик", 85));
        machine.addProduct(new Perishable("Молоко Бурёнка", 85, new Date(123, 2, 22)));
        machine.addProduct(new Perishable("Молоко Коровка", 85, new Date(123, 2, 22)));
        machine.addProduct(new Perishable("Молоко Василёк", 85, new Date(123, 2, 22)));
        machine.addProduct(new HotDrinks("Капучино", 50, 75));
        machine.addProduct(new HotDrinks("Чай черный", 35, 150));
        machine.addProduct(new HotDrinks("Горячий шоколад", 45.50, 75));
        machine.addProduct(new HotDrinks("Лате", 90,150));

        System.out.println(machine);
        System.out.println("__________________________________");
        // System.out.println(machine.findProduct("Молоко"));
        // System.out.println(machine.findProduct("Алёнка"));
        // System.out.println(machine.findProduct("Пиво"));
        System.out.println(machine.findProduct("Лате"));
        System.out.println("__________________________________");
        System.out.println("продан: " + machine.sellProduct(machine.findProduct("Twix").get(0)));
        System.out.println("продан: " + machine.sellProduct(machine.findProduct("Горячий шоколад").get(0)));
        System.out.println("__________________________________");
        System.out.println(machine);
    }
}