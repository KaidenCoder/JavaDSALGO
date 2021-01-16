package Stacks.Assignments;

import java.util.Stack;

public class CheckReduntantBrackets {

    public static void main(String[] args) {

    }

    public static boolean checkRedundantBrackets(String s) {
        //Your code goes here
        Stack<Character> st = new Stack<>();
        char[] sta = s.toCharArray();
        for(char ch:sta){
            if(ch == ')'){
                char top = st.peek();//b//+
                st.pop(); // ((a+ // ((a
                boolean flag = true;
                while(top != '('){
                    if(top == '+' || top == '-' || top == '*' || top == '/'){
                        flag = false;
                    }
                    top = st.peek();// a
                    st.pop(); // (
                }

                if(flag == true){
                    return true;
                }
            } else {
                st.push(ch);// ((a+b - ((a+
            }
        }
        return false;
    }

}
