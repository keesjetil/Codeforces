package Problems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Problem228A {
    public static void main(String[] args) {
        var scn = new Scanner(System.in);
        var s_1 = scn.nextInt();
        var s_2 = scn.nextInt();
        var s_3 = scn.nextInt();
        var s_4 = scn.nextInt();

        var set = new HashSet<Integer>(
                Arrays.asList(s_1,s_2,s_3,s_4)
        );

        System.out.println(4-set.size());

    }
}
