package BonusRecursionBackTracking;

import java.util.Scanner;

public class NumberOfWays {
    static int count = 0;
    public static int numberOfWays(int[] input, int sum) {
        wayHelper2(input, 0, 0, sum);
        return count;
    }

    private static void wayHelper2(int[] nums, int i, int sum, int S) {
        if(i == nums.length){
            if(sum == S){
                count++;
            }
        }else{
            wayHelper2(nums, i + 1, sum + nums[i], S);
            wayHelper2(nums, i + 1, sum - nums[i], S);
        }
    }

    private static int wayHelper(int[] arr, int n, int sum) {
        if(sum == 0){
            return 1;
        }

        if(n < 0){
            return 0;
        }

        int exclude = wayHelper(arr, n - 1, sum);

        int include = wayHelper(arr, n-1, sum - arr[n]) + wayHelper(arr, n-1, sum + arr[n]);

        return exclude + include;


    }

    public static void main(String[] args) {

        int[] arr = {5,3,-6,2};



        int sum = 6;
        System.out.println(numberOfWays(arr, sum));
    }


}
