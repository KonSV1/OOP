package DZ.Hw04.warior;

import java.util.Random;

import DZ.Hw04.armor.Armor;
import DZ.Hw04.weapons.Weapon;

public abstract class Warrior<T1 extends Weapon, T2 extends Armor> {
    private String name;
    protected T1 weapon;
    protected T2 armor;
    protected Random rnd = new Random();
    private int healthPoint;


    public Warrior(String name, T1 weapon, T2 armor) {
        this.name = name;
        this.weapon = weapon;
        this.armor = armor;
        healthPoint = 100;
    }

    public int getHealthPoint() {
        return healthPoint;
    }

    public void reduceHealthPoint(int damage) {
        this.healthPoint -= damage;
    }

    public int hitDamage(Warrior enemy) {
        int damage = rnd.nextInt(weapon.attack()) - armor.defense();
        enemy.reduceHealthPoint(damage);
        return damage;
    }

    public int getAttack() {
        return weapon.attack();
    }

    public int getDefense() {return armor.defense();}

    @Override
    public String toString() {
        return getClass().getSimpleName() + " name = " + name + ", weapon = " + weapon + ", healthPoint = " + healthPoint + ", ";
    }
}
