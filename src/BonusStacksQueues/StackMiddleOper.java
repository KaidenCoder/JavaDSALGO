package BonusStacksQueues;

public class StackMiddleOper {

    private Node head;
    private Node mid;
    private int count;

    StackMiddleOper() {
        head = null;
        mid = null;
        count = 0;

    }




    public void push(int element) {
        Node newNode = new Node(element);

        newNode.prev = null;;
        newNode.next = head;
        head = newNode;
        count++;

        if(count == 1){
            mid = newNode;
        }
        else{
            head.prev = newNode;
            if((count % 2) != 0){
                mid = mid.prev;
            }
        }
        head = newNode;
    }

    public int pop() {
        // Return 0 if the stack is empty
        if(count == 0){
            return 0;
        }
        Node h = head;
        int item = h.data;
        head = h.next;

        if(head != null){
            head.prev = null;
        }
        count = count - 1;

        if(count% 2 == 0){
            mid = mid.next;
        }
        return item;
    }

    public int getmiddle() {
        // Return 0 if the stack is empty
        if(count == 0){
            return 0;
        }
        return mid.data;
    }

    public int removeMiddle() {
        // Return 0 if the stack is empty
        if(count == 0){
            return 0;
        }

        int x = mid.data;
        Node midprev = mid.prev;
        mid = mid.next;
        mid.prev = midprev;


        return x;
    }

    public void print() {
        System.out.println(getmiddle());
    }
}
