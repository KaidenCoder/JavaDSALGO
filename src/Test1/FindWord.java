package Test1;

import java.util.Scanner;

//3
//        rtoe
//        aotl
//        ttot

// Result: 8

// https://www.geeksforgeeks.org/find-all-occurrences-of-the-word-in-a-matrix/

public class FindWord {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int matrixRow = s.nextInt();
        String[] input = new String[matrixRow];
        for(int i=0;i<matrixRow;i++){
            input[i] = s.next();//string lengths may be different
        }
        char[][] matrix = new char[matrixRow][];
        for(int i = 0;i<matrixRow;i++){
            matrix[i] = new char[input[i].length()];
            for(int j=0;j<input[i].length();j++){
                matrix[i][j] = input[i].charAt(j);
            }
        }
        System.out.println(findPath(matrix, s.next()));

    }

    public static int findPath(char[][] inputMatrix, String target){
        //Write your code here


        int row = inputMatrix.length;
        int col = inputMatrix[0].length;
        int result = 0;
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                if(search(inputMatrix, i, j, target, row, col) == true){
                    result++;
                }
            }
        }
        return result;
    }

    public static boolean search(char[][] grid, int row, int col, String target, int R, int C){
        int[] x = {-1,-1,-1,0,0,1,1,1};
        int[] y = {-1,0,1,-1,1,-1,0,1};
        if(grid[row][col] != target.charAt(0)){
            return false;
        }

        int len = target.length();
        for(int i = 0; i < 8; i++){
            int k, rd = row + x[i], cd = col + y[i];
            for(k = 1; k < len; k++){
                if(rd >= R || rd < 0 || cd >= C || cd < 0){
                    break;
                }
                if(grid[rd][cd] != target.charAt(k)){
                    break;
                }
                rd += x[i];
                cd += y[i];
            }

            if(k == len){
                return true;
            }
        }
        return false;
    }
}
