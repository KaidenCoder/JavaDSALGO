package RecursionAssignment;

import java.util.Scanner;

public class Staircase {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        System.out.println(staircase(m));
    }

    public static long staircase(int n){

        int[] dp = new int[n+1];
        for(int i = 0; i < dp.length; i++){
            dp[i] = -1;
        }

        return staircaseHelper(n, dp);


    }

    public static long staircaseHelper(int n, int[] dp) {
        if(n == 0 || n == 1){
            return 1L;
        }
        if(n == 2){
            return 2L;
        }

        long ans1, ans2, ans3;

        if(dp[n-1] == -1){
            ans1 = staircaseHelper(n-1, dp);
            dp[n-1] = (int) ans1;
        }else{
            ans1 = dp[n-1];
        }

        if(dp[n-2] == -1){
            ans2 = staircaseHelper(n-2, dp);
            dp[n-2] = (int) ans2;
        }else{
            ans2 = dp[n-2];
        }

        if(dp[n-3] == -1){
            ans3 = staircaseHelper(n-3, dp);
            dp[n-3] = (int) ans3;
        }else{
            ans3 = dp[n-3];
        }

        long myAns = ans1 + ans2 + ans3;
        return myAns;


    }
}
