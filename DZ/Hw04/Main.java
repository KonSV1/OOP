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
import static DZ.Hw04.armor.Robe.*;

public class Main {
    public static void main(String[] args) {
        Team<Archer> archerTeam = new Team<>("Archers");
        archerTeam.addWarrior(new Archer("Григорий", new Bow(), new Light()))
                .addWarrior(new Archer("Михаил", new Bow(), new Light()))
                .addWarrior(new Archer("Константин повелитель тьмы", new Bow(), new Light()));

        System.out.println(archerTeam);

        Team<SwordMan> swordTeam = new Team<>("Swords");
        swordTeam.addWarrior(new SwordMan("Григорий", new Sword(), new Heavy()))
                .addWarrior(new SwordMan("Михаил", new Sword(), new Heavy()))
                .addWarrior(new SwordMan("Константин повелитель тьмы", new Sword(), new Heavy()));

        System.out.println(swordTeam);

        Team<Mag> magTeam = new Team<>("Staff");
        magTeam.addWarrior(new Mag("Григорий", new Staff(), r1))
                .addWarrior(new Mag("Михаил", new Staff(), r2))
                .addWarrior(new Mag("Константин повелитель тьмы", new Staff(), r3));

        System.out.println(magTeam);

        Team<Warrior> mixTeam = new Team<>("Mixer");
        mixTeam.addWarrior(new Archer("Григорий", new Bow(), new Light()))
                .addWarrior(new SwordMan("Михаил", new Sword(), new Heavy()))
                .addWarrior(new Mag("Константин повелитель тьмы", new Staff(), r3));

        System.out.println(mixTeam);

        Archer misha = new Archer("Миша", new Bow(), new Light());
//        SwordMan greg = new SwordMan("Григорий", new Sword(), new Heavy());
        Mag kostian = new Mag("Константин повелитель тьмы", new Staff(), r3);


        System.out.println(kostian +"\n--- VS ---\n"+ misha);
        System.out.printf("Здоровье Константина: %d Здоровье Миши: %d \n", kostian.getHealthPoint(), misha.getHealthPoint());
        while (kostian.getHealthPoint() > 0 && misha.getHealthPoint() > 0) {
            misha.hitDamage(kostian);
            kostian.hitDamage(misha);
            System.out.printf("Здоровье Константина: %d Здоровье Миши: %d \n", kostian.getHealthPoint(), misha.getHealthPoint());
        }

        if (kostian.getHealthPoint()>0)
            System.out.println("Константин победил");
        else
            System.out.println("Миша победил");
    }
}