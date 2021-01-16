package Recursion2;

import java.util.Scanner;

public class QuickSort {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int arr[] = new int[a];
        for(int i = 0; i < a; i++){
            arr[i] = s.nextInt();
        }
        quickSort(arr);
    }

    public static void quickSort(int[] input){
        // Write your code here
        sort(input, 0, input.length-1);
        for(int i = 0; i < input.length; i++){
            System.out.print(input[i] + " ");
        }

    }

    public static void sort(int arr[], int low, int high){
        if(low < high){
           int pi = partition(arr, low, high);
           sort(arr, low, pi- 1);
           sort(arr, pi+1, high);
        }
    }

    public static int partition(int[] arr, int low, int high){

        int pivot = arr[high];
        int i = low - 1;

        for(int j = low; j < high; j++){
            if(arr[j] <= pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    }
}
