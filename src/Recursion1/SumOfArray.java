package Recursion1;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int arr[] = new int[a];
        for(int i = 0; i < a; i++){
            arr[i] = s.nextInt();
        }
        int res = sum(arr);
        System.out.print(res);
    }

    public static int sum(int input[]) {
       if(input.length == 1 ){
           return input[input.length - 1];
       }else{
           return input[0] + sum(Arrays.copyOfRange(input,1, input.length));
       }
        //sum(input, 0)
    }
//
//    public static int sum(int input[], int start){
//        if(start == input.length){
//            return 0;
//        }
//        return input[start] + sum(input, start + 1);
//    }

}
