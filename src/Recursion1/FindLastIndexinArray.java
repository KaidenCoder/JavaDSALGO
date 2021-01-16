package Recursion1;

import java.util.Scanner;

public class FindLastIndexinArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int arr[] = new int[a];
        for(int i = 0; i < a; i++){
            arr[i] = s.nextInt();
        }
        int b = s.nextInt();
        int res = lastIndex(arr, b);
        System.out.print(res);
    }

    public static int lastIndex(int input[], int x) {
        int len = input.length;
        return search(input, x,len-1);
    }

    public static  int search(int input[], int target, int len){
        if(len < 0){
            return -1;
        }
        if(input[len] == target){
            return len;
        }
        return search(input, target, len-1);
    }

}
