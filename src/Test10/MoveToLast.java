package Test10;
import java.util.ArrayList;
import java.util.Scanner;

class Node<T> {
    public T data;
    public Node<T> next;
    public Node(T data) {
        this.data=data;
    }
}


public class MoveToLast {
    static Scanner s=new Scanner(System.in);

    public static Node<Integer> createlist() {
        Node<Integer> head = null;
        Node<Integer> rear = null;
        int data = s.nextInt();
        while(data != -1) {
            Node<Integer> newnode = new Node<Integer>(data);
            if(head == null) {
                head = newnode;
                rear = head;
            }
            else {
                rear.next = newnode;
                rear = rear.next;
            }
            data = s.nextInt();
        }
        return head;
    }

    public static void print(Node<Integer> head) {
        while(head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static void main(String[] args) {
        Node<Integer> head1 = createlist();
        int n = s.nextInt();
        print(func(head1,n));
    }

    public static Node<Integer> func(Node<Integer> head,int n) {
        /* Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
         */

        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        while(head != null){
            arr.add(head.data);
            head = head.next;
        }

        for(int i = 0; i < arr.size(); i++){
            if(arr.get(i) != n){
                arr2.add(arr.get(i));
            }
        }

        for(int i = arr2.size(); i < arr.size(); i++){
            arr2.add(n);
        }

        Node<Integer> result = new Node(arr2.get(0));
        Node<Integer> head2 = result;
        for(int i = 1; i< arr2.size(); i++){
            result.next = new Node(arr2.get(i));
            result = result.next;
        }

        return head2;
    }
}
