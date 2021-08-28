package demo;

import java.util.Scanner;

public class ReverseStarPattern {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();

        for(int i = 0; i < a; i++){
            for(int j = 0; j < a -i - 1; j++ ){
                System.out.print(" ");
            }
            for(int j = a-i-1; j < a ; j++ ){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
