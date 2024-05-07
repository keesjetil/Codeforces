package Problems;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Problem469A {
    public static void main(String[] args) {
        var scn = new Scanner(System.in);
        var n = scn.nextInt();
        Set<Integer> checkSet = new HashSet<>();
        for(int i=1; i<=n; i++){
            checkSet.add(i);
        }
        var x = scn.nextInt();
        for(int i=0;i<x;i++){
            var entry = scn.nextInt();
            checkSet.remove(entry);
        }

        var y = scn.nextInt();
        for(int i=0;i<y;i++){
            var entry = scn.nextInt();
            checkSet.remove(entry);
        }

        System.out.println(checkSet.isEmpty() ? "I become the guy." : "Oh, my keyboard!");
    }
}
