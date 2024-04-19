package Problems;

import java.util.Arrays;
import java.util.Scanner;

public class Problem266A {
    public static void main(String[] args) {
        var scn = new Scanner(System.in);
        scn.nextInt();
        var s = scn.next();
        var score = 0;
        while(s.indexOf("RR") >= 0){
            s = s.replaceFirst("RR","R");
            score ++;
        }
        while(s.indexOf("GG") >= 0){
            s = s.replaceFirst("GG","G");
            score ++;
        }
        while(s.indexOf("BB") >= 0){
            s = s.replaceFirst("BB","B");
            score ++;
        }
        System.out.println(score);
    }
}
