package Queues.Assignments;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseQueue {
    public static void reverseQueue(Queue<Integer> input) {
        //Your code goes here
        Stack<Integer> stack = new Stack<>();
        while(!input.isEmpty()){
            stack.add(input.peek());
            input.remove();
        }
        while(!stack.isEmpty()){
            input.add(stack.peek());
            stack.pop();
        }
    }
}
