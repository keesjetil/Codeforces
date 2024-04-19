package Problems;

import java.util.Scanner;

public class Problem231A {
    public static void main(String[] args) {
        var scn = new Scanner(System.in);
        int t = scn.nextInt();
        var score = 0;
        for(int i=0; i<t; i++){
            var A = scn.nextInt();
            var B = scn.nextInt();
            var C = scn.nextInt();
            if(A+B+C >= 2){
                score ++;
            }
        }
        System.out.println(score);
    }
}
