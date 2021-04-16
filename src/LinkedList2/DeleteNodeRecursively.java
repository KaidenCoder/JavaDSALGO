package LinkedList2;

public class DeleteNodeRecursively {

    class LinkedListNode<T> {
        T data;
        LinkedListNode<T> next;

        public LinkedListNode(T data) {
            this.data = data;
        }
    }

    public static LinkedListNode<Integer> deleteNodeRec(LinkedListNode<Integer> head, int pos) {
        //Your code goes here
       if(pos < 0){
           return head;
       }

       if(head == null){
           return null;
       }

       if(pos == 0){
           LinkedListNode<Integer> res = head.next;// 60 -> null
           return res;
       }

        // 10 -> 20 -> 30 -> 50 -> 60
        // 4,    3,     2,    1    0
        // 10 -> 20 -> 30 -> 50
        //10 -> 20 = (20, 3)
       head.next = deleteNodeRec(head.next, pos -1);
       // 20 = (20, 3)
        // 30 = (30, 2)
        // 50 = (50, 1)
        // 50 -> 60 = (60, 0) -> null
       return head;


    }


}
