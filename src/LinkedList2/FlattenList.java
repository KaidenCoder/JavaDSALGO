package LinkedList2;

import java.util.Scanner;

class LinkedListNode<T> {
    T data;
    LinkedListNode<T> right;
    LinkedListNode<T> down;

    LinkedListNode(T data) {
        this.data = data;
        this.right = null;
        this.down = null;
    }
}

public class FlattenList {

    public static void printList(LinkedListNode<Integer> head) {
        while(head != null) {
            System.out.print(head.data + " ");
            head = head.down;
        }

        System.out.println();
        return;
    }

    public static LinkedListNode<Integer> takeInput(Scanner s) {
        int data = s.nextInt();

        LinkedListNode<Integer> head = null;
        LinkedListNode<Integer> tail = null;
        LinkedListNode<Integer> headd = null;
        LinkedListNode<Integer> taild = tail;

        while(data != -1) {
            LinkedListNode<Integer> newNode = new LinkedListNode<>(data);
            headd = null;
            if(head == null) {
                head = newNode;
                tail = newNode;
                taild=tail;
            }
            else {
                tail.right = newNode;
                tail = tail.right;
                taild = tail;
            }

            while(data != -1) {
                if(headd == null) {
                    headd = newNode;
                } else {
                    newNode = new LinkedListNode<>(data);
                    taild.down = newNode;
                    taild = taild.down;
                }
                data = s.nextInt();
            }
            data = s.nextInt();
        }
        return head;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        LinkedListNode<Integer> head = takeInput(s);
//        head = Solution.flat(head);
//        printList(head);
    }
}



//public class Solution {
//
//    public static LinkedListNode<Integer> flat(LinkedListNode<Integer> head) {
//        //Your code goes here
//        if(head == null || head.right == null){
//            return head;
//        }
//
//        head.right = flat(head.right);
//
//        head = merge(head, head.right);
//
//        return head;
//    }
//
//    public static LinkedListNode<Integer> merge(LinkedListNode<Integer> a, LinkedListNode<Integer> b){
//        if(a == null){
//            return b;
//        }
//        if(b == null){
//            return a;
//        }
//        LinkedListNode<Integer> result;
//        if(a.data < b.data){
//            result = a;
//            result.down = merge(a.down, b);
//        }
//        else{
//            result = b;
//            result.down = merge(a, b.down);
//        }
//
//        result.right = null;
//        return result;
//    }
//
//}
