package Problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Problem4C {
    public static void main(String[] args) {
        var scn = new Scanner(System.in);
        var n = scn.nextInt();
        var historyMap = new HashMap<String, Integer>();
        for(int i=0; i<n; i++){
            var str = scn.next();
            if(!historyMap.containsKey(str)){
                System.out.println("OK");
                historyMap.put(str, 0);
            }else{
                var nextNum = historyMap.get(str) + 1;
                historyMap.put(str, nextNum);
                System.out.println(str + nextNum);
            }
        }
    }
}
