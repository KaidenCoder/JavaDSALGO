package OperatorsForLoops.Assignment;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int[] binary = new int[1000];

        if(num == 0){
            System.out.print(0);
        }
        int i = 0;
        while(num > 0){
            binary[i] = num % 2;
            num = num /2;
            i++;
        }

        for(int j = i-1; j >= 0; j--){
            System.out.print(binary[j]);
        }


    }
}
