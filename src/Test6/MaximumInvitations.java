package Test6;

import java.util.Scanner;

public class MaximumInvitations {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int r = s.nextInt();
        int c = s.nextInt();
        char arr[][] = new char[r][c];
        for(int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = s.next().charAt(0);
            }
        }

        //helper(arr, r, c);
       System.out.println(helper(arr, r, c));
    }

    private static int helper(char[][] arr, int row, int col) {
        int count = 2 * (row + col);
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                if(arr[i][j] != '.'){
                    count = count - 1;
                }
            }

        }
        return count-1;
    }


}
