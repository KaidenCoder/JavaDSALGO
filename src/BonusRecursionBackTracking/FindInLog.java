package BonusRecursionBackTracking;

import java.util.Scanner;

public class FindInLog {

    public static long lnfact(int n) {
        //Your code goes here

        return (long)helper(n);

    }

    public static double helper(int n){
        if(n == 1){
            return 0;
        }
        double total = helper(n-1) + Math.log(n);
        return total;
    }

    public static long lnfact2(int n) {
        //Your code goes here
        if(n == 1){
            return 0;
        }
        return (long)(lnfact2(n-1) + Math.log(n));

    }


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();

        System.out.println(lnfact2(N));
    }

    public static long fact(int N){
        long i,fact=1;
        for(i=1;i<=N;i++){
            fact=fact*i;
        }
        return fact;
    }
}
