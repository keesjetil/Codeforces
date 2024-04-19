package Problems;

import java.util.Arrays;
import java.util.Scanner;

public class Problem158A {
    public static void main(String[] args) {
        var scn = new Scanner(System.in);
        var n = scn.nextInt();
        var k = scn.nextInt();
        var score = 0;
        scn.nextLine();
        String[] strList = scn.nextLine().split(" ");
        var kVal = Integer.parseInt(strList[k-1]);
        for (String s : strList) {
            if (Integer.parseInt(s) >= kVal && Integer.parseInt(s)!=0) {
                score++;
            } else {
                break;
            }
        }
        System.out.println(score);
    }
}
