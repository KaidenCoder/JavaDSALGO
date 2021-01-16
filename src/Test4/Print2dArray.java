package Test4;

import java.util.Scanner;

public class Print2dArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int row = s.nextInt();
        int col = s.nextInt();
        int arr[][] = new int[row][col];

        for( int i =0; i < row; i++){
            for(int j = 0;  j < col; j++){
                arr[i][j] = s.nextInt();
            }
        }
        print2DArray(arr);
    }

    public static void print2DArray(int arr[][]) {
        // Write your code here
        int row = arr.length;
        int col = arr[0].length;

        String s = "";
        for(int i = 0; i < row; i++){
            for(int j =0; j < col; j++){
                s += arr[i][j]+ " ";
            }
            for(int k = i; k < row; k++){
                System.out.println(s);
            }
            s= "";
        }
    }
}
