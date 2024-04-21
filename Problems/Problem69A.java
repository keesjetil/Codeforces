package Problems;

import java.util.Scanner;

public class Problem69A {
    public static void main(String[] args) {
        var scn = new Scanner(System.in);
        var t = scn.nextInt();
        int xSum = 0;
        int ySum = 0;
        int zSum = 0;
        for(int i=0; i<t; i++){
            xSum += scn.nextInt();
            ySum += scn.nextInt();
            zSum += scn.nextInt();
        }
        if(xSum == 0 && ySum == 0 && zSum == 0){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
