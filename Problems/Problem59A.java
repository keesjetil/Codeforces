package Problems;

import java.util.Scanner;

public class Problem59A {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        var str = scn.next();
        var upper = str.replaceAll("[a-z]", "");
        var lower = str.replaceAll("[A-Z]", "");
        if (lower.length() > upper.length()) {
            System.out.println(str.toLowerCase());
        } else if (lower.length() < upper.length()) {
            System.out.println(str.toUpperCase());
        } else {

            System.out.println(str.toLowerCase());
        }
    }
}
