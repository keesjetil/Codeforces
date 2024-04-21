package Problems;

import java.util.Scanner;

public class Problem977A {
    public static void main(String[] args) {
        var scn = new Scanner(System.in);
        var n = scn.nextInt();
        var k = scn.nextInt();

        int start = 0;
        while(start != k){
            if(n%10 != 0){
                if(n == 1){
                    start = k;
                }else{
                    n--;
                }
            }else{
                n = n/10;
            }
            start++;
        }
        System.out.println(n);
    }
}
