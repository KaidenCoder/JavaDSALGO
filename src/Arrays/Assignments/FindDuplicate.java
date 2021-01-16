package Arrays.Assignments;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicate {
    public static void main(String[] args) {
        int arr[] = {0,7,2,5,4,7,1,3,6};
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
            if(e.getValue() == 2){
                return e.getKey();
            }
        }
        return -1;
    }
}
