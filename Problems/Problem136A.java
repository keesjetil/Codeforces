package Problems;

import java.util.Arrays;
import java.util.Scanner;

public class Problem136A {
    public static void main(String[] args) {
        var scn = new Scanner(System.in);
        var n = scn.nextInt();
        var strArr = new int[n];
        for(int i=1; i<=n; i++){
            strArr[scn.nextInt()-1] = i;
        }
        String finalString = Arrays.toString(strArr).replaceAll(",","").substring(1);
        System.out.println(finalString.substring(0,finalString.length()-1));
    }
}
