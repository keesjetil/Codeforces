package Problems;

import java.util.Scanner;

public class Problem318A {
    public static void main(String[] args) {
        var scn = new Scanner(System.in);
        var n = scn.nextLong();
        var k = scn.nextLong();
        var position = 0L;
        for (long i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                position = (long) Math.ceil((double) i / 2);
                if (k == position) {
                    System.out.println(i);
                    break;
                }
            } else {
                position = (long) Math.ceil((double) (n + i) / 2);
                if (k == position) {
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}
