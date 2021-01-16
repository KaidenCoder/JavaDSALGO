package OperatorsForLoops;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int num2 = 0;
        int i = 0;

        for(i = 2; i<= num; i++){
            int count = 0;
            for(num2 = 1; num2 <= i; num2++){
                if(i%num2 == 0){
                    count = count + 1;
                }
            }
            if(count == 2){
                System.out.println(i);
            }

        }
    }
}
