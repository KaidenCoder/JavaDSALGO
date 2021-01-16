package Patterns2.Assigment;

import java.util.Scanner;

public class HalfDiamondPattern {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int i, j, N;
        N = s.nextInt();
        System.out.println('*');
        for(i = 1; i <= N; i++){
            for(j = N; j < N+ 1; j++){
                System.out.print('*');
            }
            for(j = 1; j <= i; j++){
                System.out.print(j);
            }
            for(j = i -1; j >= 1; j--){
                System.out.print(j);
            }
            for(j = N; j < N+ 1; j++){
                System.out.print('*');
            }
            System.out.println();
        }

        for(i = N-1; i>0; i--){
            for(j= N; j < N+1; j++){
                System.out.print('*');
            }
            for(j = 1; j<=i; j++){
                System.out.print(j);
            }
            for(j=i-1; j>=1; j--){
                System.out.print(j);
            }
            for(j= N; j < N+1; j++){
                System.out.print('*');
            }
            System.out.println();
        }
        System.out.println('*');
    }
}
//        int n = s.nextInt();
//        int i = 1;
//        while(i <= 2*n +1){
//            int spaces = 2*n;
//            while(spaces < (2*n + 1)){
//                System.out.print('*');
//                spaces = spaces + 1;
//            }
//
//            int num = i - 1;
//            while(num > 0 && num <= n - 1){
//                System.out.print(num);
//                num = num + 1;
//            }
//
//            int num2 = i-1;
//            while(num2 > 0 && num2 <= n){
//                System.out.print(num2);
//                num2 = num2 - 1;
//            }
//
//            int dec = i-1;
//            while(dec >= 1 && i <= (n/2 + 1)){
//                System.out.print('*');
//                dec = dec - 1;
//            }
//            System.out.println();
//            i = i + 1;
//        }

//        int j = 1;
//        while(j < (n/2 + 1)){
//            int k = 1;
//            while(k <= j){
//                System.out.print(" ");
//                k = k +1;
//            }
//
//            int num = j;
//            while(num < n/2 + 1 && i > (n/2 + 1) ){
//                System.out.print('*');
//                num = num + 1;
//            }
//
//            int dec = j+1;
//            while(dec < (n/2 + 1) && j <= (n/2 + 1)){
//                System.out.print('*');
//                dec = dec + 1;
//            }
//
//            System.out.println();
//            j = j + 1;
//
//        }

//    }
//}
