package Problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Problem405A {
    public static void main(String[] args) {
        var scn = new Scanner(System.in);
        var n = scn.nextInt();
        var aList = new ArrayList<Integer>();
        for (var i = 0; i < n; i++) {
            aList.add(scn.nextInt());
        }
        Collections.sort(aList);
        System.out.println(aList.toString().replaceAll(",", " ").replaceAll("\\[", "").replaceAll("]", ""));
    }
}
