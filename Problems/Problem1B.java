package Problems;

import java.util.Scanner;

public class Problem1B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            var scannedItem = sc.next();
            if (scannedItem.matches("[R][0-9]\\d*[C][0-9]\\d*")) {
                translateToExcel(scannedItem);
            } else {
                translateToRowColumn(scannedItem);
            }
        }
        sc.close();

    }

    private static void translateToExcel(String scannedItem) {
        var onlyNums = scannedItem.replaceAll("[A-Z]", ",").replaceAll(",+", ",").split(",");
        var row = Integer.parseInt(onlyNums[1]);
        int col = Integer.parseInt(onlyNums[2]);

        StringBuilder sb = new StringBuilder();
        while(0 < col){
            sb.append(((char) ('A' + ((col-1) % 26))));
            col = (col-1)/26;
        }
        System.out.printf("%s%d%n", sb.reverse().toString(), row);
    }

    private static void translateToRowColumn(String scannedItem) {
        var numPart = scannedItem.replaceAll("[A-Z]", "");
        var letPart = scannedItem.replaceAll("[0-9]", "");
        double colVal = 0;
        for(int i=0; i<letPart.length(); i++ ){
            colVal += (letPart.charAt(i) % 64) * Math.pow(26,(letPart.length() - 1 - i));
        }
        int row = Integer.parseInt(numPart);
        System.out.printf("R%dC%d%n", row, (int) colVal);
    }
}
