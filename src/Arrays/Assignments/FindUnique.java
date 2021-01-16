package Arrays.Assignments;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindUnique {
    public static void main(String[] args) {
     int arr[] = {1,3,1,3,6,6,7,10,7};
//        findUnique(arr);
     int a = findUnique(arr);
     System.out.print(a);
    }

    public static int findUnique(int[] arr){
        //Your code goes here
        HashMap<Integer, Integer> map = new HashMap<>(arr.length);
        for(int num: arr){
            Integer occurence = map.get(num);
            map.put(num, occurence == null? 1: occurence+1);
        }

        for(Map.Entry<Integer, Integer> e: map.entrySet()){
            if(e.getValue() == 1){
                return e.getKey();
            }
        }
        return -1;
    }
}
