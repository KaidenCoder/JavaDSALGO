package BonusRecursionBackTracking;

import java.util.Scanner;

public class NDigitNumberGivenSum {

    public static void find(int digits, int sum) {
        //Your code goes here
        char[] output = new char[digits + 1];
        for(int i = 1; i <= 9; i++){
            output[0] = (char)(i+'0');
            findHelper(digits, sum - i, output, 1);
        }
    }

    private static void findHelper(int n, int sum, char[] out, int index) {
        if(index > n || sum < 0){
            return;
        }

        if(index == n){
            if(sum == 0){
                out[index] = ' ';
                System.out.print(out);
                System.out.println();
            }
            return;
        }

        for(int i = 0; i <= 9; i++){
            out[index] = (char)(i + '0');
            findHelper(n, sum - i, out, index + 1);
        }

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int digits = s.nextInt();
        int sum = s.nextInt();

        find(digits, sum);
    }

}
