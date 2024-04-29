package Problems;

import java.util.Scanner;

public class Problem133A {
    public static void main(String[] args) {
        var scn = new Scanner(System.in);
        var str = scn.next();
        if(str.contains("H")
            || str.contains("Q")
            || str.contains("9")){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
