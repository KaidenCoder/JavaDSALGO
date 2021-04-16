package Test10;

import java.util.ArrayList;
import java.util.Scanner;

class LinkedListNode<T> {
    T data;
    LinkedListNode<T> next;

    public LinkedListNode(T data) {
        this.data = data;
        this.next = null;
    }
}

public class MultiplyTwoLL {
    public static LinkedListNode<Integer> takeInput(Scanner s) {
        LinkedListNode<Integer> head = null;
        LinkedListNode<Integer> tail = null;

        int data = s.nextInt();

        while(data != -1) {
            LinkedListNode<Integer> newNode = new LinkedListNode<>(data);

            if(head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
            data = s.nextInt();
        }
        return head;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        LinkedListNode<Integer> head1 = takeInput(s);
        LinkedListNode<Integer> head2 = takeInput(s);


        multiply(head1, head2);

        s.close();
    }

    public static void multiply(LinkedListNode<Integer> head1, LinkedListNode<Integer> head2) {
//        ArrayList<Integer> arr1 = new ArrayList<>();
//        ArrayList<Integer> arr2 = new ArrayList<>();
//
//        while(head1 != null){
//            arr1.add(head1.data);
//            head1 = head1.next;
//        }
//
//        while(head2 != null){
//            arr2.add(head2.data);
//            head2 = head2.next;
//        }
//
//        int num1 = 0;
//        int num2 = 0;
//        int unit = 1;
//        for(int i = arr1.size() - 1; i >= 0 ; i--){
//            num1 +=  arr1.get(i) * unit;
//            unit= unit * 10;
//        }
//        unit  = 1;
//        for(int i = arr2.size() - 1; i >= 0 ; i--){
//            num2 +=  arr2.get(i) * unit;
//            unit= unit * 10;
//        }
//
//        int result = num1 * num2;
//
//        String res = String.valueOf(result);
//
//        for(int i = 0; i < res.length(); i++){
//            System.out.print(res.charAt(i) + " ");
//        }

        int num1 = 0, num2 = 0;

        while(head1 != null || head2 != null){
            if(head1 != null){
                num1 = num1 * 10 + head1.data;
                head1 = head1.next;
            }
            if(head2 != null){
                num2 = num2 * 10 + head2.data;
                head2 = head2.next;
            }
        }

                int result = num1 * num2;

        String res = String.valueOf(result);

        for(int i = 0; i < res.length(); i++){
            System.out.print(Integer.parseInt(String.valueOf(res.charAt(i))) + " ");
        }

    }
}


