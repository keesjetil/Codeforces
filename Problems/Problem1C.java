package Problems;

import java.util.Scanner;

// TODO
public class Problem1C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double p1= sc.nextDouble();
        double p2= sc.nextDouble();
        double q1= sc.nextDouble();
        double q2= sc.nextDouble();
        double r1= sc.nextDouble();
        double r2= sc.nextDouble();

        //first of all find points with same euclidian distance

    }

    private static void flagStonesNeeded(long n, long m , long a) {
        long nn = (long) Math.ceil((double) n /a);
        long mm = (long) Math.ceil((double) m /a);
        System.out.println(nn*mm);
    }
}
