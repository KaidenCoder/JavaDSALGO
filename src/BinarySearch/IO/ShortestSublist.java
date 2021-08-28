package BinarySearch.IO;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ShortestSublist {

    public static void main(String[] args) {
//        int nums[] = {0,1,4,3,8,9};
        int nums[] = {2,2,0};
        System.out.print(solve(nums));
    }



    public static int solve(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i]) + 1);
            }else{
                map.put(nums[i], 1);
            }
        }

        int dupCount = 0;

        for(Integer val: map.values()){
            if(val > 1){
                dupCount++;
            }
        }
        System.out.println("map " +  map);
        System.out.println("dupCount " +  dupCount);


        int arr[] = new int[nums.length];

        for(int i = 0; i < nums.length; i++){
            arr[i] = nums[i];
        }

        Arrays.sort(nums);
        int count = 0;

        for(int i = 0; i < nums.length; i++){
            if(arr[i] != nums[i]){
                count++;
            }
        }

        return count + dupCount;
    }
}
