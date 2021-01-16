package Arrays2d.Assignments;

import java.util.Scanner;

public class SumBoundariesDiagonals {
    public static void main(String[] args) {
        Scanner s =  new Scanner(System.in);

        int cols = s.nextInt();

        int [][] arr = new int[cols][cols];

        for( int i =0; i < cols; i++){
            for(int j = 0;  j < cols; j++){
                arr[i][j] = s.nextInt();
            }
        }

        // 1 2 3 5 (0,0) (0,1) (0,2) (0,3)
        // 4 5 6 11 (1,0) (1,1) (1,2) (1,3)
        // 7 8 9 12 (2,0) (2,1) (2,2) (2,3)
        // 1 2 3 4  (3,0) (3,1) (3,2) (3,3)

        int d1sum = 0;
        for(int i = 1; i <= cols - 2; i++){
            d1sum += arr[i][i];
        }

        int d2sum = 0;
        int j = 1;
        for(int i = cols - 2; i >= 1; i--){
            d2sum += arr[i][j];
            j = j + 1;
        }

        int r1sum = 0;
        for(int i = 0; i < cols; i++){
            r1sum += arr[0][i];
        }

        int r2sum = 0;
        for(int i = 0; i < cols; i++){
            r2sum += arr[cols-1][i];
        }

        int c1sum = 0;
        for(int i = 1; i < cols - 1; i++){
            c1sum += arr[i][0];
        }

        int c2sum = 0;
        for(int i = 1; i < cols - 1; i++){
            c2sum += arr[i][cols-1];
        }

//        System.out.println(arr[1][1]);
//        System.out.println(arr[2][2]);
        int mid = cols/2 ;
//        System.out.println(arr[mid][mid] + " Mid ");
//        System.out.println(d1sum + " d1");
//        System.out.println(d2sum + " d2");
//        System.out.println(r1sum + " r1");
//        System.out.println(r2sum + " r2");
//        System.out.println(c1sum + " c1");
//        System.out.println(c2sum + " c1");

        int totalSum = d1sum + d2sum + r1sum + r2sum + c1sum + c2sum;
        if(cols%2 == 0){

            System.out.println("Even sum: " + totalSum);
        }else{
            int totalOddSum = totalSum - arr[mid][mid];
            System.out.println("Odd sum: " + totalOddSum);
        }
    }
}
