package FullTest1;
import java.util.*;
import java.lang.*;

class Node{
    int data;
    Node next;
    Node (int key)
    {
        data=key;
        next=null;
    }
}

public class ReverseTheLinkList {
    static Node head;
    public static void main (String[] args) {
        Scanner s=new Scanner (System.in);
        int n=s.nextInt();
        int a=s.nextInt();
        Node head=new Node(a);
        Node prev=head;
        for(int i=0;i<n-1;i++)
        {
            a=s.nextInt();
            Node newnode=new Node(a);
            prev.next=newnode;
            prev=newnode;
        }
        int k=s.nextInt();
        Node ans=Solution.reverse(head,k);
        prev=ans;
        for(int i=0;i<n;i++)
        {
            System.out.print(prev.data+" ");
            prev=prev.next;
        }

    }
}

class Solution{
    public static Node reverse(Node head, int k)
    {
        //Your code here
        //Make change in the linked list only
        //Return the head of the new Linked list
//        if(head == null){
//            return null;
//        }
//        Node current  = head;
//        Node next = null;
//        Node prev = null;
//
//        int count = 0;
//
//        while(count < k && current != null){
//            next = current.next;
//            current.next = prev;
//            prev = current;
//            current = next;
//            count++;
//        }
//
//        if(next != null){
//            head.next = reverse(next, k);
//        }
//
//        return prev;


        if(head == null)
            return null;
        Node current = head;
        Node next = null;
        Node prev = null;

        int count = 0;

        while (count < k && current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            count++;
        }

        if (next != null)
            head.next = reverse(next, k);

        return prev;
    }
}
