package BonusProblemArrays;

import java.util.Scanner;

public class SearchinAnArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();

        int arr [] = new int[a];

        for(int i = 0; i < a; i++){
            arr[i] = s.nextInt();
        }
        int c = s.nextInt();

        int result = searchIndex(arr, c);
        System.out.print(result);

    }

    public static int searchIndex(int[] arr,int c) {

        for(int i = 0; i< arr.length; i++){
            if(arr[i] == c){
                return i;
            }
        }
        return -1;
    }
}
