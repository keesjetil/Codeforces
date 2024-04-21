package Problems;

import java.util.Scanner;

public class Problem110A {
    public static void main(String[] args) {
        var scn = new Scanner(System.in);
        var num = scn.next();
        var str = num.replaceAll("[01235689]","");
        if(str.length() == 4 || str.length() == 7){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
