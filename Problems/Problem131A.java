package Problems;

import java.util.Scanner;

public class Problem131A {
    public static void main(String[] args) {
        var scn = new Scanner(System.in);
        var str = scn.next();
        var subString = str.substring(1);
        var sb = new StringBuilder();
        if(str.equals(str.toUpperCase()) || subString.equals(subString.toUpperCase())){
            for(int i=0; i<str.length(); i++){
                if(Character.isLowerCase(str.charAt(i))){
                    sb.append(Character.toUpperCase(str.charAt(i)));
                }else{
                    sb.append(Character.toLowerCase(str.charAt(i)));
                }
            }
        }else{
            sb.append(str);
        }
        System.out.println(sb);
    }
}
