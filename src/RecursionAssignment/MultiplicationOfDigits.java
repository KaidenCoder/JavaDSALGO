package RecursionAssignment;

import java.util.Scanner;

public class MultiplicationOfDigits {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        int n = s.nextInt();
        System.out.println(multiplyTwoIntegers( m,  n));
    }

    public static int multiplyTwoIntegers(int m, int n){
        // Write your code here
        int sum = 0;

        if(n > 0){
            return sum  + m + multiplyTwoIntegers(m, n-1);
        }


        return sum;

    }
}
