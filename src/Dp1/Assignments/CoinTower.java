package Dp1.Assignments;

import java.util.Arrays;

public class CoinTower {


    public static String findWinner(int n, int x, int y) {
        //Your code goes here
        Boolean res = helper(x,y,n);
        if(res == true){
            return "Beerus";
        }else{
            return "Whis";
        }
    }

    public static boolean helper(int x, int y, int n){
        boolean[] dp = new boolean[n+1];
        Arrays.fill(dp, false);

        dp[0] = false;
        dp[1] = true;

        for(int i = 2; i<= n; i++){
            if(i-1 >= 0 && dp[i - 1] == false){
                dp[i] = true;
            } else if(i - x >= 0 && dp[i-x] == false){
                dp[i] = true;
            } else if(i - y >= 0 && dp[i-y] == false){
                dp[i] = true;
            }
            else{
                dp[i] = false;
            }
        }

        return dp[n];

    }


    public static void main(String args[])
    {
        int x = 2, y = 3, n = 4;
        String s = findWinner(n,x,y);
        System.out.println(s);
    }



}
