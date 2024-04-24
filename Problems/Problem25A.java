package Problems;

import java.util.Scanner;

public class Problem25A {
    public static void main(String[] args) {
        var scn = new Scanner(System.in);
        var t = scn.nextInt();
        var evenScore = 0;
        var oddScore = 0;
        var latestEvenIndex = -1;
        var latestOddIndex = -1;
        for (int i = 0; i < t; i++) {
            var next = scn.nextInt();
            if (next % 2 == 0) {
                evenScore++;
                latestEvenIndex = i;
            } else {
                oddScore++;
                latestOddIndex = i;
            }

            if (evenScore >= 2 && latestOddIndex >= 0) {
                System.out.println(latestOddIndex + 1);
                break;
            }

            if (oddScore >= 2 && latestEvenIndex >= 0) {
                System.out.println(latestEvenIndex + 1);
                break;
            }
        }
    }
}
