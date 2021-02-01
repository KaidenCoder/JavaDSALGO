package BonusRecursionBackTracking;

import java.util.Scanner;

public class PrintAllPossibleStrings {

    public static void printAllPossibleStrings(String str) {
        char[] str1 = str.toCharArray();
        helperPrint(str1, 0);
    }

    private static void helperPrint(char[] str1, int i) {

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();

        printAllPossibleStrings(str);
    }

}
