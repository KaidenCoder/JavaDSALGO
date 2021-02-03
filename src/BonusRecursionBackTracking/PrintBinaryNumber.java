package BonusRecursionBackTracking;

import java.util.Scanner;

public class PrintBinaryNumber {

    public static void printBinary(int n) {
        String str = "";
        printRec(str, 0, n);
    }

    private static void printRec(String number, int extraOnes, int remainingPlaces) {
        if(0 == remainingPlaces){
            System.out.println(number);
            return;
        }

        printRec(number + "1", extraOnes + 1, remainingPlaces - 1);

        if(extraOnes > 0){
            printRec(number + "0", extraOnes - 1, remainingPlaces -1);
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        printBinary(s.nextInt());
    }

}
