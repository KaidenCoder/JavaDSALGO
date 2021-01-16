package BonusStringProblems;

import java.util.Scanner;

public class BinaryMatrix {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        int n = s.nextInt();

        int [][] arr = new int[m][n];

        for( int i =0; i < m; i++){
            for(int j = 0;  j < n; j++){
                arr[i][j] = s.nextInt();
            }
        }
//        3
//        4
//        1 0 0 1
//        0 0 1 0
//        0 0 0 0
//
//        Sample Output:
//
//        1 1 1 1
//        1 1 1 1
//        1 0 1 1

        // (1,2)
        // (1,0),(1,1),(1,2),(1,3)
        // (0,2),(1,2),(2,2),(3,2)
        int [][] arr2 = new int[m][n];


        for( int i =0; i < m; i++){
            for(int j = 0;  j < n; j++){
                if(arr[i][j] == 1){
                    int a = i;
                    int b = j;
                    for(int c = 0; c < n; c++){
                        arr2[a][c] = 1;
                    }
                    for(int d = 0; d < m; d++){
                        arr2[d][b] = 1;
                    }
                }
            }
        }

        for( int i =0; i < m; i++){
            for(int j = 0;  j < n; j++){
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }

    }
}
