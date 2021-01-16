package Queues;


import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue<T> {

    Queue<Integer> q1 = new LinkedList<Integer>();
    Queue<Integer> q2 = new LinkedList<Integer>();
    int size = 0;

    public StackUsingQueue() {
        size = 0;
    }

    /*----------------- Public Functions of Stack -----------------*/


    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void push(int element) {
        size++;
        q2.add(element);
        while(!q1.isEmpty()){
            q2.add(q1.peek());
            q1.remove();
        }

        Queue<Integer> q = q1;
        q1 = q2;
        q2 = q;
    }

    public int pop() {
        //Implement the pop() function
        if(q1.isEmpty()){
            return -1;
        }
        int temp = q1.remove();
        size--;
        return temp;
    }

    public int top() {
        //Implement the top() function
        if(q1.isEmpty()){
            return -1;
        }
        return q1.peek();
    }
}
