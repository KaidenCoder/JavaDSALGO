package demo;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class DeleteMiddleNode {
  // 1 2 3 4 5
    public static Node deleteMiddle(Node head) {
        // Write your code here

        if(head == null){
            return null;
        }
        if(head.next == null){
            return null;
        }

        Node slow = head;
        Node fast = head;

        Node prev = null;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            prev = slow;
            slow = slow.next;
        }

        prev.next = slow.next;

        return  head;

//        Node temp = head;
//        int count = 0;
//        int mid = 0;
//        while(temp!= null){
//            temp = temp.next;
//            count = count + 1;
//
//        }
//        if(count %2 != 0){
//            mid = count/2;
//        }
//        if(count % 2== 0){
//            mid = count/2-1;
//        }
//        Node temp2 = head;
//        while(mid-- > 1){
//           head = head.next;
//        }
//        head.next = head.next.next;
//
//        return temp2;

    }
}
