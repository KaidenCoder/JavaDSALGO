package RecursionAssignment;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        System.out.println(sumOfDigits(num));
    }

    public static int sumOfDigits(int input){
        // Write your code here
        int sum = 0;

        if(input > 0){
            return sum  + input %10 +  sumOfDigits(input/10);
        }


        return sum;

    }
}
