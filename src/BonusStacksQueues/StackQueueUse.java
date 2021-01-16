package BonusStacksQueues;

import java.util.Scanner;
import java.util.Stack;

class Node {
    int data;
    Node next;
    Node prev;
    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}


public class StackQueueUse {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        StackMiddleOper st = new StackMiddleOper();
        int choice = s.nextInt();
        int input;
        while (choice != -1) {
            if(choice == 1) {
                input = s.nextInt();
                st.push(input);
            }
            else if(choice == 2) {
                int ans = st.pop();
                if(ans != 0) {
                    System.out.println(ans);
                }
                else {
                    System.out.println(-1);
                }
            }
            else if(choice == 3) {
                int ans = st.getmiddle();
                if(ans != 0) {
                    System.out.println(ans);
                }
                else {
                    System.out.println(-1);
                }
            }
            else if(choice == 4) {
                int ans = st.removeMiddle();
                if(ans != 0) {
                    System.out.println(ans);
                }
                else {
                    System.out.println(ans);
                }
            }
            else if(choice == 5) {
                st.print();
                System.out.println();
            }
            choice = s.nextInt();
        }
        s.close();
    }
}
