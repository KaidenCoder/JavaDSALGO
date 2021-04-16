package demo;

class LinkedListNode<T> {
    T data;
    LinkedListNode<T> next;

    public LinkedListNode(T data) {
        this.data = data;
    }
}

public class SearchInALL {

    public static int searchInLinkedList(LinkedListNode<Integer> head, int k) {
        // Write your code here!
        while(head != null){
            if(head.data == k) {
                return 1;
            }else{
                head = head.next;
            }
        }

        return 0;

    }

}
