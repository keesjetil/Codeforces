package Problems;

import java.util.Scanner;

public class Problem71A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            var word = sc.next();
            if (word.length() <= 10) {
                System.out.println(word);
            } else {
                var lSub = word.substring(1, word.length() - 1);
                System.out.println(
                        String.valueOf(word.charAt(0))
                                + lSub.length()
                                + word.charAt(word.length() - 1)
                );
            }
        }
    }
}
