package Problems;

import java.util.Scanner;

public class Problem1328A {
    public static void main(String[] args) {
        var scn = new Scanner(System.in);
        var t = scn.nextInt();
        for(int i=0; i<t; i++){
            var A = scn.nextLong();
            var B = scn.nextLong();
            var remainder = A%B;
            if(remainder == 0){
                System.out.println(0);
            }else{
                System.out.println(B-remainder);
            }
        }
    }
}
