package Problems;

import java.util.Scanner;

public class Problem734A {
    public static void main(String[] args) {
        var scn = new Scanner(System.in);
        var n = scn.nextInt();
        var str = scn.next();
        var D = str.replaceAll("A","").length();
        var A = str.replaceAll("D","").length();
        if(D>A){
            System.out.println("Danik");
        }else if(A>D){
            System.out.println("Anton");
        }else{
            System.out.println("Friendship");
        }
    }
}
