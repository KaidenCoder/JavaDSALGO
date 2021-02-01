package BonusRecursionBackTracking;

import java.util.Scanner;

public class FindNthTerm {

    public static long Fnth_term(int n) {
        int k = 1;
        long prod = 1;
        long sum = 0;
        for(int i = 0; i < n; i++){ // i = 1
            for(int j = 0; j <= i; j++){
                prod *= k; // * 1 // 2
                k = k+1; // k = 2
            }
            //k = k+1;
            sum += prod; // sum = 1
            prod = 1;
            // System.out.println(sum);
        }
        return sum;

    }

    public static long Fnth_term2(int n) {
        return helperNth(1, 1, n);
    }

    public static long helperNth(int cal, int current, int n){
        int i;
        long curr = 1;

        if(current == n +1){
            return 0;
        }

        for(i = cal; i < cal + current; i++){
            curr *= i;
        }

        return curr + helperNth(i, current + 1, n);

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        System.out.println(Fnth_term(n));
    }


}
