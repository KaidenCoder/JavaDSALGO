package OperatorsForLoops.Assignment;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int rev_num = 0;
        while(num > 0){
            rev_num = rev_num * 10 + num % 10;
            num = num /10;
        }
        System.out.print(rev_num);
    }
}
