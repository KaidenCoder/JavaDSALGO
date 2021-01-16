package TimeComplexity;

import java.util.Scanner;

public class ArrayEuilibriumIndex {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int arr[] = new int[a];
        for(int i =0; i < a; i++){
            arr[i] = s.nextInt();
        }
        int res = arrayEquilibriumIndex(arr);
        System.out.println(res);
    }
    public static int arrayEquilibriumIndex(int[] arr){
        int leftSum = 0;
        int totalSum = 0;
        for(int i = 0; i < arr.length; i++){
            totalSum += arr[i];
        }

        int index =0;
        int rightSum = totalSum;

        while( index  < arr.length){
            leftSum += arr[index];
            if(rightSum != leftSum){
                rightSum -= arr[index];

            }else if(rightSum == leftSum){
                return index;
            }
            index = index + 1;
        }

        return -1;
    }
}
