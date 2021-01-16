package Recursion2;

import java.util.Scanner;

public class MergeSort {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int arr[] = new int[a];
        for(int i = 0; i < a; i++){
            arr[i] = s.nextInt();
        }
        mergeSort(arr);
    }
//    public static void mergeSort(int[] input){
//        // Write your code here
//        sort(input, 0, input.length-1);
//        for(int i = 0; i < input.length; i++){
//            System.out.print(input[i] + " ");
//        }
//    }
//
//    public static void sort(int arr[], int l, int r){
//        if(l < r){
//            int m = (l+r)/2;
//            sort(arr, l, m);
//            sort(arr, m+1, r);
//            merge(arr, l, m, r);
//        }
//    }
//
//    public static void merge(int arr[], int l, int m, int r){
//        int n1 = m - l + 1;
//        int n2 = r - m;
//
//        int L[] = new int[n1];
//        int R[] = new int[n2];
//
//        for(int i = 0; i < n1; i++){
//            L[i] = arr[l+i];
//        }
//        for(int j = 0; j < n2; j++){
//            R[j] = arr[m+1+j];
//        }
//
//        int i =0, j = 0;
//        int k = l;
//        while(i < n1 && j < n2){
//            if(L[i] <= R[j]){
//                arr[k] = L[i];
//                i++;
//            }else{
//                arr[k] = R[j];
//                j++;
//            }
//            k++;
//        }
//
//        while(i < n1){
//            arr[k] = L[i];
//            i++;
//            k++;
//        }
//        while(j <n2){
//            arr[k] = R[j];
//            j++;
//            k++;
//        }
//    }

    public static void mergeSort(int[] input){
        // Write your code here
        sort(input, 0, input.length-1);
        for(int i = 0; i < input.length; i++){
            System.out.print(input[i] + " ");
        }
    }

    public static void sort(int arr[], int l, int r){
        if(l < r){
            int m = (l+r)/2;
            sort(arr, l, m);
            sort(arr, m+1, r);
            merge(arr, l, m, r);
        }
    }

    public static void merge(int arr[], int l, int m, int r){
        int n1 = m - l + 1;
        int n2 = r - m;

        int L[] = new int[n1];
        int R[] = new int[n2];

        for(int i = 0; i < n1; i++){
            L[i] = arr[l+i];
        }
        for(int j = 0; j < n2; j++){
            R[j] = arr[m+1+j];
        }

        int i =0, j = 0;
        int k = l;
        while(i < n1 && j < n2){
            if(L[i] <= R[j]){
                arr[k] = L[i];
                i++;
            }else{
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while(i < n1){
            arr[k] = L[i];
            i++;
            k++;
        }
        while(j <n2){
            arr[k] = R[j];
            j++;
            k++;
        }
    }
}
