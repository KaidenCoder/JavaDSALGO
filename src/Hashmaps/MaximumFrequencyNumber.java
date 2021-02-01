package Hashmaps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MaximumFrequencyNumber {

    public static int maxFrequencyNumber(int[] arr){
        HashMap<Integer, Integer> map = new HashMap<>();
        int a = 1;
        for(int i = 0; i < arr.length; i++){
            int key = arr[i];
            if(map.containsKey(key)){
                int freq = map.get(key);
                freq++;
                map.put(key, freq);
            }else{
                map.put(key, 1);
            }
        }

        int max = 0, ans = Integer.MIN_VALUE;

        for(int i : arr){
            if(map.get(i) > max){
                max = map.get(i);
                ans = i;
            }
        }

        return ans;
    }
}
