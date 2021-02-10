package PriorityQueues2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class KSmallestCodingNinjas {

    public static ArrayList<Integer> kSmallest(int n, int[] input, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
        for(int i = 0; i < k; i++){
            pq.add(input[i]);
        }
        for(int i = k; i < input.length; i++){
            if(input[i] < pq.peek()){
                pq.poll();
                pq.add(input[i]);
            }
        }

        ArrayList<Integer> output = new ArrayList<Integer>();
        while(!pq.isEmpty()){
            output.add(pq.poll());
        }
        return output;

    }

    public static void main(String[] args) {
        int[] arr = {2, 12, 9, 16, 10, 5, 3, 20, 25, 11, 1, 8, 6};
        int k = 4;
        ArrayList<Integer> result = kSmallest(arr.length, arr, 4);

        for(int i = 0; i < result.size(); i++){
            System.out.println(result.get(i));
        }
    }

}
