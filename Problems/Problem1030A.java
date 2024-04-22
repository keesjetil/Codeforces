package Problems;

import java.util.Scanner;

public class Problem1030A {
    public static void main(String[] args) {
        var scn = new Scanner(System.in);
        var t = scn.nextInt();
        var easy = true;
        for(int i=0; i<t; i++){
            if(scn.nextInt() == 1){
                easy = false;
                break;
            }
        }
        System.out.println(easy ? "EASY" : "HARD");
    }
}
