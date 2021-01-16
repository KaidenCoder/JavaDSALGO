package Patterns2;

import java.util.Scanner;

public class TriangleOfNumbers {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 1;
        while(i <= n){
            int spaces = 1;
            while(spaces <= n-i){
                System.out.print(' ');
                spaces = spaces + 1;
            }
            int  k = 1;

            int num = i;
            while(k <= i){
                System.out.print(num);
                num = num + 1;
                k = k + 1;

            }

            int l = i -1;
            int m = 0;
            int dec = i ;
            while(l >= 1){
                System.out.print(dec + l -1 );
//                dec = dec - 1;
                l = l - 1;
            }

            System.out.println();
            i = i + 1;
        }
    }
}
