package Dp2;

public class Knapsack {

    public static int knapsackI(int[] weights, int[] values, int maxWeight) {

        int n = values.length;
        int[][] dp = new int[n+1][maxWeight+1];

        for(int i=n-1; i>=0; i--){
            for(int w = 0; w<=maxWeight; w++){
                int ans;
                if(weights[i] <= w){
                    int ans1 = values[i] + dp[i+1][w - weights[i]];
                    int ans2 = dp[i+1][w];
                    ans = Math.max(ans1, ans2);
                } else {
                    ans = dp[i+1][w];
                }
                dp[i][w] = ans;
            }
        }
        return dp[0][maxWeight];
    }

    public static int knapsack(int[] weights, int[] values, int n, int maxWeight) {

        return helper(weights, values, 0, maxWeight);

    }


    public static int helper(int[] weights, int[] values, int n, int maxWeight) {

//        int n = 0;

        if(n == values.length){
            return 0;
        }

        int ans;

        if(weights[n] <= maxWeight){
            // including ith item
            int ans1 = values[n] + helper(weights, values, n + 1, maxWeight - weights[n]);
            // excluding ith item
            int ans2 = helper(weights, values, n + 1, maxWeight);
            ans = Math.max(ans1, ans2);
        } else{
            ans = helper(weights, values, n+1, maxWeight);
        }

        return ans;

    }

    public static void main(String[] args) {

        int[] weights = {12,7,11,8,9};
        int[] values = {24,13,23,15,16};

        System.out.println(knapsack(weights, values,5,26));
        System.out.println(knapsackI(weights, values,26));
    }

}
