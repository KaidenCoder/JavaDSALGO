package Recursion1;

import java.util.Scanner;

public class FindIndexinArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int arr[] = new int[a];
        for(int i = 0; i < a; i++){
            arr[i] = s.nextInt();
        }
        int b = s.nextInt();
        int res = firstIndex(arr, b);
        System.out.print(res);
    }

    public static int firstIndex(int input[], int x) {

        return search(input, x,0);
    }

    public static  int search(int input[], int target, int len){
        if(len == input.length){
            return -1;
        }
        if(input[len] == target){
            return len;
        }else{
            return search(input, target, len+1);
        }
    }

}
