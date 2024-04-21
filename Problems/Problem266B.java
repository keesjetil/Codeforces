package Problems;

import java.util.Scanner;

public class Problem266B {
    public static void main(String[] args) {
        var scn = new Scanner(System.in);
        var n = scn.nextInt();
        var t = scn.nextInt();
        var str = scn.next();
        for(int i=0; i<t; i++){
            var tmpString = str;
            for(var j=1; j< str.length(); j++){
                if(str.charAt(j-1) =='B' && str.charAt(j)=='G'){
                    tmpString = swap(tmpString, j-1, j);
                }
            }
            str=tmpString;
        }
        System.out.println(str);
    }

    private static String swap(String str, int i, int j) {
        var sb = new StringBuilder(str);
        sb.setCharAt(i, str.charAt(j));
        sb.setCharAt(j, str.charAt(i));
        return sb.toString();
    }
}
