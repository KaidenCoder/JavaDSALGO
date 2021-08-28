package demo;

import java.util.Scanner;

public class RangeOdd {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int small = s.nextInt();
        int big = s.nextInt();
        for(int i = small; i <= big; i++){
            if(i%2 == 1){
                System.out.print(i+ " ");
            }
        }
    }

}
