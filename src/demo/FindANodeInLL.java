package demo;

class LinkedListNodes<T> {
    T data;
    LinkedListNodes<T> next;

    public LinkedListNodes(T data) {
        this.data = data;
    }
}


public class FindANodeInLL {
    public static int findNode(LinkedListNode<Integer> head, int n) {
        //Your code goes here
        int idx = 0;
        if(head != null){
            if(head.data == n){
                return idx;
            }
            idx += 1;
            head = head.next;
        }
        return -1;
    }
}

