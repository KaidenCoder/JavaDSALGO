package Recursion3;

import java.util.Arrays;
import java.util.Scanner;

public class TriangleArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for(int i = 0;  i < n; i++){
            arr[i] = s.nextInt();
        }
        printTriangle(arr);


    }

    private static void printTriangle(int[] arr) {
        if(arr.length < 1){
            //System.out.print(Arrays.toString(arr));
//            System.out.print(arr[0]);
            return;
        }
        int[] temp = new int[arr.length - 1];
        for(int i = 0; i < arr.length - 1; i++){
            int x = arr[i] + arr[i+1];
            temp[i] = x;
        }
//        if(temp.length == 1){
//            System.out.println(temp[0]);
//        }

        printTriangle(temp);
        if(arr.length == 1){
            System.out.println(arr[0]);
        }
//        System.out.println(Arrays.toString(arr));

    }
}
