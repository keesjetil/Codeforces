package Problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Problem455A {
    public static void main(String[] args) {
        var scn = new Scanner(System.in);
        var n = scn.nextInt();
        var aList = new ArrayList<Integer>();
        for(int i=0; i<n; i++){
            aList.add(scn.nextInt());
        }

        Collections.sort(aList);
        int a_k = aList.get(0);
//        while( ){
//            aList.stream().filter(a -> a != a_k-1 && a != a_k + 1).collect(Collectors.toList());
//        }


    }
}
