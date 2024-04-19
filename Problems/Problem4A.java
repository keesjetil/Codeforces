package Problems;

import java.util.Scanner;

public class Problem4A {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var w = scanner.nextInt();
        if(w==1){
            System.out.println("NO");
        }else{
            boolean printYes = false;
            for(int i=1; i<=w/2; i++){
                if(i%2 == 0 && (w-i)%2==0){
                    printYes = true;
                    break;
                }
            }

            System.out.println(printYes ? "YES" : "NO");
        }
    }
}
