package Problems;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Optional;
import java.util.Scanner;

public class Problem479A {
    public static void main(String[] args) {
        var scn = new Scanner(System.in);
        var a = scn.nextInt();
        var b = scn.nextInt();
        var c = scn.nextInt();

        System.out.println(findMax(a,b,c).get());
    }

    private static Optional<Integer> findMax(int a, int b, int c) {
        var set = new HashSet<Integer>();
        var s_1 = a+b+c;
        set.add(s_1);
        var s_2 = a+(b*c);
        set.add(s_2);
        var s_3 = (a*b) + c;
        set.add(s_3);
//        var s_4 = (a*c) + b;
//        set.add(s_4);
        var s_5 = (a+b)*c;
        set.add(s_5);
//        var s_6 = (a+c)*b;
//        set.add(s_6);
        var s_7 = a*(b+c);
        set.add(s_7);
        var s_8 = a*b*c;
        set.add(s_8);
        return set.stream().max(Comparator.naturalOrder());
    }
}
