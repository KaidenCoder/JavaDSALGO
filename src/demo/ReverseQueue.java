package demo;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseQueue {

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(2);
        q.add(3);
        q.add(1);
        reverse(q);
    }



    public static void reverse(Queue<Integer> q)
    {
        //    Write your code here.

        System.out.println(q);
        Stack<Integer> stack = new Stack<>();
        while(q.size() > 0){
            int item = q.poll();
            stack.add(item);
        }
        System.out.println(stack);
        while(stack.size() > 0){
            int item = stack.pop();
            q.add(item);
        }
        System.out.println(q);
        for(int i= 0; i <= q.size(); i++){
            System.out.print(q.poll() + " ");
        }
    }
}
