package FullTest1;

import java.util.Scanner;

public class BinomialExpansion {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int A = s.nextInt();
        int X = s.nextInt();
        int n = s.nextInt();

        int fact = factorial(n);

        for(int i = 0; i < n + 1; i++){
            int nifact = factorial(n-i);
            int ifact = factorial(i);

            int Apow = (int)Math.pow(A, n - i);
            int Xpow = (int)Math.pow(X, i);

            int ans = (fact * Apow * Xpow)/ (nifact * ifact);

            System.out.print(ans + " ");

        }
    }


    public static int factorial(int n){
        int f = 1;
        for(int i = 2; i <= n; i++){
            f *= i;
        }
        return f;
    }
}
