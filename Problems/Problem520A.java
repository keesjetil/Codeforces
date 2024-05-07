package Problems;

import java.util.Scanner;

public class Problem520A {
    public static void main(String[] args) {
        var scn = new Scanner(System.in);
        var n = scn.nextInt();
        var INITIAL = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        var str = scn.next().toUpperCase();
        for(int i=0; i<n; i++){
            INITIAL = INITIAL.replaceAll(String.valueOf(str.charAt(i)),"");
        }
        System.out.println(INITIAL.isEmpty() ? "YES" : "NO");
    }
}
