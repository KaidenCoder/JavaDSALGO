package Arrays;

import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {

        int[] arr = takeInput();
        printArray(arr);
    }

    public static void printArray(int[] arr){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){

            sum = sum + arr[i];
        }
        System.out.print(sum);
    }

    public static int[] takeInput(){

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int [] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = s.nextInt();
        }
        return arr;
    }
}
