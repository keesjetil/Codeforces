package Problems;

import java.util.Scanner;

public class Problem118A {
    public static void main(String[] args) {
        var scn = new Scanner(System.in);
        var str =
                scn.next().toLowerCase()
                    .replaceAll("[aoyeui]","");
        var sb = new StringBuilder();
        for(int i=0; i<str.length(); i++){
            sb.append("." + String.valueOf(str.charAt(i)));
        }
        System.out.println(sb.toString());


    }
}
