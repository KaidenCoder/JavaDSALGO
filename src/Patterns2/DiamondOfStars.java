package Patterns2;

import java.util.Scanner;

public class DiamondOfStars {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 1;
        while(i <= n/2 +1){
            int spaces = 1;
            while(spaces <= (n/2 + 1) - i){
                System.out.print(' ');
                spaces = spaces + 1;
            }

            int num = 1;
            while(num <= i && i <= (n/2+1)){
                System.out.print('*');
                num = num + 1;
            }

            int dec = i-1;
            while(dec >= 1 && i <= (n/2 + 1)){
                System.out.print('*');
                dec = dec - 1;
            }
            System.out.println();
            i = i + 1;
        }

        int j = 1;
        while(j < (n/2 + 1)){
            int k = 1;
            while(k <= j){
                System.out.print(" ");
                k = k +1;
            }

            int num = j;
            while(num < n/2 + 1 && i > (n/2 + 1) ){
                System.out.print('*');
                num = num + 1;
            }

            int dec = j+1;
            while(dec < (n/2 + 1) && j <= (n/2 + 1)){
                System.out.print('*');
                dec = dec + 1;
            }

            System.out.println();
            j = j + 1;

        }

    }
}
