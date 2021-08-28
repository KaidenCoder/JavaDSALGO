package BinarySearch.IO;

import java.util.Arrays;
import java.util.Map;

public class SumOfTwoNumbersLessThanTarget {
//
//    static  int[] arr = {5, 1, 2, 3};
//    static int target = 4;
//    static  int[] arr = {3, 1, 2, 3};
//    static int target = 5;
//    static  int[] arr = {-4, -4, -3, -3};
//    static int target = -6;
    public static void main(String[] args) {

//        int []arr = {-2, -3, -1};
//        int target = -4;
        int []arr = {1, 2, 3, 4};
        int target = 7;
//        int []arr = {1, 2, 2, 4};
//        int target = 5;
//        int []arr = {1, 4, 1, 4};
//        int target = 3;
       System.out.print(solve(arr, target));
    }


    public static int solve(int[] nums, int target) {
        int idx = 0;

        Arrays.sort(nums);


        for(int i = 0; i < nums.length; i++){

            if(nums[i] >= target){
                idx=i;
                break;

            }
        }

        System.out.println("idx " +  idx);


        int maxsum = 0, a = 0, b = 0;

        // Find the required pair
        for (int i = 0; i < idx; i++)
        {
            for (int j = i + 1; j < idx; j++)
            {
                if (nums[i] + nums[j] < target &&
                        nums[i] + nums[j] > maxsum)
                {
                    maxsum = nums[i] + nums[j];

                    a = nums[i];
                    b = nums[j];
                }
            }
        }

        return a + b;


//        if(nums.length == 3){
//            int max = Integer.MIN_VALUE;
//            for(int i = 0; i < nums.length - 1; i++){
//                for(int j = i + 1; j < nums.length; j++){
//                    if((nums[i] + nums[j]) < target){
//                        System.out.println(nums[i] + nums[j]);
//                        max = Math.max(max, nums[i] + nums[j]);
//                    }
//                    if((nums[i] + nums[j]) >= target){
//                        break;
//                    }
//                }
//            }
//            return max;
//        }

//        int max2 = Integer.MIN_VALUE;
//        if(idx == 0){
//            for(int i = 0; i < nums.length; i++){
//                for(int j = i + 1; j < nums.length; j++){
//                    if(nums[i] + nums[j] < target){
//                        max2 = Math.max(max2, nums[i] + nums[j]);
//                    }
//                }
//            }
//        }else if(idx == nums.length - 1){
//            for(int i = 0; i < nums.length-1; i++){
//                for(int j = i + 1; j < nums.length; j++){
//                    int sum = nums[i] + nums[j];
//                    System.out.println("sum " + sum);
//                    if(nums[i] + nums[j] < target){
//                        max2 = Math.max(max2, nums[i] + nums[j]);
//                    }
//                    if(nums[i]  >= target || nums[j] >= target){
//                        return max2;
//                    }
//                }
//            }
//
//        } else{
//            for(int i = 0; i <= idx-1; i++){
//                for(int j = i + 1; j <= idx; j++){
//                    if(nums[i] + nums[j] < target){
//                        max2 = Math.max(max2, nums[i] + nums[j]);
//                    }
//                    if(nums[i]  >= target || nums[j] >= target){
//                        return max2;
//                    }
//                }
//            }
//
//        }
//
//
//
//
//        return max2;


    }

}
