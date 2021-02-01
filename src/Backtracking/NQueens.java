package Backtracking;

public class NQueens {

    public static void main(String[] args) {
        placeNQueens(4);
    }

    public static void placeNQueens(int n){

        /* Your class should be named Solution.
         * Don't write main() function.
         * Don't read input, it is passed as function argument.
         * Print output as specified in the question
         */
        int board[][] = new int[n][n];

        if((solvePuzzle(board, 0) == true)){
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(board[j][i]
                            + " ");
                }
            }
            System.out.println();
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(board[i][j]
                            + " ");
                }
            }
        }





    }



    private static boolean solvePuzzle(int[][] board, int col) {
        if(col >= board.length){
            return true;
        }

        for(int i = 0; i < board.length; i++){
            if(isSafe(board, i, col)){
                board[i][col] = 1; // 1,1
                if(solvePuzzle(board, col + 1) == true){
                    return true;
                }
                board[i][col] = 0;
            }
        }

        return false;

    }

    public static boolean isSafe(int board[][], int row, int col){

        int i, j;

        for(i = 0; i < col; i++){ //
            if(board[row][i] == 1){ // 1,0
                return false;
            }
        }

        for(i = row, j = col; i >= 0 && j >= 0; i--, j--){
            if(board[i][j] == 1){
                return false;
            }
        }

        for(i = row, j = col; j >= 0 && i < board.length; i++, j--){
            if(board[i][j] == 1){
                return false;
            }
        }

        return true;

    }


}
