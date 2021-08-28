package Leetcode;

import java.util.Arrays;

public class MinimumMovesToEqualArray2 {

    public static void main(String[] args) {
        int nums[] = {1, 10, 2, 9};
        System.out.println(minMoves2(nums));
    }


    public static int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        int mid = 0, mid1 = 0, mid2 = 0;
        int diff = 0, diff1 = 0, diff2 = 0;
        if(len%2 == 1){
            mid = len/2;
            for(int i = 0; i < nums.length; i++){
                diff += Math.abs(nums[i] - nums[mid]);
            }
            return diff;
        } else if(len%2 == 0){
            mid1 = len/2-1;
            mid2 = len/2;
            for(int i = 0; i < nums.length; i++){
                diff1 += Math.abs(nums[i] - nums[mid1]);
                diff2 += Math.abs(nums[i] - nums[mid2]);
            }
            return Math.min(diff1, diff2);
        }

        return diff;
    }
}
