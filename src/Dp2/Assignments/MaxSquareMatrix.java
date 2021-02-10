package Dp2.Assignments;

public class MaxSquareMatrix {

    public static int findMaxSquareWithAllZeros(int[][] matrix){

        int rows = matrix.length, cols = rows > 0 ? matrix[0].length : 0;
        int[][] dp = new int[rows + 1][cols + 1];
        int maxsqlen = 0;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                if (matrix[i-1][j-1] == 0){
                    dp[i][j] = Math.min(Math.min(dp[i][j - 1], dp[i - 1][j]), dp[i - 1][j - 1]) + 1;
                    maxsqlen = Math.max(maxsqlen, dp[i][j]);
                }
            }
        }
        return maxsqlen;

    }

    public static void main(String[] args) {
        int[][] arr = {{1,1,0},{1,1,1},{1,1,1}};
        System.out.println(findMaxSquareWithAllZeros(arr));
    }


}
