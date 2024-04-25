package Problems;

import java.util.Scanner;

public class Problem200B {
    public static void main(String[] args) {
        var scn = new Scanner(System.in);
        var n = scn.nextInt();
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += scn.nextDouble();
        }
        System.out.printf("%.12f",sum/n);
    }
}
