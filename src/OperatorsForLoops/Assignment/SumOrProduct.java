package OperatorsForLoops.Assignment;

import java.util.Scanner;

public class SumOrProduct {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int input = s.nextInt();
        int choice = s.nextInt();

        int sum = 0;
        int product = 1;
        if(choice == 1){
            for(int i = 1; i <= input; i++){
                sum = sum + i;
            }
            System.out.print(sum);
        } else if(choice == 2){
            for(int i = 1; i <= input; i++){
                product = product * i;
            }
            System.out.print(product);
        } else{
            System.out.print(-1);
        }
    }
}
