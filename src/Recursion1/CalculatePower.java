package Recursion1;

import java.util.Scanner;

public class CalculatePower {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int res = power(a,b);
        System.out.println(res);
    }

    public static int power(int x, int n) {
        /* Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
         */
        int res = 1;
        if(n == 0){
            return 1;
        }

        res = power(x, n -1) * x;
        return res;

    }
}
