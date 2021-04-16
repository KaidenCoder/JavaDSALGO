package FullTest3;

import java.util.Scanner;

public class EvenSum {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int arr[] = new int[a];
        for(int i = 0; i < a; i++){
            arr[i] = s.nextInt();
        }

        int oddcount = 0;
        int evencount = 0;
        for(int i = 0; i < a; i++){
            if(arr[i]%2 != 0){
                oddcount++;
            }
            if(arr[i]%2 == 0){
                evencount++;
            }
        }

        int sum = 0;
        for(int i = 0; i < a; i++){
            sum += arr[i];
        }

        int res = 0;
        if(sum %2 == 0){
            if(oddcount % 2 != 0) {
                res += oddcount;
            } else if(oddcount %2 == 0 && evencount != 0){
                res += evencount;
            }
        } else if(sum%2 != 0){
            res += oddcount;
        }

        System.out.println(sum);

        System.out.print(res);

    }

}
