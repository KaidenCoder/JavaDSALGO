package FullTest3;

import java.util.ArrayList;
import java.util.Scanner;

public class SuperPrimes {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        if(a == 1){
            System.out.print(" ");
        } else if(a == 2){
            arr.add(2);
        }


        int flag;
        if(a > 2) {
            arr.add(2);
            for (int i = 3; i < a + 1; i++) {
                flag = 1;
                for (int j = i - 1; j > 1; j--) {
                    if (i % j == 0) {
                        flag = 0;
                        break;
                    }
                }
                if (flag == 1) {
                    arr.add(i);
                }
            }
        }

        int flag2;
        if(arr.size() > 1){
            System.out.print(arr.get(1) + " ");
            if(arr.size() > 2){
                for(int i = 3; i <= arr.size(); i++){
                    flag2 = 1;
                    for(int j = i - 1; j > 1; j--){
                        if(i%j == 0){
                            flag2 = 0;
                            break;
                        }
                    }
                    if(flag2 == 1){
                        System.out.print(arr.get(i-1) + " ");
                    }
                }
            }
        }

     System.out.print(arr);
    }
}
