package PriorityQueues2.Assignments;

import java.util.Arrays;

public class KthLargest {

    public static int kthLargest(int n, int[] input, int k) {
        // Write your code here
        Arrays.sort(input);

        return input[input.length - k];
    }

    public static void main(String[] args) {
        int arr[] = {9,4,8,7,11,3};
        int k = 2;
        System.out.println(kthLargest(arr.length, arr, k));
    }

}
