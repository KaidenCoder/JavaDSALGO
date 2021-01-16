package OperatorsForLoops;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int a = 0, b = 1;
        int sum;
        for(int i = 1; i <= num;i++){
            sum = a + b;
            a = b;
            b =  sum;
        }

        System.out.print(a);
    }
}
