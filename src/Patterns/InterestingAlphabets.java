package Patterns;

import java.util.Scanner;

public class InterestingAlphabets {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 1;
        while(i <= n){
            char p = (char)('A' + n -i);
            int j =1;
            while(j <=i){
                System.out.print(p);
                p = (char)(p+1);

                j = j + 1;
            }
            System.out.println();
            i = i + 1;
        }
    }
}
