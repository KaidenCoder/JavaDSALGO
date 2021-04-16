package FullTest2;

import java.util.Scanner;
import java.util.Stack;

public class BatmanVsJoker {

    public static void main(String args[]) {
        //Write your code here
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int arr[] = new int[a];
        for(int i = 0; i < a; i++){
            arr[i] = s.nextInt();
        }
        System.out.println(helper(arr, a));

    }

    public static int helper(int arr[], int n){
        Stack<Integer> stack = new Stack<>();

        stack.push(arr[n-1]);
        int sum = 0;
        for(int i = n-2; i > -1; i-- ){
            while(!stack.isEmpty() && arr[i] >= stack.peek() ){
                stack.pop();
            }

            int a = stack.empty() ? 0 : stack.peek();

            sum = (sum + a) % 1000000001;

            stack.push(arr[i]);
        }
        return sum;
    }

}
