package Arrays2d;

import java.util.Scanner;

public class LargestRowOrColumn {
    public static void main(String[] args) {
        Scanner s =  new Scanner(System.in);

        int rows = s.nextInt();
        int cols = s.nextInt();
        Boolean rowgreat = true;

        int [][] arr = new int[rows][cols];

        for( int i =0; i < rows; i++){
            for(int j = 0;  j < cols; j++){
                arr[i][j] = s.nextInt();
            }
        }

        int [] rowres = new int[rows];
        int max = Integer.MIN_VALUE;
        for( int i =0; i < rows; i++){
            int sum = 0;
            for(int j = 0;  j < cols; j++){
                sum += arr[i][j];

            }
//            max = Math.max(max, sum);
            rowres[i] = sum;
        }

        int [] colres = new int[cols];
        // 4 2
        // 1 2
        // 3 4
        // 5 6
        // 7 8

        for( int i =0; i < cols; i++){
            int sum = 0;
            for(int j = 0;  j < rows; j++){
                sum += arr[j][i];

            }
//            max = Math.max(max, sum);
            colres[i] = sum;
        }


        for( int i =0; i < rowres.length; i++){
            System.out.print(rowres[i] + " ");
        }

        System.out.println();

        for( int i =0; i < colres.length; i++){
            System.out.print(colres[i] + " ");
        }

        int rowmax = Integer.MIN_VALUE;
        int rowIndex=0;
        for( int i =0; i < rowres.length; i++){

            if( rowres[i] > rowmax ){
                rowmax = rowres[i];
                rowIndex = i;
            }

        }
        System.out.println();




        int colmax = Integer.MIN_VALUE;
        int colIndex=0;
        for( int i =0; i < colres.length; i++){

            if( colres[i] > colmax ){
                colmax = colres[i];
                colIndex = i;
            }

        }
        System.out.println();



        if(rowmax > colmax){
            System.out.print("row " + rowIndex + " " + rowmax);
        }else{
            System.out.print("column " + colIndex + " " + colmax);
        }


    }
}
