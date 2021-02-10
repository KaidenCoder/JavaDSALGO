package PriorityQueues2.Assignments;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class BuyTicket {

    public static int buyTicket(int input[], int k) {

        Queue<Integer> q = new LinkedList<Integer>();
        // 2 3 2 2 4
        // 3 2 2 4 2
        // 2 2 4 2 3
        // 2 4 2 3 2
        // 4 2 3 2 2
        // 2 3 2 2
        // 3 2 2
        // 2 2 3
        // 2 3
        // 3 2

        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(10, Collections.reverseOrder());
        // 4 2 2 3 2
        // 2 2 3 2
        // 2 3 2
        // 3 2

        for(int i : input){
            q.add(i);
            pq.add(i);
        }

        int count = 0;
        while(!pq.isEmpty()){
            if(q.peek().equals(pq.peek())){
                if(k == 0){
                    return count + 1;
                } else {
                    count++; // 1, 2, 3
                    q.poll();
                    pq.poll();
                    k--; // 3, 1
                }
            } else{
                q.add(q.peek());
                q.poll();
                if(k == 0){
                    k = q.size() - 1;
                } else {
                    k--; // 2 1 0 -- 4, 2, 0
                }
            }
        }

        return count;

    }

}
