package LinkedList2;

public class ReverseLL {

    class LinkedListNode<T> {
        T data;
        LinkedListNode<T> next;

        public LinkedListNode(T data) {
            this.data = data;
        }
    }

    public static LinkedListNode<Integer> reverseLinkedListRec(LinkedListNode<Integer> head) {
       if(head == null || head.next == null){
           return head;
       }
       LinkedListNode<Integer> newNode = reverseLinkedListRec(head.next);
       LinkedListNode<Integer> tail = newNode;
       while(tail.next != null){
           tail = tail.next;
       }
       tail.next = head;
       head.next = null;

       return newNode;
    }

}
