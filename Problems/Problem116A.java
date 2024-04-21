package Problems;

import java.util.Scanner;

public class Problem116A {
    public static void main(String[] args) {
        var scn = new Scanner(System.in);
        var n = scn.nextInt();
        var pas = 0;
        var maxPas = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            var a = scn.nextInt();
            var b = scn.nextInt();
            pas += b-a;
            if(pas > maxPas){
                maxPas = pas;
            }
        }

        System.out.println(maxPas);
    }
}
