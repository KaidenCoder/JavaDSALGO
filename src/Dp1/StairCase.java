package Dp1;

import java.util.Scanner;

public class StairCase {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        System.out.println(staircase(m));
    }

    public static int staircase(int n){

        if(n == 0 || n == 1){
            return 1;
        }
        if(n == 2){
            return 2;
        }

        return staircase(n-3) + staircase(n-2)+ staircase(n-1);
        // 4-3 + 4 - 2 + 4 -1 = 1 + 2 + 3
        //3 + (3-3) + (3-2) + (3-1) = 3 + 0 + 1 + 2
        // 3 + 1 + 1 + 2 = 7


    }

}
