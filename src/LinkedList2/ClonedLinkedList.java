package LinkedList2;

import java.util.Scanner;

class Node<T> {
    T data;
    Node<T> next;
    Node<T> arb;

    Node(T data) {
        this.data = data;
        this.next = null;
        this.arb = null;
    }
}

public class ClonedLinkedList {

    private static Node<Integer> takeInput(int n, Scanner s) {
        int count = 1;
        int data = s.nextInt();

        Node<Integer> head = null;
        Node<Integer> tail = null;

        Node<Integer> newNode = new Node<>(data);

        head = newNode;
        tail = newNode;

        while(count < n) {
            data = s.nextInt();
            newNode = new Node<>(data);

            tail.next = newNode;
            tail = newNode;

            count += 1;
        }

        return head;
    }

    public static boolean validate(Node<Integer> head, Node<Integer> result) {
        if(head==result) {
            return false;
        }

        Node<Integer> temp1=head;
        Node<Integer> temp2=result;

        int length1=0,length2=0;

        while(temp1 != null) {
            length1++;
            temp1 = temp1.next;
        }
        while(temp2 != null) {
            length2++;
            temp2=temp2.next;
        }
        if(length1!=length2) {
            return false;
        }

        temp1=head;
        temp2=result;
        while(temp1 != null) {
            if(temp1.data != temp2.data) {
                return false;
            }

            if(temp1.arb != null && temp2.arb != null) {
                if(temp1.arb.data != temp2.arb.data) {
                    return false;
                }
            } else if(temp1.arb != null && temp2.arb == null) {
                return false;
            } else if(temp1.arb == null && temp2.arb != null) {
                return false;
            }

            temp1 = temp1.next;
            temp2 = temp2.next;
        }

        return true;
    }


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int m = s.nextInt();

        Node<Integer> head = takeInput(n, s);

        for(int i = 1; i <= m; i++) {
            int data1 = s.nextInt();
            int data2 = s.nextInt();

            Node<Integer> tempa = head;
            int count = -1;
            while(tempa != null) {
                count++;
                if(count == data1-1) {
                    break;
                }

                tempa = tempa.next;
            }

            Node<Integer> tempb = head;
            count = -1;
            while(tempb != null) {
                count++;
                if(count == data2-1) {
                    break;
                }

                tempb = tempb.next;
            }

            if(data1 <= n) {
                tempa.arb = tempb;
            }
        }

//        Node<Integer> result = Solution.clone(head);
//
//        if(validate(head, result)) {
//            System.out.println(1);
//        } else {
//            System.out.println(0);
//        }
//
//        s.close();
    }
}

//public class Solution {
//
//    public static Node<Integer> clone(Node<Integer> head) {
//        //Your code goes here
//        Node<Integer> h = null;
//        h = head;
//        Node<Integer> h1 = h;
//
//
//        while(head != null){
//            if(head.arb != null){
//                h.next = h.arb;
//                head= head.next;
//            }else{
//                h.next = head.next;
//                head= head.next;
//            }
//        }
//
//        return h1;
//    }
//}
