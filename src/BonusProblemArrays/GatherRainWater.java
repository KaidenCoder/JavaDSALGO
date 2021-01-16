package BonusProblemArrays;

import java.util.Arrays;
import java.util.Scanner;

public class GatherRainWater {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int b = s.nextInt();
        int[] arr = new int[b];
        for(int i = 0;  i < b; i++){
            arr[i] = s.nextInt();
        }
        // arr = {3,0,0,2,0,4}
        int sum = 0;
        for(int k = 0; k < b; ++k){
            int leftMax = 0;
            for(int i = 0;  i <= k - 1; ++i){
                leftMax = Math.max(leftMax, arr[i]); // 3, 3, 3, 3, 3, 4
            }

            int rightMax = 0;
            for(int i = k +1; i < b; i++){
                rightMax = Math.max(rightMax, arr[i]); // 4, 4, 4,4,4,4
            }

            int water = Math.min(leftMax, rightMax) - arr[k]; // 3 - 3 = 0
            // 3 -0 =3
            // 3 - 0 = 3
            // 3- 2 = 1
            // 3- 0 = 3
            // 4 - 4 = 0
            sum += (water > 0)? water : 0;
        }

        System.out.print(sum);

//        int sss = rain(arr);
//
//        System.out.print(sss);

    }

    public static int largestIndex(int[] arr){
        int largest = 0;
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > arr[largest]){
                largest = i;
            }
        }
        return largest;
    }

    public static int rain(int[] arr) {
        int sum = 0;
        int largest = largestIndex(arr);
        int max = arr[largest];

            for(int i =1; i <= largest;i++){
                int diff =0;

                if(arr[i-1] > arr[i]){
                    int large = 0;
                    large = Math.max(arr[i-1],large);
                    diff = large - arr[i];
                    System.out.println(large + "k");
                    sum = sum + diff;
                }else{

                }
            }


        if(((arr.length-1) - largest) > 1){
            for(int i =  arr.length - 1; i > largest;i-- ){
                int diff;
                int large = 0;
                if(arr[i] > arr[i-1]){
                    large = Math.max(arr[i],large);
                    diff = large - arr[i-1];
                    sum = sum + diff;
                }
            }
        }



        return sum;
    }
}
