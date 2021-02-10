package PriorityQueues2;

import java.util.PriorityQueue;

public class InbuiltPQ {

    public static void main(String[] args) {
        int[] arr = {4,7,3,2,8,9,6,1};
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        for (int i=0; i < arr.length; i++){
            pq.add(arr[i]);
        }
       // System.out.println(pq.peek());

        while (!pq.isEmpty()){
            System.out.println(pq.peek());
            pq.poll();
        }

    }

}
