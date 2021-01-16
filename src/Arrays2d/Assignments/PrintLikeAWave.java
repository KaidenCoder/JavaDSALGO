package Arrays2d.Assignments;

import java.util.Scanner;

public class PrintLikeAWave {
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

        int a = 0;
        int b = 0;
        int bb = 0;
        while(a <= rows && b <= cols){
            if(a%2 == 0){
                for(int aa = 0; aa < rows; aa++){
                    System.out.print(arr[aa][bb] + " ");
                }
                bb = bb +1;
                a= a + 1;
                b = b + 1;
            }else{
                for(int aaa = rows - 1; aaa > -1; aaa--){
                    System.out.print(arr[aaa][bb] + " ");
                }
                bb = bb + 1;
                a =a+1;
                b = b + 1;
            }
        }


    }
}
