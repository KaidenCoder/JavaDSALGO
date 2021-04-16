package demo;

import java.util.Arrays;

public class MinimumOperations {

    public static void main(String[] args) {
        int arr[] = {1,2,1,4,1};
        int len = arr.length;
        System.out.print(minimumOperation(arr, len));
    }


    public static int minimumOperation(int[] arr, int n) {
        // Write your code here
        int num =  mostFrequent(arr, n);
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != num){
                count++;
            }
        }
        return count;
    }

    public static int mostFrequent(int arr[], int n){
        Arrays.sort(arr);
        int max_count = 1, res = arr[0];
        int curr_count = 1;
        for(int i = 1; i < n; i++){
            if(arr[i] == arr[i-1]){
                curr_count++;
            }else{
                if(curr_count > max_count){
                    max_count = curr_count;
                    res = arr[i-1];
                }
                curr_count = 1;
            }
        }
        if(curr_count > max_count){
            max_count = curr_count;
            res = arr[n-1];
        }
        return res;
    }

}
