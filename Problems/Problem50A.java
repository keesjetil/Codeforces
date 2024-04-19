package Problems;

import java.util.Scanner;

public class Problem50A {
    public static void main(String[] args) {
        var scn = new Scanner(System.in);
        var M = scn.nextInt();
        var N = scn.nextInt();
        if(M%2 == 0){
            System.out.println(M/2 * N);
        }else if(N%2 == 0){
            System.out.println(N/2 * M);
        }else{
            System.out.println(M*(N/2) + M/2);
        }
    }
}
