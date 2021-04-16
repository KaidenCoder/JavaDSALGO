package FullTestNew1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class CheckSubset {

    public static void main(String[] args) {

        int arr1[] = {3,6,5,8,15,1,14,18,7,9,14,9,3,12,8};
        int arr2[] = {18,6,9,8,11};

       if(CheckSubset(arr1, arr1.length, arr2, arr2.length)){
           System.out.print("true");
       } else{
           System.out.print("false");
       }

    }

    public static boolean CheckSubset(int[] arr1, int n1, int[] arr2, int n2) {
        /*Your class should be named solution.
         *Don't write main().
         *Don't take input, it is passed as function argument.
         *Don't print output.
         *Taking input and printing output is handled automatically.
         */

        HashMap<Integer,Integer> map = new HashMap<>();
        Boolean result = true;

        for(int i = 0; i < n1; i++){
            if(!map.containsKey(arr1[i])){
                map.put(arr1[i], 1);
            }else{
                map.put(arr1[i], map.get(arr1[i]) + 1);
            }
        }

        for(int i = 0; i < n2; i++){
            if(!map.containsKey(arr2[i])){
                result = false;
            }
        }
        return result;
//        int count = 0;
//        int j = 0;
//        for(int i = 0; i < n2; i++){
//            while(j < n1){
//                if(arr1[j] == arr1[i]){
//                    count++;
//                    break;
//                }
//                j++;
//            }
//            j = 0;
//        }
//        if(count == n2){
//            return true;
//        }

    }


}
