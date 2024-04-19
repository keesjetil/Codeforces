package Problems;

import java.util.Scanner;

public class Problem282A {
    public static void main(String[] args) {
        var scn = new Scanner(System.in);
        var t = scn.nextInt();
        int x = 0;
        for(int i=0; i<t; i++){
            var operation = scn.next().replace("X","");
            if(operation.equals("--")){
                x--;
            }else{
                x++;
            }
        }
        System.out.println(x);
    }
}
