package demo;

import java.util.Scanner;

public class SumIsEverywhere {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long n = s.nextInt() * 2;

        long odd = 0, even = 0;

        for(long i = 1; i <= n; i++){
            if(i%2 == 1){
                odd += i;
            }else{
                even += i;
            }
        }
        System.out.print(odd + " " + even);

    }
}
