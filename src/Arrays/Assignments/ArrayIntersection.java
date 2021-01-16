package Arrays.Assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArrayIntersection {
    public static void main(String[] args) {
        int arr1[] = {10, 10};
        int arr2[] = {10};

        for (int i = 0; i < arr1.length; i++) {

            for (int j = 0; j < arr2.length; j++) {

                if (arr1[i] == arr2[j]) {
                    System.out.print(arr1[i] + " ");
                    arr2[j] = Integer.MAX_VALUE;
                    break;
                }

            }
        }

//        ArrayList<Integer> arr = new ArrayList<Integer>();
//
//        for(int i = 0; i < arr1.length; i++){
//            for(int j = 0; j < arr2.length; j++){
//                if(arr1[i] == arr2[j]){
//                    if(!arr.contains(arr1[i])){
//                        arr.add(arr1[i]);
//                    }
//
//                }
//            }
//        }
//        System.out.print(arr);
//
//        Integer[] arrfinal = new Integer[arr.size()];
//        arrfinal = arr.toArray(arrfinal);
//        System.out.print(arrfinal.getClass().getName());

            for (Integer x : arr2) {
                System.out.print(x + " ");
            }
//
//
//        for(int i = 0; i < arr.size; i++){
//
//        }

        }
    }
