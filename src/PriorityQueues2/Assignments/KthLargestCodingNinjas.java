package PriorityQueues2.Assignments;

import java.util.Arrays;
import java.util.PriorityQueue;

public class KthLargestCodingNinjas {

    public static int kthLargest(int n, int[] input, int k) {
        // Write your code here
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for(int i = 0; i < k; i++ ){
            minHeap.add(input[i]);
        }

        for(int i = k; i < n; i++){
            if(input[i] > minHeap.peek()){
                minHeap.poll();
                minHeap.add(input[i]);
            }
        }

        return minHeap.peek();

    }

    public static void main(String[] args) {
        int arr[] = {9,4,8,7,11,3};
        int k = 2;
        System.out.println(kthLargest(arr.length, arr, k));
    }

}
