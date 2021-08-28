package BinarySearch.IO;

import java.util.ArrayList;
import java.util.Collections;

public class SplitList {

//    static int[] nums = {5, 3, 2, 7, 9};
//    static int[] nums = {0,1 };
//    static int[] nums = {0,2,1 };
//    static int[] nums = {1,2,0 };
//    static int[] nums = {0,0,1 };
    static int[] nums = {0,3, 0, 1 };
    public static void main(String[] args) {
        System.out.println(solve(nums));
    }

    public static boolean solve(int[] nums) {
        int idx = helper(nums);
        System.out.println(idx);

        if(idx == nums.length-1){
            return false;
        }

        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2= new ArrayList<>();

        for(int i = 0; i <= idx; i++){
            arr1.add(nums[i]);
        }

        for(int i = idx+1; i < nums.length; i++){
            arr2.add(nums[i]);
        }

        Collections.sort(arr1);
        System.out.println("arr1 " + arr1);
        System.out.println("arr2 " + arr2);

        int tar = arr1.get(arr1.size()-1);
        System.out.println("tar " + tar);
        boolean bool = false;
        int j = 0;
        for(int i = idx+1; i < nums.length; i++){
            System.out.println("bool " + bool);
            if(tar == nums[i] && bool  == false){
                j = i;
            }
            if(tar == nums[i] && bool  == true){
                return false;
            }
            if(tar > nums[i]){
                return false;
            }
            if(tar < nums[i]){
               bool = true;
            }
        }
        System.out.println("j " + j);
//        System.out.println("arr1 " + arr1);
//        System.out.println("arr2 " + arr2);
        if(j == nums.length - 1){
            return false;
        }
        return true;

    }

    public static int helper(int nums[]){
        int j = 0;
        int idx = nums.length - 1;
        while( j < nums.length){
            int num = nums[j];
            for(int i = j+1;i < nums.length; i++){
                if(num <= nums[i]){
                    idx = i-1;
                    System.out.println(idx);
                    return idx ;
                }
            }
            j++;
        }
        return idx;
    }

}
