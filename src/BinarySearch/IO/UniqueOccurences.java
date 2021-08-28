package BinarySearch.IO;

import java.util.*;

public class UniqueOccurences {

    public static void main(String[] args) {
       int nums[] = {5,3,1,8,3,1,1,8,8,8};
       System.out.print(solve(nums));
    }

    public static boolean solve(int[] nums) {
        HashMap<Integer, Integer> hmap = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            if(hmap.containsKey(nums[i])){
                hmap.put(nums[i], hmap.get(nums[i]) + 1);
            }else{
                hmap.put(nums[i],1);
            }
        }

        int asc[] = new int[hmap.size()];
        int i = 0;
        for(Integer value: hmap.values()){
            asc[i] = value;
            i++;
        }
        Arrays.sort(asc);

        for(int k = 1; k < asc.length; k++){
            if(asc[k] == asc[k-1]){
                return false;
            }
        }


        return true;
    }

}
