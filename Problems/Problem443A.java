package Problems;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Problem443A {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        var stringSet = scn.nextLine();
        stringSet = stringSet.replaceAll(", ","");
        stringSet = stringSet.replaceAll("\\{","");
        stringSet = stringSet.replaceAll("}","");
        char[] charArray = stringSet.toCharArray();
        Set<String> set = new HashSet<>();
        for(var c : charArray){
            set.add(String.valueOf(c));
        }
        System.out.println(set.size());
    }
}
