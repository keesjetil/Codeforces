package Problems;

import java.util.Arrays;
import java.util.Scanner;

public class Problem230B {
    public static void main(String[] args) {
        var scn = new Scanner(System.in);
        var n = scn.nextInt();
        var MAX_LIMIT = 1000000;
        boolean[] A = new boolean[MAX_LIMIT+1];
        for (int i = 2; i <= MAX_LIMIT; i++) {
            A[i] = true;
        }

        for(int j=2; j*j<=MAX_LIMIT; j++){
            if(A[j]){
                for(int k = j*j; k<=MAX_LIMIT; k+=j){
                    A[k]=false;
                }
            }
        }


        for(int i=0 ; i<n; i++){
            var m = scn.nextLong();
            if(m<4){
                System.out.println("NO");
            }else{
                long sqrtX = (long) Math.sqrt(m);
                if(sqrtX * sqrtX == m && A[(int) sqrtX]){
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
                }
            }
        }
    }
}
