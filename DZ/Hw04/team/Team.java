package DZ.Hw04.team;

import DZ.Hw04.warior.DistanceAttacker;
import DZ.Hw04.warior.Warrior;
import DZ.Hw04.armor.Armor;

import java.util.ArrayList;
import java.util.List;

public class Team<T extends Warrior> {
    private List<T> team = new ArrayList<>();
    private String name;

    public Team(String name) {
        this.name = name;
    }

    public Team<T> addWarrior(T warrior) {
        team.add(warrior);
        return this;
    }


    public int getMaxDistance() {
        int distance = 0;
        for (T item : team) {
            if (!(item instanceof DistanceAttacker)) {
                continue;
            }
            DistanceAttacker temp = (DistanceAttacker) item;
            if (temp.getDistance() > distance) {
                distance = temp.getDistance();
            }
        }
        return distance;
    }

    public int getMinDefense() {
        int defense = 100;
        for (T item : team) {
            if (item.getDefense() < defense) {
                defense = item.getDefense();
            }
        }
        return defense;
    }

    public int getTeamAttack() {
        int sum = 0;
        for (T item : team) {
            sum += item.getAttack();
        }
        return sum;
    }

    @Override
    public String toString() {
        StringBuilder teamBuilder = new StringBuilder();
        for (T item : team) {
            teamBuilder.append(item.toString() + "\n");
        }
        return String.format("Team{ team= %s, maxDistance = %d, maxDamage = %d, minDefense = %s \n%s}", name, getMaxDistance(), getTeamAttack(), getMinDefense(), teamBuilder);
    }
}
