package demo;

import java.util.Scanner;

public class NumberPattern1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int i = 0;
        while(i < a){
            int j = 0;
            while(j <= i){
                System.out.print(1);
                j++;
            }
            i++;
            System.out.println();
        }
    }

}
