package PriorityQueues2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class KLargestCodingNinjas {

    public static ArrayList<Integer> kLargest(int input[], int k) {

        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        for(int i = 0; i < k; i++){
            pq.add(input[i]);
        }
        for(int i = k; i < input.length; i++){
            if(input[i] > pq.peek()){
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
        int[] arr = {4,7,3,2,8,9,6,1};
        int k = 4;
        ArrayList<Integer> result = kLargest(arr, 4);

        for(int i = 0; i < result.size(); i++){
            System.out.println(result.get(i));
        }
    }

}
