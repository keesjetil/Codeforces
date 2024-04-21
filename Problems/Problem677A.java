package Problems;

import java.util.Scanner;

public class Problem677A {
    public static void main(String[] args) {
        var scn = new Scanner(System.in);
        var n = scn.nextInt();
        var h = scn.nextInt();
        var score = 0;
        for(int i=0; i<n; i++){
            if(scn.nextInt() >h){
                score +=2;
            }else{
                score ++;
            }
        }
        System.out.println(score);
    }
}
