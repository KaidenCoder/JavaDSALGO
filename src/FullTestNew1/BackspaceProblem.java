package FullTestNew1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class BackspaceProblem {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        System.out.print(backspace(str));

    }

    public static String backspace(String s){
        Stack<Character> stack = new Stack<>();

        for(int i = 0;  i < s.length(); i++){
            if(s.charAt(i) != '#'){
                stack.push(s.charAt(i));
            }else if(!stack.isEmpty()){
                stack.pop();
            }
        }

        String ans = "";

        while(!stack.isEmpty()){
            ans += stack.pop();
        }
        String res = "";
        for(int i = ans.length() - 1; i > -1 ; i--){
            res += ans.charAt(i);
        }

        return res;
    }

}
