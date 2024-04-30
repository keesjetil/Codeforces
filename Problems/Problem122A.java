package Problems;

import java.util.Scanner;

public class Problem122A {
    public static void main(String[] args) {
        var scn = new Scanner(System.in);
        var n = scn.nextInt();
        if(isLucky(n)){
            System.out.println("YES");
        }else{
            var foundLuck = false;
            for(int i=1; i<= n/2; i++){
                 if(n%i==0 && isLucky(i)){
                     foundLuck = true;
                     System.out.println("YES");
                     break;
                 }
            }
            if(!foundLuck) {
                System.out.println("NO");
            }
        }
    }

    private static boolean isLucky(int n) {
        var strN = String.valueOf(n);
        var lengthFours = strN
                .replaceAll("7","")
                .length();
        var lengthSevens = strN
                .replaceAll("4","")
                .length();
        if(strN.length() == (lengthFours + lengthSevens)){
            return true;
        }
        return false;
    }
}
