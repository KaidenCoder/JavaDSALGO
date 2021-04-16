package FullTest1;

import java.util.HashSet;

public class RainbowArray {

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,4,5,6,6,6,7,6,6,6,5,4,4,3,2,1};
        int arr1[] = {1,2,3,4,5,6,8,6,5,4,3,2,1};
        int n = arr.length;

        israinbow(arr1);
    }

    public static void israinbow(int [] arr){
        if(countDistinct(arr) == false){
            System.out.println("No");
        } else{
            int l = 0;
            int r = arr.length - 1;
            while(l < r){
                if(arr[l] != arr[r]){
                    System.out.println("No");
                    return;
                }
                l++;
                r--;
            }
            System.out.println("Yes");
            return;
        }
    }

    private static boolean countDistinct(int arr[]){

        HashSet<Integer> hs = new HashSet<Integer>();

        for(int i = 0; i < arr.length; i++){
            hs.add(arr[i]);
        }
        if(hs.size() == 7){
            for(int i = 1; i <= 7; i++){
                if(!hs.contains(i)){
                    return false;
                }
            }
            return true;
        } else{
            return false;
        }
    }



}
