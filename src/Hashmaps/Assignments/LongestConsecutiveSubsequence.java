package Hashmaps.Assignments;

import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;

public class LongestConsecutiveSubsequence {

    public static ArrayList<Integer> longestConsecutiveIncreasingSequence(int[] arr) {

        ArrayList<Integer> res = new ArrayList<>();

       int longestStreak = 0;
        int currentNum = 0;

        for(int num: arr){
            currentNum = num;
           int currentStreak = 1;

           while(arrayContains(arr, currentNum + 1)){
               currentNum += 1;
               currentStreak += 1;
           }

           longestStreak = Math.max(longestStreak, currentStreak);

       }

        res.add(longestStreak);
        res.add(currentNum);


        return res;
    }

    public static boolean arrayContains(int[]arr, int num){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == num){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int [] arr = {15,24,23,12,19,11,16};
        ArrayList<Integer> result = longestConsecutiveIncreasingSequence(arr);

        for(int i : result){
            System.out.print(i + " ");
        }
    }



}
