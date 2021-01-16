package Patterns2.Assigment;

import java.util.Scanner;

public class SumPattern {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int i, j, N, a = 1;
        int sum = 0;
        N = s.nextInt();
        for(i = 1; i <= N; i++){
            sum = sum + i;
            for(j = 1; j <i; j++){
                System.out.print(j + "+");
            }

            System.out.print(a++);
            for(j = N; j <= N; j++){
                System.out.print('=');
            }

            System.out.print(sum);
            System.out.println();
        }

    }
}
