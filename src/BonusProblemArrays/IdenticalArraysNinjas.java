package BonusProblemArrays;

import java.util.Scanner;

public class IdenticalArraysNinjas {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int [] arr1 = new int[n];
        for(int i = 0; i < arr1.length; i++){
            arr1[i] = s.nextInt();
        }
        int [] arr2 = new int[n];
        for(int i = 0; i < arr2.length; i++){
            arr2[i] = s.nextInt();
        }

        int ans = minSwaps(arr1, arr2);
        System.out.print(ans);
    }

    public static int minSwaps(int[] arr1, int[] arr2){
        int count = 0;
        for(int i = 0; i < arr1.length; i++){
            if(arr1[i] != arr2[i]){
                int j = i; // 0,2
                while(arr2[j] != arr1[i]){ // 1,
                    j++;
                    if(j > arr2.length){
                        return 0;
                    }
                }
                swap(arr2, i, j); //4125
                count++;// 12
            }
        }
        return count;
    }

    public static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
