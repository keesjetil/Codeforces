package Problems;

import java.util.Arrays;
import java.util.Scanner;

public class Problem339A {
    public static void main(String[] args) {
        var scn = new Scanner(System.in);
        var arr = Arrays.stream(scn.next().split("\\+")).sorted().toList();
        var sb = new StringBuilder();
        for(int i=0; i< arr.size(); i++){
            sb.append(arr.get(i));
            if(i!=arr.size()-1){
                sb.append("+");
            }
        }
        System.out.println(sb.toString());

    }
}
