package Problems;

import java.util.Scanner;

public class Problem546A {
    public static void main(String[] args) {
        var scn = new Scanner(System.in);
        //banana price
        var k = scn.nextLong();

        //my dollars
        var n = scn.nextLong();

        //bananas to buy
        var w = scn.nextLong();

        var totalPrice = 0L;
        for(int i=1; i<=w; i++){
            totalPrice += k*i;
        }
        if(totalPrice > n) {
            System.out.println(totalPrice - n);
        }else{
            System.out.println(0);
        }

    }
}
