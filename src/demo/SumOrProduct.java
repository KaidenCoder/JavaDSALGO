package demo;

import java.util.Scanner;

public class SumOrProduct {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();

        while(t > 0){
            int a = s.nextInt();
            int choice = s.nextInt();
            System.out.print(helper(a,choice));
            t--;
        }
    }

    public static long helper(int num, int choice){
        long sum = 0;
        long product = 1;

        if(choice == 1){
            for(int i = 1; i <= num; i++){
                sum += i;
            }
            return sum;
        }
        if(choice == 2){
            for(int i = 1; i <= num; i++){
                product *= i;
            }
            return product;
        }
        return -1;
    }

}
