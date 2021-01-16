package Patterns;

import java.util.Scanner;

public class Triangular4 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 1;
        while(i <= n){
            int p = i;
            int j =1;
            while(j <=i){
                System.out.print(p);
                p = p - 1;
                j = j + 1;
            }
            System.out.println();
            i = i + 1;
        }
    }
}
