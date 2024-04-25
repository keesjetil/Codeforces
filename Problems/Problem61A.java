package Problems;

import java.util.Scanner;

public class Problem61A {
    public static void main(String[] args) {
        var scn = new Scanner(System.in);
        var a = scn.next();
        var b = scn.next();
        var sb = new StringBuilder();
        for(int i=0; i<a.length(); i++){
            if((a.charAt(i) == '1' && b.charAt(i)=='1') || (a.charAt(i) == '0' && b.charAt(i)=='0')){
                sb.append('0');
            }else{
                sb.append('1');
            }
        }
        System.out.println(sb);
    }
}
