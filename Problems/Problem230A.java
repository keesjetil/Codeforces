package Problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Problem230A {
    public static void main(String[] args) {
        var scn = new Scanner(System.in);
        var s = scn.nextInt();
        var n = scn.nextInt();
        var dragonList = new ArrayList<Dragon>();
        for (int i = 0; i < n; i++) {
            var x_i = scn.nextInt();
            var y_i = scn.nextInt();
            dragonList.add(new Dragon(x_i, y_i));
        }

        Collections.sort(dragonList);
        boolean canMoveOn = true;
        for (int i = 0; i < dragonList.size(); i++) {
            var dragonToFight = dragonList.get(i);
            if (dragonToFight.getStrength() < s) {
                s += dragonToFight.getBonus();
            } else {
                canMoveOn = false;
                break;
            }
        }
        System.out.println(canMoveOn ? "YES" : "NO");

    }
}


class Dragon implements Comparable<Dragon> {
    Integer strength;
    Integer bonus;

    public Dragon(int strength, int bonus) {
        this.strength = strength;
        this.bonus = bonus;
    }

    public Integer getStrength() {
        return strength;
    }

    public Integer getBonus() {
        return bonus;
    }

    @Override
    public int compareTo(Dragon o) {
        return getStrength().compareTo(o.getStrength());
    }
}


