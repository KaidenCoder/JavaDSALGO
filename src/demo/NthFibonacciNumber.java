package demo;

import java.util.Scanner;

public class NthFibonacciNumber {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int arr[] = new int[a];
        // 0 1 1 2 3
        arr[0]= 0;
        arr[1] = 1;
        for(int i = 2; i < arr.length; i++){
            arr[i] = arr[i -1] + arr[i-2];
        }

        System.out.print(arr[arr.length-1]);

    }

}
