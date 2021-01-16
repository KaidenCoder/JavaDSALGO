package Patterns2.Assigment;

import java.util.Scanner;

public class Parallelogram {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int i, j, N;
        N = s.nextInt();
        for(i = 1; i <= N; i++){
            for(j = 2; j <=i; j++){
                System.out.print(' ');
            }
            for(j = 1; j <= N; j++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
