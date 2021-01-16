package Patterns2;

import java.util.Scanner;

public class MirrorImage {
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

            int stars = 1;
            int b = 1;
            while(stars <= i){
                System.out.print((b));
                stars = stars + 1;
                b = b+1;
            }

            System.out.println();
            i = i + 1;
        }
    }
}
