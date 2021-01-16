package Stacks.Assignments;

import java.util.Stack;

public class MinimumBracketReversal {
    public static void main(String[] args) {

    }
    public static int countBracketReversals(String input) {
        //Your code goes here
        int len = input.length();
        if(len%2 != 0){
            return -1;
        }
        Stack<Character> s = new Stack<>();

        for(int i = 0; i < len; i++){
            char c = input.charAt(i);
            if(c == '}' && !s.empty()){
                if(s.peek() == '{'){
                    s.pop();
                }

            }
            else {
                s.push(c);
            }
        }
        int reduce = s.size();
        int n = 0;
        while(!s.empty() && s.peek() == '{'){
            s.pop();
            n++;
        }

        return  (reduce/2 + n%2);
    }
}
