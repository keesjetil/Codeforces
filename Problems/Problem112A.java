package Problems;

import java.util.Scanner;

public class Problem112A {
    public static void main(String[] args) {
        var scn = new Scanner(System.in);
        var A = scn.next().toLowerCase();
        var B = scn.next().toLowerCase();
        if(A.compareTo(B) < 0){
            System.out.println(-1);
        }else if(A.compareTo(B) > 0){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
    }
}
