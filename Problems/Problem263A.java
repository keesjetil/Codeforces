package Problems;

import java.util.Scanner;

public class Problem263A {
    public static void main(String[] args) {
        var scn = new Scanner(System.in);
        String[][] strList = new String[5][5];
        int x = -1;
        int y = -1;
        for(int i=0; i<5; i++){
            for(int j=0;j<5; j++){
                var integer = scn.nextInt();
                if(integer == 1) {
                    x = i;
                    y = j;
                    break;
                }
            }
        }
        System.out.println(Math.abs(x-2) + Math.abs(y-2));
    }
}
