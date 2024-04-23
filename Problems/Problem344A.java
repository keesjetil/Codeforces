package Problems;

import java.util.Arrays;
import java.util.Scanner;

public class Problem344A {
    public static void main(String[] args) {
        var scn = new Scanner(System.in);
        var t = scn.nextInt();
        var prevDomino = "";
        var score = 0;
        for(int i=0; i<t; i++){
            var magnet = scn.next();
            if(prevDomino == "" || prevDomino.charAt(1) == magnet.charAt(0)){
                score ++;
            }
            prevDomino = magnet;
        }

        System.out.println(score);
    }
}
