package Problems;

import java.util.Scanner;

public class Problem486A {
    public static void main(String[] args) {
        var scn = new Scanner(System.in);
        long n = scn.nextLong();
        if(n%2 == 0){
            System.out.println(n/2);
        }else{
            System.out.println(-(n+1)/2);
        }
    }
}
