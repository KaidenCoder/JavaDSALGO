package OperatorsForLoops.Assignment;

import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        if(num == 0 || num == 1){
            System.out.print(num);
        }

        int i = 1, result = 1;

        while(result <= num){
            i++;
            result = i * i;
        }

        System.out.print(i-1);
    }
}
