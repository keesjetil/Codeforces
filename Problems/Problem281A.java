package Problems;

import java.util.Scanner;

public class Problem281A {
    public static void main(String[] args) {
        var scn = new Scanner(System.in);
        var str = scn.next();
        var firstLetter = String.valueOf(str.charAt(0)).toUpperCase();
        System.out.println(firstLetter + str.substring(1));
    }
}
