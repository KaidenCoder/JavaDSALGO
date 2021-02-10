package Dp2.Assignments;

public class MagicGrid {

    public static int getMinimumStrength(int[][] grid) {

        int R = grid.length;
        int C = grid[0].length;

        int dp[][] = new int[R][C];
        int m = R, n = C;

        dp[m-1][n-1] = grid[m-1][n-1] > 0 ? 1: Math.abs(grid[m-1][n-1]) + 1;

        for(int i = m-2; i >= 0; i--){
            dp[i][n-1] = Math.max(dp[i+1][n-1] - grid[i][n-1], 1);
        }

        for(int j = n -2; j >= 0; j--){
            dp[m-1][j] = Math.max(dp[m-1][j+1] - grid[m-1][j], 1);
        }

        for(int i = m - 2; i >= 0; i--){
            for(int j = n -2; j >= 0; j--){
                int minpoints = Math.min(dp[i+1][j], dp[i][j+1]);
                dp[i][j] = Math.max(minpoints - grid[i][j], 1);
            }
        }

        return dp[0][0];

    }

}
