package demo;

import java.util.Scanner;

public class FindMe {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int tar = s.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = s.nextInt();
        }

        System.out.print(helper(arr, tar));

    }

    public static int helper(int[] arr, int target){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                return 1;
            }
        }
        return -1;
    }
}
