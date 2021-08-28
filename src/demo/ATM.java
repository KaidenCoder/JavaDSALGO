package demo;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int w = s.nextInt();
        double t = s.nextDouble();

        if(w%5 == 0 && w+0.5 <= t){
            double result = t - w - 0.5;
            System.out.printf("%.2f",result);
        } else {
            System.out.printf("%.2f",t);
        }
    }
}
