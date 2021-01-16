package Patterns2;

import java.util.Scanner;

public class InvertedTriangle {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 1;
        while(i <= n){
            int j = 1;
            int k = n;
            while(j <= n - i + 1){
                System.out.print(k - i +1);
                j = j + 1;
            }
            System.out.println();
            i = i + 1;

        }
    }
}
