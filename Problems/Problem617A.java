package Problems;

import java.util.Scanner;

public class Problem617A {
    public static void main(String[] args) {
        var scn = new Scanner(System.in);
        var distance = scn.nextInt();
        if(distance%5 == 0){
            System.out.println(distance / 5);
        }else{
            System.out.println((distance / 5) + 1);
        }
    }
}
