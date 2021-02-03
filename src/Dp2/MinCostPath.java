package Dp2;

public class MinCostPath {

    public static int minCostPath(int[][] grid) {

        return minCostHelper(grid, 0, 0);

//        int col = grid.length;
//        int row = grid[0].length;
//
//        for(int i = 0; i < col; i++){
//            for(int j = 0; j < row; j++){
//                if(i == 0 && j == 0){
//                    continue;
//                }
//
//                if(i == 0){
//                    grid[i][j] = grid[i][j] + grid[i][j - 1];
//                }
//                else if(j == 0){
//                    grid[i][j] = grid[i][j] + grid[i-1][j];
//                }
//                else{
//                    grid[i][j] = Math.min(grid[i][j-1], grid[i-1][j]) + grid[i][j];
//                }
//
//            }
//        }
//
//        return grid[grid.length-1][grid[0].length-1];

    }

    public static int minCostHelper(int[][] cost, int i, int j){

        int m = cost.length;
        int n = cost[0].length;

        // Base Case
        if(i >= m || j >= n){
            return Integer.MAX_VALUE;
        }

        if( i == m-1 && j == n-1){
            return cost[i][j];
        }

        int ans1 = minCostHelper(cost, i+1, j);
        int ans2 = minCostHelper(cost, i, j+1);
        int ans3 = minCostHelper(cost, i+1, j+1);

        int myAns = cost[i][j] + Math.min(ans1, Math.min(ans2, ans3));
        return myAns;

    }

    public static int minCostMem(int[][] cost, int i, int j, int[][] dp){

        int m = cost.length;
        int n = cost[0].length;

        // Base Case
        if(i >= m || j >= n){
            return Integer.MAX_VALUE;
        }

        if( i == m-1 && j == n-1){
            return cost[i][j];
        }

        int ans1,ans2, ans3;

        if(dp[i+1][j] == Integer.MAX_VALUE){
            ans1 = minCostMem(cost, i+1, j, dp);
            dp[i+1][j] = ans1;
        } else{
            ans1 = dp[i+1][j];
        }

        if(dp[i][j+1] == Integer.MAX_VALUE){
            ans2 = minCostMem(cost, i, j+1, dp);
            dp[i][j+1] = ans2;
        } else{
            ans2 = dp[i][j+1];
        }

        if(dp[i+1][j+1] == Integer.MAX_VALUE){
            ans3 = minCostMem(cost, i+1, j+1, dp);
            dp[i+1][j+1] = ans3;
        } else{
            ans3 = dp[i+1][j+1];
        }


        int myAns = cost[i][j] + Math.min(ans1, Math.min(ans2, ans3));
        return myAns;

    }

    public static int minCostI(int[][] cost){
        int m = cost.length;
        int n = cost[0].length;

        int[][] dp = new int[m+1][n+1];
        for(int i =0; i < dp.length; i++){
            for(int j = 0; j < dp[i].length; j++){
                dp[i][j] = Integer.MAX_VALUE;
            }
        }

        for(int i =m-1; i >= 0; i--){
            for(int j = n-1; j >= 0; j--){
                if(i == m -1 && j == n-1){
                    dp[i][j] = cost[i][j];
                    continue;
                }
               int ans1 = dp[i][j+1];
               int ans2 = dp[i+1][j];
               int ans3 = dp[i+1][j+1];
               dp[i][j] = cost[i][j] + Math.min(ans1, Math.min(ans2, ans3));
            }
        }

        return dp[0][0];

    }


    public static void main(String[] args) {

        int[][] cost = {{1,5,11},{8,13,12},{2,3,7},{15,16,18}};
        int[][] dp = new int[cost.length+1][cost[0].length+1];
        for(int i =0; i < dp.length; i++){
            for(int j = 0; j < dp[0].length; j++){
                dp[i][j] = Integer.MAX_VALUE;
            }
        }


        System.out.println(minCostPath(cost));
        System.out.println(minCostMem(cost, 0,0, dp));
        System.out.println(minCostI(cost));

    }



}


