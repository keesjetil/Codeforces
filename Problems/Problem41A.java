package Problems;

import java.util.Scanner;

public class Problem41A {
    public static void main(String[] args) {
        var scn = new Scanner(System.in);
        var a = scn.next();
        var b = scn.next();
        StringBuilder c = new StringBuilder();
        for (int i = 0; i < a.length(); i++) {
            c.insert(0, a.charAt(i));
        }

        if(c.toString().equals(b)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
