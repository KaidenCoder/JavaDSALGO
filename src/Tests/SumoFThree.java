package Tests;

import java.util.Scanner;

public class SumoFThree {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n];
        for(int i = 0; i< n; i++){
            a[i] = s.nextInt();
        }
        int len = a.length;
        for(int i = 0; i < len; i++){
            if(checkvalid(a[i])== true){
                System.out.println("true");
            }else{
                System.out.println("false");
            }
        }




    }

    public static boolean checkvalid(int digit){
        while(digit != 0){
            if(digit %3 == 2){
                return false;
            }
            digit = digit/3;
            System.out.println(digit);

        }
        return true;
    }
}
