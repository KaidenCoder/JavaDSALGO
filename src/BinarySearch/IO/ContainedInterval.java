package BinarySearch.IO;

import java.util.Arrays;

public class ContainedInterval {

    public static void main(String[] args) {
        int arr[][] = {{1,3},{9,9},{4,10},{4,8}};
        System.out.print(solve(arr));
    }

    public static boolean solve(int[][] intervals) {



        for(int i = 0; i < intervals.length-1; i++){
            for(int j = i+1; j < intervals.length; j++){
                if((intervals[i][0] <= intervals[j][0]) && (intervals[i][1] >= intervals[j][1])){
                    return true;
                }
                if((intervals[i][0] >= intervals[j][0]) && (intervals[i][1] <= intervals[j][1])){
                    return true;
                }
            }
        }

        return false;

    }


}
