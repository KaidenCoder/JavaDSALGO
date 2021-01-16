package Patterns2.Assigment;

import java.util.Scanner;

public class oddSquare {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int i, j,k,m, N;
        N = s.nextInt();

        for(i = 1; i <= (2 *N - 1); i = i + 2){
            for(j = i; j <= (2 *N - 1); j = j+2){
                System.out.print(j);
            }
            for(k = 1, m = 1  ; k < i -1 ; k=k+2){
                    System.out.print( m);
                   m = m+2 ;

            }

            System.out.println();

        }
    }
}
