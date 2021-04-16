package demo;

import java.util.Scanner;

public class CountNumberOfWaysToCoverADistance {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int t  = s.nextInt();


        int arr[] = new int[t];
        for(int i = 0; i < arr.length; i++){
            arr[i] = s.nextInt();
        }

        for(int i = 0; i < arr.length; i++){
            System.out.println(helper(arr[i]));
        }



    }

    public static long helper(int n){
//        if(n < 0){
//            return 0;
//        }
//        if(n == 0){
//            return 1;
//        }
//
//        return helper(n-1) + helper(n-2) + helper(n-3);
        int count[] = new int[n+1];

        count[0] = 1;
        if(n >= 1){
            count[1] = 1;
        }
        if(n >= 2){
            count[2] = 2;
        }

        for(int i = 3; i <= n; i++){
            count[i] = count[i-3] + count[i-2] + count[i-1];
        }
        long M = 1000000007;


        return  (count[n]%M);
    }

}
