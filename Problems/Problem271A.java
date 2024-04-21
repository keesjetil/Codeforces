package Problems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Problem271A {
    public static void main(String[] args) {
        var scn = new Scanner(System.in);
        var year = scn.nextInt();
        var search = true;
        while (search) {
            year++;
            List<String> yearString = Arrays.stream(
                    String.valueOf(year).split("")
            ).toList();

            if (yearString.size() == new HashSet<>(yearString).size()) {
                search = false;
                System.out.println(year);
            }
        }
    }
}
