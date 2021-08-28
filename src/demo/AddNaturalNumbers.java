package demo;

import java.util.Scanner;

public class AddNaturalNumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long n = s.nextInt();
//        int sum = 0;
//
//        for(int i = 1; i <= n; i++){
//            sum += i;
//        }

        System.out.print((n * (n + 1))/2);
    }
}
