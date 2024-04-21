package Problems;

import java.util.Scanner;

public class Problem96A {
    public static void main(String[] args) {
        var scn = new Scanner(System.in);
        var str = scn.next();
        int streak = 0;
        boolean one = true;
        boolean printYes = false;
        for(int i=0; i<str.length(); i++){
            if(one && str.charAt(i)=='1'){
                streak ++;
                if(streak == 7){
                    printYes = true;
                    break;
                }
            }else if(!one && str.charAt(i)=='0') {
                streak ++;
                if(streak == 7){
                    printYes = true;
                    break;
                }
            }else if(!one && str.charAt(i)=='1') {
                streak = 1;
                one=true;
            }else if(one && str.charAt(i)=='0') {
                streak = 1;
                one=false;
            }
        }
        System.out.println(printYes ? "YES" : "NO");
    }
}
