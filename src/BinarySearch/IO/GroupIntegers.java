package BinarySearch.IO;

import java.util.*;

public class GroupIntegers {
//    static int nums[] = {2,3,5,8,3,2,5,8};
    static int nums[] = {3, 0, 0, 3, 3, 3};

    public static void main(String[] args) {
        System.out.println(solve(nums));
    }

    public static boolean solve(int[] nums) {
        Map<Integer, Integer> hmap = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(hmap.containsKey(nums[i])){
                hmap.put(nums[i], hmap.get(nums[i]) + 1);
            }else {
                hmap.put(nums[i], 1);
            }
        }

        Boolean bool = true;
        System.out.println(hmap);

        ArrayList<Integer> arr = new ArrayList<>();

        for (Map.Entry<Integer,Integer> entry : hmap.entrySet()){
            arr.add(entry.getValue());
            if(entry.getValue() < 2){
                return false;
            }

        }
        System.out.println(arr);

        Collections.sort(arr);

        if(arr.size() == 1){
            return true;
        }
        int min = 0;
        if(arr.get(0)%2 == 0){
            min = 2;
        } else{
            min = arr.get(0);
        }

        for(int i = 1; i < arr.size(); i++){
            if(arr.get(i-1) != arr.get(i)){
                if(arr.get(i)%min != 0){
                    return false;
                }
            }
        }



        return bool;
    }
}
