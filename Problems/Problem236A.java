package Problems;

import java.util.Arrays;
import java.util.Scanner;

public class Problem236A {
    public static void main(String[] args) {
        var scn = new Scanner(System.in);
        long distinctNums = Arrays.stream(scn.next().split("")).distinct().count();
        if (distinctNums % 2 == 0) {
            System.out.println("CHAT WITH HER!");
        } else {
            System.out.println("IGNORE HIM!");
        }
    }
}
