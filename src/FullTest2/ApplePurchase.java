package FullTest2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ApplePurchase {

    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int arr[] = new int[a];
        for(int i = 0; i < a; i++){
            arr[i] = s.nextInt();
        }
        System.out.print(helper(arr, a));
    }

    public static int helper(int arr[], int num){
        int num3 = num/3;
        int j = 0;
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> res = new ArrayList<>();
        for(int i = 0; i < num; i+=3){
            j = i;
            if(i + 3 > num){
                break;
            }
            while(j < i + 3){
                arr1.add(arr[j]);
                j++;
            }
            System.out.println("arr1" + arr1);
            Collections.sort(arr1);
            for(int k = 1; k < 3; k++){
                res.add(arr1.get(k));
            }
            System.out.println("resin " + res);
            arr1.clear();
        }
        if(num3 * 3 != num){
//            int rem = num - (num3 * 3);
            int startidx = (num3 * 3) ;
            for(int i = startidx; i < num; i++){
                res.add(arr[i]);
            }
        }
        System.out.println("Final" + res);

        int sum = 0;
        for(int i = 0;  i < res.size(); i++){
            sum += res.get(i);
        }

        return sum;

    }

}
