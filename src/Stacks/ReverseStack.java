package Stacks;

import java.util.Stack;

public class ReverseStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        int arr[] = {5, 6, 7, 1, 9};

        for (int i = 0; i < arr.length; i++) {
            stack.push(arr[i]);
        }
        Stack<Integer> stack2 = new Stack<>();
        reverseStack(stack, stack2);
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

    }

    public static void reverseStack(Stack<Integer> input, Stack<Integer> extra) {
        //Your code goes here 5, 6, 7, 1, 9
        while(!input.isEmpty()){
            int a = input.peek(); // 9 - 1
            input.pop(); //5, 6, 7, 1 - 5, 6, 7
            extra.push(a);//9, 1
        }

        Stack<Integer> s = new Stack<>();
        while(!extra.isEmpty()){
            int c = extra.peek(); // 9 - 1
            extra.pop(); //5, 6, 7, 1 - 5, 6, 7
            s.push(c);//9, 1
        }

        while(!s.isEmpty()){
            int b = s.peek();
            s.pop();
            input.push(b);
        }

    }
}
