package Problems;

import java.util.Scanner;

public class Problem58A {
    public static void main(String[] args) {
        var scn = new Scanner(System.in);
        var str = scn.next();

        String searchString = "hello";
        var index = 0;
        char searchChar = searchString.charAt(index);
        StringBuilder sb = new StringBuilder();
        while(searchChar != '0'){
            var indexSearchChar = str.indexOf(searchChar);
            if(indexSearchChar == -1){
                break;
            }else{
                sb.append(searchChar);
                if(sb.toString().equals(searchString)){
                    break;
                }
                index ++;
                searchChar = searchString.charAt(index);
                str = str.substring(indexSearchChar + 1);
            }
        }

        System.out.println(sb.toString().equals(searchString) ? "YES" : "NO");
    }
}
