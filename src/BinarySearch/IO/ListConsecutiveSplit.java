package BinarySearch.IO;

import java.util.Arrays;

public class ListConsecutiveSplit {

    public static void main(String[] args) {
        int nums[] = {0};
        int k = 1;
        System.out.println(solve(nums, k));
    }

    public static boolean solve(int[] nums, int k) {
        Arrays.sort(nums);
        int idx = 1;
        for(int i = 0; i < nums.length-1; i++){
            if(nums[i] >= nums[i+1]){
                idx = i+1;
                break;
            }
        }

        if(idx == k && 2*k <= nums.length){
            return true;
        }

        return false;
    }

}
