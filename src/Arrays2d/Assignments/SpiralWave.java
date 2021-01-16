package Arrays2d.Assignments;

import java.util.Scanner;

public class SpiralWave {
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



        // 1 2 3 5 (0,0) (0,1) (0,2) (0,3)
        // 4 5 6 11 (1,0) (1,1) (1,2) (1,3)
        // 7 8 9 12 (2,0) (2,1) (2,2) (2,3)
        // 1 2 3 4  (3,0) (3,1) (3,2) (3,3)

        int a = 0, b = 0;

        while (a < rows &&  b < cols) {

            // 1st row
            for (int i = b; i < cols; i++) {
                System.out.print(arr[a][i] + " ");
            }
            a++;

            // last column
            for (int i = a; i < rows; i++) {
                System.out.print(arr[i][cols - 1] + " ");
            }
            cols--;

            // last row
            if(a < rows){
                for (int i = cols - 1; i >= b; i--) {
                    System.out.print(arr[rows - 1][i] + " ");
                }
                rows--;
            }


            // first column
            if(b < cols){
                for (int i = rows - 1; i >= a; i--) {
                    System.out.print(arr[i][b] + " ");
                }
                b++;
            }


        }



//        for(int i = 1; i  < rows - 2; i++){
//            System.out.print(arr[1][i] + " ");
//        }
//
//        for(int i = 1; i  < rows - 1; i++){
//            System.out.print(arr[i][rows-2] + " ");
//        }
//
//        for(int i = cols-3; i  > 0; i--){
//            System.out.print(arr[2][i] + " ");
//        }

    }
}
