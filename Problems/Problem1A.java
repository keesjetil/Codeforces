package Problems;

import java.util.Scanner;

public class Problem1A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long m = sc.nextLong();
        long a = sc.nextLong();
        flagStonesNeeded(n,m,a);

    }

    private static void flagStonesNeeded(long n, long m , long a) {
        long nn = (long) Math.ceil((double) n /a);
        long mm = (long) Math.ceil((double) m /a);
        System.out.println(nn*mm);
    }
}
