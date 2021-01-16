package Arrays2d;

import java.util.Scanner;

public class RowWiseSum {
    public static void main(String[] args) {
        Scanner s =  new Scanner(System.in);

        int rows = s.nextInt();
        int cols = s.nextInt();

        int [][] arr = new int[rows][cols];

        for( int i =0; i < rows; i++){
            for(int j = 0;  j < cols; j++){
                arr[i][j] = s.nextInt();
            }
        }

        int [] res = new int[rows];

        for( int i =0; i < rows; i++){
            int sum = 0;
            for(int j = 0;  j < cols; j++){
                sum += arr[i][j];

            }
            res[i] = sum;
        }

        for( int i =0; i < rows; i++){
            System.out.print(res[i] + " ");
        }

    }
}
