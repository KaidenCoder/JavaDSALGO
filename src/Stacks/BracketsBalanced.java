package Stacks;

import java.util.HashMap;
import java.util.Stack;

public class BracketsBalanced {
    public static void main(String[] args) {

    }

//    private HashMap<Character, Character> mappings;
//
//    public void Solut(){
//        this.mappings = new HashMap<Character, Character>();
//        this.mappings.put(')','(');
//        this.mappings.put('}','{');
//        this.mappings.put(']','[');
//    }

    public static boolean isBalanced(String s) {
        //Your code goes here
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c == '(' || c == '[' || c == '{'){
                stack.push(c);
            }
            else if(stack.empty()) return false;
            else if(c == ')' && stack.pop() != '(') return false;
            else if(c == '}' && stack.pop() != '{') return false;
            else if(c == ']' && stack.pop() != '[') return false;
        }
        return true;
    }

}
