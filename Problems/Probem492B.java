package Problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Probem492B {
    public static void main(String[] args) {
        var scn = new Scanner(System.in);
        var n = scn.nextInt();
        var l = scn.nextInt();
        var a = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            a.add(scn.nextInt());
        }
        Collections.sort(a);
        double f = Integer.MIN_VALUE;
        for(int i=0; i<a.size()-1; i++){
            double md = (double) (a.get(i+1)-a.get(i)) / 2;
            if(md > f){
                f = md;
            }
        }
        if(a.get(0) != 0){
            double md = (double) (a.get(0));
            if(md > f){
                f = md;
            }
        }
        if(a.get(a.size()-1) != l){
            double md = (double) (l-a.get(a.size() -1));
            if(md > f){
                f = md;
            }
        }

        System.out.printf("%.10f",f);
    }
}
