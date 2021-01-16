package Stacks;

import java.util.Stack;

public class StackCollections {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
//        stack.push(10);
//        System.out.println(stack.size());
//        System.out.println(stack.peek());
//        System.out.println(stack.pop());
//        System.out.println(stack.isEmpty());
//        int arr[] = {5, 6, 7, 1, 9};
//
//        for (int i = 0; i < arr.length; i++) {
//            stack.push(arr[i]);
//        }
//        while (!stack.isEmpty()) {
//            System.out.println(stack.pop());
//        }
        stack.push(5);
        stack.push(10);
        stack.push(15);
        stack.pop();
        stack.pop();
//        stack.pop();
        System.out.print(stack.peek());
    }
}
