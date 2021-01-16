package Recursion1;

import java.util.Scanner;

public class PrintFirstNnaturalNumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        print(a);

    }

    public static void print(int n){
        if(n == 1){
            System.out.print(n + " ");
            return;
        }
        print(n - 1);
        System.out.print(n + " ");

    }

}
