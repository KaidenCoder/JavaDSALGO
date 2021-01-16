package Test1;

import java.util.Scanner;

//Print the following pattern for given number of rows.
//        Input format :
//
//        Integer N (Total number of rows)
//
//        Output Format :
//
//        Pattern in N lines
//
//        Sample Input :
//
//        5
//
//        Sample Output :
//
//        5432*
//        543*1
//        54*21
//        5*321
//        *4321



public class test {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int i, j,k,m, N;
        N = s.nextInt();

        for(i = 1; i <= N; i++){

            for(j = N, k = N; j > i; j--){
                System.out.print(k);
                k= k - 1;
            }

            System.out.print('*');

            for(k = 1, m = i -1  ; k < i ; k++){
                System.out.print( m);
                m = m-1 ;

            }
            System.out.println();
        }
    }
}


