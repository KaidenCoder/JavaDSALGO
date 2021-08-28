package demo;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        int arr[] = new int[t];
        for(int i = 0; i < t; i++){
            arr[i] = s.nextInt();
        }

        for(int i = 0; i < t; i++){
            System.out.println(reverseNumber(arr[i]));
        }
    }



    private static int reverseNumber(int num) {
        int len = String.valueOf(num).length() - 1;
        int res = 0;
        int rem = 0;
        int hun;
        while(len >= 0){
            hun =  (int)Math.pow(10, len);
            rem = num%10;
            num = num/10;

                res += hun * rem;



            len--;
        }
        return res;
    }
}
