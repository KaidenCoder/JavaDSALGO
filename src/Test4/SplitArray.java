package Test4;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class SplitArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int arr [] = new int[a];
        for(int i = 0; i < a; i++){
            arr[i] = s.nextInt();
        }
        System.out.print(splitArray(arr));

    }

    public static boolean splitArray(int arr1[]) {
        /* Your class should be named solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
         */

        return check(arr1, 0,0,0);

//        int arr[] = new int[arr1.length];
//        for(int i = 0; i < arr1.length; i++){
//            if(arr1[i] < 0) {
//                arr[i] = -1 * arr1[i];
//            }else{
//                arr[i] = arr1[i];
//            }
//        }
//
//        Arrays.sort(arr);
//        int sum1 = 0;
//        int sum2 = 0;
//
//        for(int i = arr.length - 1;  i >= 0; i--){
//            if(arr[i]%5  == 0){
//                sum1 += arr[i];
//            }else if(arr[i]%3 == 0 && arr[i]%5 != 0){
//                sum2 += arr[i];
//            }
//        }
//        for(int i = arr.length - 1;  i >= 0; i--){
//            if(sum1 <= sum2 && arr[i]%3 != 0 && arr[i]%5 != 0){
//                sum1 += arr[i];
//            }else if(sum2 <= sum1 && arr[i]%3 != 0 && arr[i]%5 != 0){
//                sum2 += arr[i];
//            }
//        }
//
//        if(sum1 == sum2){
//            return true;
//        }else{
//            return false;
//        }


    }

    private static boolean check(int[] input, int startIndex, int lSum, int rSum) {
        if(startIndex == input.length){
            return lSum == rSum;
        }
        if(input[startIndex]%5 == 0){
            lSum += input[startIndex];
        }
        else if(input[startIndex]%3 == 0){
            rSum += input[startIndex];
        }
        else{
            boolean leftAns = check(input, startIndex+1, lSum + input[startIndex], rSum);
            boolean rightAns = check(input, startIndex+1, lSum, rSum + input[startIndex]);
            return leftAns || rightAns;
        }
        return check(input, startIndex+1, lSum, rSum);
    }
}
