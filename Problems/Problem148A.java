package Problems;

import java.util.Scanner;

public class Problem148A {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        var k = scn.nextInt();
        var l = scn.nextInt();
        var m = scn.nextInt();
        var n = scn.nextInt();
        var d = scn.nextInt();
        var sum = 0;
        for(int i=1; i<=d; i++){
            if(i%k == 0 || i%l == 0 || i%m ==0 || i%n ==0){
                sum ++;
            }
        }
        System.out.println(sum);
    }
}
