package Recursion1;

import java.util.Scanner;

public class NumberOfDigits {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int res = count(a);
        System.out.println(res);

    }

    public static int count(int n){
        if(n == 0){
            return 0;
        }

        int smallAns = 1 + count(n / 10);
        return smallAns ;
    }

}
