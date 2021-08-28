package Leetcode;

import java.util.Arrays;

public class LargestSumAfterKNegations {
    public static void main(String[] args) {
        int nums[] = {1, 0, -5, -3};
        int k = 4;
//        int nums[] = {1,1};
//        int k = 2;
//        int nums[] = {-1, -2, -3, -4};
//        int k = 5;
        System.out.println(solve(nums, k));
    }

    public static int solve(int[] nums, int k) {
        Arrays.sort(nums);
        boolean zero = false;
        int sum = 0;
        int i= 0;
        if(nums[0] > 0){
            int a = 0;
            while(a < k){
                nums[0] = -1 * nums[0];
                a++;
            }
        }else{
            if(k <= nums.length){
                for(i = 0; i < k; i++){
                    if(nums[i] == 0) {
                        break;
                    }else{
                        sum += nums[i] * - 1;
                    }
                }
            }else if( k > nums.length){
                while(i < nums.length){
                    if(nums[i] == 0) {
                        zero = true;
                        break;
                    }else{
                        nums[i] = nums[i] * - 1;
                    }
                    i++;
                }
            }


        }

        System.out.println(i);

        if(k < nums.length){
            for(int j = i; j < nums.length; j++){

                sum += nums[j];

            }
        }else if(k > nums.length){
            Arrays.sort(nums);
            while(i < k){
                if(zero == true){
                    i++;
                }else if(zero != true){
                    nums[0] = nums[0] * -1;
                    i++;
                }

            }
            for(int b = 0; b < nums.length; b++){
                System.out.print(nums[b] + " ");
            }
            System.out.println();
            for(int b = 0; b < nums.length; b++){
                sum += nums[b];
            }
        }




        return sum;
    }
}
