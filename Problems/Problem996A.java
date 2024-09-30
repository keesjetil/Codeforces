package Problems;

import java.util.Scanner;

public class Problem996A {
    public static void main(String[] args) {
        var scn = new Scanner(System.in);
        var n = scn.nextInt();
        var count = 0;
        while(n != 0){
            if(n>=100){
                var amount = n/100;
                count+=amount;
                n -= 100*amount;
            }else if (n>=20) {
                var amount = n/20;
                count+=amount;
                n -= 20*amount;
            }
            else if (n>=10) {
                var amount = n/10;
                count+=amount;
                n -= 10*amount;
            }
            else if (n>=5) {
                var amount = n/5;
                count+=amount;
                n -= 5*amount;
            }else{
                count += n;
                n=0;
            }
        }
        System.out.println(count);
    }
}
