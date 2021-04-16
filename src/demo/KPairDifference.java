package demo;

import java.util.Arrays;
import java.util.HashMap;

public class KPairDifference {

    public static void main(String[] args) {
        int arr[] = {1,2,3};
        int n = 3;
        int k = 2;

       // System.out.println(isPairDifferenceK(arr, n, k));

        String str1 = "Coding";
        String str2 = "Codnig";

        if(checkMeta(str1, str2)){
            System.out.println("YES");
        } else{
            System.out.println("NO");
        }

    }


    public static String isPairDifferenceK(int[] arr, int n, int k) {
        // Write your code here.

        Boolean value = false;

        HashMap<Integer, Boolean> hmap = new HashMap<Integer, Boolean>();

        for(int i = 0; i < n; i++){
            hmap.put(arr[i], true);
        }

        for(int i = 0; i < n; i++){
            int diff = arr[i] + k;

            if(hmap.containsKey(diff)){
                value = true;
            }
        }

        if(value == true) return "Yes";
        else return "No";

    }


    public static boolean checkMeta(String str1, String str2) {

        if(str1.length() != str2.length()){
            return false;
        }

        if(str1.equals(str2)){
            return false;
        }
        String arr[] = new String[str1.length()];


        for(int i = 0; i < arr.length; i++){
            arr[i] = str1.substring(i,i+1);
        }
        Arrays.sort(arr);

        String arr1[] = new String[str2.length()];
        for(int i = 0; i < arr1.length; i++){
            arr1[i] = str2.substring(i,i+1);
        }
        Arrays.sort(arr1);

        for(int i = 0; i < arr.length; i++){
           if(!arr[i].equals(arr1[i])){
               return false;
           }
        }

        return true;

    }

}
