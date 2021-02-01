package Hashmaps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class printIntersection {
    public static void intersection(int[] arr1, int[] arr2) {
        ArrayList<Integer> res = new ArrayList<>();
        for(int i=0;i<arr1.length;i++) {

            for(int j=0;j<arr2.length;j++) {

                if(arr1[i]==arr2[j]) {
                    res.add(arr1[i]);
                    arr2[j]=Integer.MAX_VALUE;
                    break;
                }

            }
        }


        Collections.sort(res);
        for(int i = 0; i < res.size(); i++){
            System.out.print(res.get(i)+" ");
        }
    }

    public static void intersection2(int[] arr1, int[] arr2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < arr1.length; i++){
           if(map.containsKey(arr1[i])){
               int value = map.get(arr1[i]);
               map.put(arr1[i], value + 1);
           }else{
               map.put(arr1[i],1);
           }
        }

        for(int i = 0; i < arr2.length; i++){
            if(map.containsKey(arr2[i])){
                int freq = map.get(arr2[i]);
                if(freq > 0){
                    System.out.print(arr2[i] + " ");
                    map.put(arr2[i], freq - 1);
                }

            }
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {5,8,7,4,8};
        int[] arr2 = {4,6,6,10,8,5,5,1};
        //intersection(arr1, arr2);
        intersection2(arr1, arr2);
    }
}
