package Problems;

import java.util.Scanner;

public class Problem158B {
    public static void main(String[] args) {
        var scn = new Scanner(System.in);
        var t = scn.nextInt();
        var countFours = 0;
        var countThrees = 0;
        var countTwos = 0;
        var countOnes = 0;
        for (int i = 0; i < t; i++) {
            var next = scn.nextInt();
            switch (next) {
                case 1:
                    countOnes++;
                    break;
                case 2:
                    countTwos++;
                    break;
                case 3:
                    countThrees++;
                    break;
                case 4:
                    countFours++;
                    break;
            }
        }

        var totalTaxis = countFours + (countTwos / 2);
        var leftTwos = countTwos % 2 == 1 ? 1 : 0;
        //if more threes than ones;
        if (countOnes == 0 || countThrees - countOnes >= 0) {
            totalTaxis += countThrees;
            if (leftTwos > 0) {
                totalTaxis++;
            }
        } else {
            var leftOnes = countOnes - countThrees;
            if (leftTwos == 0) {
                totalTaxis += (int) Math.ceil((double) leftOnes / 4);
            } else {
                if (leftOnes == 1 || leftOnes == 2) {
                    totalTaxis++;
                } else {
                    totalTaxis += (int) (Math.ceil((double) (leftOnes - 2) / 4) + 1);
                }
            }
            totalTaxis += countThrees;
        }
        System.out.println(totalTaxis);
    }
}
