package DZ.Hw04;

import DZ.Hw04.armor.Heavy;
import DZ.Hw04.armor.Light;
import DZ.Hw04.armor.Robe;
import DZ.Hw04.team.Team;
import DZ.Hw04.warior.Archer;
import DZ.Hw04.warior.Mag;
import DZ.Hw04.warior.SwordMan;
import DZ.Hw04.warior.Warrior;
import DZ.Hw04.weapons.Bow;
import DZ.Hw04.weapons.Staff;
import DZ.Hw04.weapons.Sword;

import static DZ.Hw04.armor.Armor.*;

public class Main {
    public static void main(String[] args) {
        Team<Archer> archerTeam = new Team<>("Archers");
        archerTeam.addWarrior(new Archer("Василий", new Bow(), new Light()))
                .addWarrior(new Archer("Петр", new Bow(), new Light()))
                .addWarrior(new Archer("Иван", new Bow(), new Light()))
                .addWarrior(new Archer("Григорий", new Bow(), new Light()))
                .addWarrior(new Archer("Павел", new Bow(), new Light()))
                .addWarrior(new Archer("Константин повелитель тьмы", new Bow(), new Light()));

        System.out.println(archerTeam);

        Team<SwordMan> swordTeam = new Team<>("Swords");
        swordTeam.addWarrior(new SwordMan("Василий", new Sword(), new Heavy()))
                .addWarrior(new SwordMan("Петр", new Sword(), new Heavy()))
                .addWarrior(new SwordMan("Иван", new Sword(), new Heavy()))
                .addWarrior(new SwordMan("Григорий", new Sword(), new Heavy()))
                .addWarrior(new SwordMan("Павел", new Sword(), new Heavy()))
                .addWarrior(new SwordMan("Константин повелитель тьмы", new Sword(), new Heavy()));

        System.out.println(swordTeam);

        Team<Mag> magTeam = new Team<>("Swords");
        magTeam.addWarrior(new Mag("Василий", new Staff(),r2))
                .addWarrior(new Mag("Петр", new Staff(), r1))
                .addWarrior(new Mag("Иван", new Staff(), r2))
                .addWarrior(new Mag("Григорий", new Staff(), r1))
                .addWarrior(new Mag("Павел", new Staff(), r1))
                .addWarrior(new Mag("Константин повелитель тьмы", new Staff(), r3));

        System.out.println(magTeam);

        Team<Warrior> mixTeam = new Team<>("Mixer");
        mixTeam.addWarrior(new Archer("Vasya", new Bow(), new Light()))
                .addWarrior(new SwordMan("Petya", new Sword(), new Heavy()))
                .addWarrior(new Archer("Misha", new Bow(), new Light()))
                .addWarrior(new SwordMan("Grisha", new Sword(), new Heavy()));

        System.out.println(mixTeam);

         SwordMan greg = new SwordMan("Petya", new Sword(), new Heavy());
         Archer misha = new Archer("Misha", new Bow(), new Light());

         while (greg.getHealthPoint() > 0 && misha.getHealthPoint() > 0) {
             int damage2 = misha.hitDamage(greg);
             int damage1 = greg.hitDamage(misha);
             System.out.printf("Здоровье Гриши: %d Здоровье Миши: %d \n", greg.getHealthPoint(), misha.getHealthPoint());
         }

         if (greg.getHealthPoint()>0)
             System.out.println("Гриша победил");
         else
             System.out.println("Миша победил");
    }
}