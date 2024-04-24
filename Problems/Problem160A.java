package Problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Problem160A {
    public static void main(String[] args) {
        var scn = new Scanner(System.in);
        var n = scn.nextInt();
        var intArray = new ArrayList<Integer>();
        for(int i=0; i<n; i++){
            intArray.add(scn.nextInt());
        }
        intArray.sort(Collections.reverseOrder());
        var sumMyCoins = 0;
        var totalCoins = 0;
        var sumTwinCoins = 0;
        while(sumMyCoins <= sumTwinCoins){
            sumMyCoins += intArray.get(0);
            totalCoins ++;
            intArray.remove(0);
            sumTwinCoins = intArray.stream().reduce(0, Integer::sum);

        }
        System.out.println(totalCoins);
    }
}
