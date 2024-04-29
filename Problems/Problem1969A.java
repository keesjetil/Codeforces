package Problems;

import java.util.*;

public class Problem1969A {
    public static void main(String[] args) {
        var scn = new Scanner(System.in);
        var t = scn.nextInt();
        for(int i=0; i<t; i++){
            var n = scn.nextInt();
            var p = new HashMap<Integer,Integer>();
            for(var j=1;j<=n;j++){
                p.put(j,scn.nextInt());
            }
            var startKey = 0;
            var cyclicLengths = new ArrayList<Integer>();
            while(startKey != n){
                startKey ++;
                var histList = new ArrayList<Integer>();
                while (!histList.contains(startKey)) {
                    histList.add(startKey);
                    startKey = p.get(startKey);
                }
                cyclicLengths.add(histList.size());
            }
            var minimum = Collections.min(cyclicLengths);
            if(minimum > 2){
                System.out.println(3);
            }else{
                System.out.println(minimum);
            }
        }
    }
}
