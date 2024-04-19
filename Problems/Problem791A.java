package Problems;

import java.util.Scanner;

public class Problem791A {
    public static void main(String[] args) {
        var scn = new Scanner(System.in);
        var a = scn.nextInt();
        var b = scn.nextInt();
        int years = 0;
        while(a<=b){
            a*=3;
            b*=2;
            years +=1;
        }
        System.out.println(years);

    }
}
