package Test10;
import java.util.Scanner;
import java.util.Stack;

public class ImplementBrowsingHistory {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        String input = scn.next();

        BrowserHistory obj = new BrowserHistory (input);

        int k;
        int i = scn.nextInt();
        while(true){
            switch(i){
                case 1: input=scn.next();
                    obj.visit(input);
                    break;
                case 2: k = scn.nextInt();
                    input=obj.back(k);
                    System.out.println(input);
                    break;
                case 3: k = scn.nextInt();
                    input=obj.forward(k);
                    System.out.println(input);
                    break;
                default: return;
            }
            i = scn.nextInt();
        }
    }
}

class BrowserHistory {
    Stack<String> st = new Stack<>();
    int idx = 0;

    public BrowserHistory(String homepage) {
        st.push(homepage);
    }

    public void visit(String url) {
        if(st.size() != idx + 1){
            while(st.size() != idx + 1){
                st.pop();
            }
        }
        st.add(url);
        idx++;
    }

    public String back(int steps) {
        for(int i = 0; i < steps && idx > 0; i++){
            idx--;
        }
        return st.get(idx);
    }

    public String forward(int steps) {
        for(int i = 0; i < steps && idx + 1 < st.size(); i++){
            idx++;
        }
        return st.get(idx);
    }
}
