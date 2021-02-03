package Dp1;

import java.util.Scanner;

public class MinStepsToOne {

    public static int countMinStepsToOne2(int n) {
        int[] dp = new int[n+1];
        for(int i=2;i<=n;i++) {
            dp[i] = dp[i-1] + 1;
            if(i%2 == 0)
                dp[i] = Math.min(dp[i/2] + 1, dp[i]);
            if(i%3 == 0)
                dp[i] = Math.min(dp[i/3] + 1, dp[i]);
        }
        return dp[n];

    }

    public static int countMinStepsToOne(int n) {
        //Your code goes here
//        int count = 0;
//        while(n >0) {
//            if (n % 2 != 0 && n % 3 != 0) {
//                n = n - 1;
//                count++;
//            } else if (n % 3 == 0) {
//                n = n / 3;
//                count++;
//            } else {
//                n = n / 2;
//                count++;
//            }
//
//        }
//
//        return count - 1;

        int [] dp= new int[n+1];
        for(int i = 0; i < dp.length; i++){
            dp[i] = -1;
        }

        return helper(n, dp);




    }

    public static int helper(int n, int[] dp){
        if(n == 1){
            return 0;
        }
        int ans1;
        if(dp[n-1] == -1){
            ans1 = helper(n-1,dp);
            dp[n-1] = ans1;
        } else{
            ans1 = dp[n-1];
        }

        int ans2 = Integer.MAX_VALUE;

        if((n%2) == 0){
            if(dp[n/2] == -1){
                ans2 = helper(n/2,dp);
                dp[n/2] = ans2;
            }
            else{
                ans2 = dp[n/2];
            }

        }
        int ans3 = Integer.MAX_VALUE;
        if((n%3) == 0){
            if(dp[n/3] == -1){
                ans3 = helper(n/3,dp);
                dp[n/3] = ans3;
            }
            else{
                ans3 = dp[n/3];
            }
        }


        int myans = Math.min(ans1, Math.min(ans2, ans3)) + 1;
        return myans;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        System.out.println(countMinStepsToOne(m));
    }


}
