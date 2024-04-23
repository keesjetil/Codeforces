package Problems;

import java.util.Scanner;

public class Problem467A {
    public static void main(String[] args) {
        var scn = new Scanner(System.in);
        var t = scn.nextInt();
        var score = 0;
        for (int i = 0; i < t; i++) {
            var a = scn.nextInt();
            var b = scn.nextInt();
            if ((b - a) >= 2) {
                score++;
            }
        }
        System.out.println(score);
    }
}
