package Queues.Assignments;

import java.util.Queue;
import java.util.Stack;

public class reverseKElements {
    public static Queue<Integer> reverseKElements(Queue<Integer> input, int k) {// 12345
        //Your code goes here
        if(input.isEmpty() == true || k > input.size()){
            return input;
        }
        if(k <= 0){
            return input;
        }
        Stack<Integer> stack = new Stack<Integer>();

        for(int i = 0; i < k; i++){
            stack.add(input.peek());// 123
            input.remove(); // 45
        }
        while(!stack.empty()){
            input.add(stack.peek()); //45321
            stack.pop(); //
        }
        for(int i = 0; i < input.size() - k; i++){
            input.add(input.peek()); //453214 //532145
            input.remove(); //53214 //32145
        }

        return input;
    }
}
