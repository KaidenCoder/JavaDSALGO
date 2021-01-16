package Recursion1;

import java.util.Scanner;

public class CheckNumberinArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int arr[] = new int[a];
        for(int i = 0; i < a; i++){
            arr[i] = s.nextInt();
        }
        int b = s.nextInt();
        Boolean res = checkNumber(arr, b);
        System.out.print(res);
    }

    public static boolean checkNumber(int input[], int x) {

        return search(input, x,0);
    }

    public static  boolean search(int input[], int target, int len){
        if(len == input.length){
            return false;
        }
        if(input[len] == target){
            return true;
        }else{
            return search(input, target, len+1);
        }
    }

}
