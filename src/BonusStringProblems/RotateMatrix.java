package BonusStringProblems;

import java.util.Scanner;

public class RotateMatrix {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        int n = m;

        int [][] arr = new int[m][n];

        for( int i =0; i < m; i++){
            for(int j = 0;  j < n; j++){
                arr[i][j] = s.nextInt();
            }
        }
        rotate(arr);

    }

    public static void rotate(int arr[][]){
        /* Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Taking input and printing output is handled automatically.
         */

        int m = arr.length;
        int n = m;
        int [][] arr2 = new int[m][n];

        for( int i =0; i < m; i++){
            for(int j = 0;  j < n; j++){

                arr2[i][j] =  arr[j][i];

            }
        }


        for( int i =0; i < m/2; i++){
            for(int j = 0;  j < n; j++){
                int t = arr2[i][j]; // 00, 01, 02
                arr2[i][j] = arr2[m-1-i][j]; // 2
                arr2[m-1-i][j] = t;
            }
        }

        for( int i =0; i < m; i++){
            for(int j = 0;  j < n; j++){
                arr[i][j] = arr2[i][j]; // 2

            }
        }



        for( int i =0; i < m; i++){
            for(int j = 0;  j < n; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
