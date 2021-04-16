package Test7;

import java.util.Scanner;

class ListNode<t> {
    public t data;
    public ListNode<t> next;
    public ListNode(t data)
    {
        this.data=data;
    }
}

public class List {

    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int data = s.nextInt();
        ListNode<Integer> head = null, temp = null;
        //enter -1 to end
        while(data != -1){
            if(head == null){
                head = new ListNode<Integer>(data);
                temp = head;
            }else{
                temp.next = new ListNode<Integer>(data);
                temp = temp.next;
            }
            data = s.nextInt();
        }
        int n = s.nextInt();
        ListNode<Integer> tail = temp;
        temp = head;
        //connecting last element to nth node
        while(n != 1){
            n--;
            temp = temp.next;
        }
        tail.next = temp;
        int N = s.nextInt();  // Nth node from loop
        //what to compare???
        print(Solution.FindNode(head,N));
    }

    public static void print(ListNode<Integer> head){
        System.out.println((head == null)?"null":head.data);
    }
}
