package Test3;

import java.util.Scanner;

public class quiz {
    public static int [] change(int input[]){
        input = new int[5];
        input[3] = 15;
        return input;
    }

    public static void main(String args[]){
        int n = 10;
        int i;
        for(i =0; i < n; i=i+1){
            System.out.print("A" +i);
        }
        System.out.println();
        for(i =0; i < n; i=i+2){
            System.out.print("B" +i);
        }
        System.out.println();
        for(i =1; i < n; i*=2){
            System.out.print("C" +i);
        }
        System.out.println();
        for(i =n; i > 0; i/=2){
            System.out.print("D" +i);
        }
    }
}
