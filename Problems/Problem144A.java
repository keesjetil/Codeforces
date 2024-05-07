package Problems;

import java.util.Scanner;

public class Problem144A {
    public static void main(String[] args) {
        var scn = new Scanner(System.in);
        var n = scn.nextInt();
        var min = Integer.MAX_VALUE;
        var max = Integer.MIN_VALUE;
        var minIndex = -1;
        var maxIndex = -1;
        for (int i = 0; i < n; i++) {
            var current = scn.nextInt();
            if (current <= min) {
                min = current;
                minIndex = i;
            }
            if (current >= max) {
                max = current;
                maxIndex = i;
            }
        }

        if (minIndex < maxIndex) {
            System.out.println(n - 1 - minIndex + maxIndex - 1);
        } else {
            System.out.println(n - 1 - minIndex + maxIndex);
        }


    }
}
