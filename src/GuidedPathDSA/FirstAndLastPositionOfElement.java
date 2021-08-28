package GuidedPathDSA;

import java.util.ArrayList;
import java.util.Scanner;

public class FirstAndLastPositionOfElement {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int t = s.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = s.nextInt();
        }

        System.out.print(searchRange(arr, t));
    }

    public static int[] searchRange(int[] nums, int target) {
        ArrayList<Integer> result = new ArrayList<>();
        for(int i = 0;  i < nums.length; i++){
            if(nums[i] == target){
                result.add(i);
            }
        }
        int res[] = new int[2];
        res[0] = -1;
        res[1] = -1;
        if(result.size() == 1){
            res[0] = result.get(0);
            res[1] = result.get(0);
            return res;
        }

        if(result.size() > 1){
            res[0] = result.get(0);
            res[1] = result.get(result.size() - 1);
            return res;
        }

        return res;
    }

}
