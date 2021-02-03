package BonusRecursionBackTracking;

import java.util.Scanner;

public class PrintAllPossibleStrings {

    public static void printAllPossibleStrings(String str) {
        char[] str1 = str.toCharArray();
        helperPrint(str1, 0);
    }

    private static void helperPrint(char[] str, int index) {
        if(index == str.length){
            System.out.println(str);
            return;
        }

        if(str[index] == '?'){
            str[index] = '0';
            helperPrint(str, index+1);

            str[index] = '1';
            helperPrint(str, index);

            str[index] = '?';
        }
        else{
            helperPrint(str, index+1);
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();

        printAllPossibleStrings(str);
    }

}
