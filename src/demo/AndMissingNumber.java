package demo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class AndMissingNumber {

    public static void main(String[] args) {
        //1 3 4 5 5 6 7 8 9 10
        int arr[] = {1,3,4,5,5,6,7,8,9,10};
      //  int arr[] = {1,2,3,4,4,5};
        int a = arr.length;
        int res[] = findRepeatingAndMissingNumbers(arr);
        for(int i = 0; i < res.length; i++){
            System.out.print(res[i] + " ");
        }
    }

    public static int[] findRepeatingAndMissingNumbers(int[] nums) {
        // Write your code here
        Map<Integer, Boolean> map = new HashMap<>();
        int dup = 0;

        int missing = 0;

        for(int i = 0; i < nums.length; i++){
            if(map.get(nums[i]) == null){
                map.put(nums[i], true);
            } else{
                dup = nums[i];
            }
        }

        for(int i =1; i <= nums.length; i++){
            if(map.get(i) == null){
                missing = i;
                break;
            }
        }
//        Arrays.sort(nums);
//        int dup = mostFrequent(nums, nums.length);
//
//        int missing = 0;
//        int idx = 0;
//        for(int i = 0; i < nums.length ; i++){
//            if(nums[i] == dup){
//               idx = i;
//               break;
//            }
//        }
//
//        if((idx + 2) < nums.length){
//            if((nums[idx+2] - nums[idx]) == 1){
//                missing = nums[idx] + 2;
//            }
//            if((nums[idx+2] - nums[idx]) == 2){
//                missing = nums[idx] + 1;
//            }
//
//
//        } else{
//            for(int i = 0; i < nums.length ; i++){
//                if(nums[i] != i+1){
//                    missing = i+1;
//                    break;
//                }
//            }
//        }
//
//
//
        int res[] = new int[2];
        res[0] = dup;
        res[1] = missing;

        return res;
    }

    public static int mostFrequent(int arr[], int n){

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
