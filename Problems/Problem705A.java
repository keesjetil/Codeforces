package Problems;

import java.util.Scanner;

public class Problem705A {
    public static void main(String[] args) {
        var scn = new Scanner(System.in);
        var n = scn.nextInt();
        var sb = new StringBuilder();
        for(var i=1;i<=n; i++){
            if(i==1){
                sb.append("I hate ");
            }
            else if(i%2==1){
                sb.append("that I hate ");
            }else{
                sb.append("that I love ");
            }
        }
        sb.append("it");

        System.out.println(sb.toString());
    }
}
