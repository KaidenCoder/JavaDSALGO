package OperatorsForLoops.Assignment;

import java.util.Scanner;

public class TermsAP {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int count = 0;
        for(int i = 1; i < 2*num && count < num; i++){
            int digit = (3*i) + 2;
            if(digit % 4 != 0){
                count = count + 1;
                System.out.print(digit + " ");
            }
        }
    }
}
