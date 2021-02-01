package Hashmaps.Assignments;

import Hashmaps.Map;

public class LongestSubsetZeroSum {

    public static int lengthOfLongestSubsetWithZeroSum(int arr[]) {

        int max_len = 0;

        for(int i = 0; i < arr.length; i++){
            int curr_sum = 0;
            for(int j = i; j < arr.length; j++){
                curr_sum += arr[j];

                if(curr_sum == 0){
                    max_len = Math.max(j - i + 1, max_len);
                }
            }
        }
        return max_len;

    }

    public static void main(String[] args) {
        int arr[] = {15, -2, 2, -8, 1, 7, 10, 23};
        int result = lengthOfLongestSubsetWithZeroSum(arr);
        System.out.print(result);
    }

}
