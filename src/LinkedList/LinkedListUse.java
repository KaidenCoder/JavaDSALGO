package LinkedList;

import java.util.*;

class DoubleNode{
    Node<Integer> head;
    Node<Integer> tail;
    DoubleNode(){

    }
    DoubleNode(Node<Integer> head, Node<Integer> tail){
        this.head = head;
        this.tail = tail;
    }
}

public class LinkedListUse {

    public static Node<Integer> createLinkedList(){
        Node<Integer> n1 = new Node<>(10);
        Node<Integer> n2 = new Node<>(20);
        Node<Integer> n3 = new Node<>(30);
        Node<Integer> n4 = new Node<>(40);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        return n1;
    }

    public static void print(Node<Integer> head){
//        System.out.println("Print " + head);
        Node<Integer> temp = head;
        while(temp != null){
            System.out.println( temp.data);
            temp = temp.next;
        }
    }

    public static int length(Node<Integer> head){
        int count = 0;
        while(head != null){
            count++;
            head = head.next;
        }
        return count;
    }


    public static Node<Integer> takeInput(){

        Scanner s = new Scanner(System.in);
        int data = s.nextInt();
        Node<Integer> head = null, tail = null;

        while(data != -1){
            Node<Integer> currentNode = new Node<Integer>(data);
            if(head == null){
//                head = currentNode;
                head = currentNode;
                tail = currentNode;
            }else{
//                Node<Integer> tail = head;
//                while(tail.next != null){
//                    tail = tail.next;
//                }
//                tail.next = currentNode;
                tail.next = currentNode;
                tail = currentNode;
            }

            data = s.nextInt();
        }
        return head;
    }

//    public static void print(Node<Integer> head){
//        Node<Integer> temp = head;
//
//        while(temp != null){
//            System.out.print(temp.data +" ");
//            temp = temp.next;
//        }
//        System.out.println();
//    }

    public static void printRecursion(Node<Integer> head){
        if(head == null){
            return;
        }
        System.out.print(head.data + " ");
        printRecursion(head.next);
    }

    public static Node<Integer> insertRecursion(Node<Integer> head, int elem, int pos){
        if(head == null && pos > 0){
            return head;
        }
        if(pos == 0){
            Node<Integer> newNode = new Node<>(elem);
            newNode.next = head;
            return newNode;
        }else{
            Node<Integer> smallerHead = insertRecursion(head.next, elem, pos-1);
            head.next = smallerHead;
            return head;
        }
    }

    public static DoubleNode reverseRbetter(Node<Integer> head){
        DoubleNode ans;
        if(head == null || head.next == null){
            ans = new DoubleNode();
            ans.head = head;
            ans.tail = head;
            return ans;
        }

        DoubleNode smallAns = reverseRbetter(head.next);
        smallAns.tail.next = head;
        head.next = null;
        ans = new DoubleNode();
        ans.head = smallAns.head;
        ans.tail = head;
        return ans;
    }

    public static Node<Integer> reverseRBest(Node<Integer> head){
        if(head == null || head.next == null){
            return head;
        }
        // 1 -> 2 -> 3 -> 4 -> -1
        Node<Integer> smallHead = reverseRBest(head.next);
        // 4
        Node<Integer> reversedTail = head.next;
        // 4,3,2,1
        reversedTail.next = head;
        // 4 -> 3 -> 2 -> 1 -> null
        head.next = null;
        return smallHead;
    }

    public static Node<Integer> midPoint(Node<Integer> head) {
        //Your code goes here
        Node<Integer> slow = head;
        Node<Integer> fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static Node<Integer> mergeTwoSortedLinkedLists(Node<Integer> head1, Node<Integer> head2) {
        //Your code goes here
        Node<Integer> t1 = head1, t2 = head2;
        Node<Integer> head = null, tail = null;



        if(t1.data < t2.data){
            head  = t1;
            tail = t1;
            t1 = t1.next;
        }else{
            head = t2;
            tail = t2;
            t2 = t2.next;
        }

        Node<Integer> res = head;

        while(t1!= null && t2 != null){
            if(t1.data < t2.data){
                tail.next = t1;
                tail = t1;
                t1 = t1.next;
            }else{
                tail.next = t2;
                tail = t2;
                t2 = t2.next;
            }
        }

        if(t1 != null){
            while(t1 != null){
                tail.next = t1;
                t1 = t1.next;
            }
        }

        if(t2 != null){
            while(t2 != null){
                tail.next = t2;
                t2 = t2.next;
            }
        }

        return head;

    }

    public static Node<Integer>  mergeSort(Node<Integer>  head) {
        //Your code goes here
        if(head == null || head.next == null){
            return head;
        }

        Node<Integer>  middle = getMiddle(head);
        Node<Integer>  nextOfMiddle = middle.next;

        middle.next = null;

        Node<Integer>  left = mergeSort(head);

        Node<Integer>  right = mergeSort(nextOfMiddle);

        Node<Integer>  sortedList = sortedMerge(left, right);
        return sortedList;
    }



    public static Node<Integer>  sortedMerge(Node<Integer>  a, Node<Integer>  b){

        Node<Integer>  result = null;
        if(a == null){
            return b;
        }
        if(b == null){
            return a;
        }

        if(a.data <= b.data){
            result = a;
            result.next = sortedMerge(a.next, b);
        }
        else {
            result = b;
            result.next = sortedMerge(a, b.next);
        }
        return result;
    }

    public static Node<Integer>  getMiddle(Node<Integer>  head){
        if(head == null){
            return head;
        }

        Node<Integer>  slow = head, fast = head;
//        while(fast.next != null && fast.next.next != null){
//            slow = slow.next;
//            fast = fast.next.next;
//        }
//        return slow;

        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;

//        Node<Integer> slow = head;
//        Node<Integer> fast = head;
//        while(fast != null && fast.next != null){
//            slow = slow.next;
//            fast = fast.next.next;
//        }
//        return slow;
    }

    public static Node<Integer> evenAfterOdd(Node<Integer> head) {
        //Your code goes here

       if(head == null){
           return null;
       }

       Node<Integer> odd = head, even = head.next, evenHead = even;
       while(even != null && even.next != null){
           odd.next = even.next;
           odd = odd.next;
           even.next = odd.next;
           even = even.next;
       }
       odd.next = evenHead;
       return head;
    }

    public static int addNumbers(Node<Integer> head1, Node<Integer> head2) {
        //Your code goes here
        int count = 0;

// 4 -> 5 -> 6 -> 7
       Node<Integer> temp = head1;

        while(temp != null){
            temp = temp.next;// 5,6,7
            count = count + 1;// 2,3,4
        }

        count -= 1;

        int sum1 = 0;
        ArrayList<Integer> arr4 = new ArrayList<>();


        while( head1 != null){
            if(count == 0){
                arr4.add(head1.data );
            }else{
                arr4.add((int) (head1.data * Math.pow(10, count)));
            }
            count = count - 1;

            head1 = head1.next;
        }

        for(int j = arr4.size() -1 ; j > -1 ; j--){
            sum1 = sum1 + arr4.get(j);
        }

        Node<Integer> temp2 = head2;

        int count2 = 0;

        while(temp2 != null){
            temp2 = temp2.next;// 5,6,7
            count2 = count2 + 1;// 2,3,4
        }

        count2 -= 1;

        ArrayList<Integer> arr3 = new ArrayList<>();

        int sum2 = 0;

        while( head2 != null){
            if(count2 == 0){
                arr3.add(head2.data );
            }else{
                arr3.add((int) (head2.data * Math.pow(10, count2)));
            }
            count2 = count2 - 1;

            head2 = head2.next;
        }

        for(int j = arr3.size() -1 ; j > -1 ; j--){
            sum2 = sum2 + arr3.get(j);
        }

        int total = sum1 + sum2;

        ArrayList<Integer> res = new ArrayList<>();

        while(total >0){
            int a1 = total% 10;
            total = total/10;
            res.add(a1);
        }

        Node<Integer> newh1 = null;
//
//        String temp1 = Integer.toString(total);
//        int[] newGuess = new int[temp1.length()];
//        for (int i = 0; i < temp1.length(); i++)
//        {
//            newGuess[i] = temp1.charAt(i) - '0';
//        }
//


//        Collections.reverse(res);
        newh1 = new Node<>(res.get(res.size()-1));

        Node<Integer> newh2 = newh1;

//        for(int i = 1; i < newGuess.length; i++){
//            newh1.next = new Node<>(newGuess[i]);
//        }

        for(int i = res.size()- 2; i > -1; i--){
            newh2.next = new Node<>(res.get(i));
        }

        return sum1;

    }

    public static Node<Integer> flat(Node<Integer> head) {
        //Your code goes here
        Node<Integer> newHead = head;
        Node<Integer> newH1 = newHead;
        head = head.next;
        while(head != null || head.next !=null){
            if(head !=null){
                newHead.next = head;
            }else if(head == null && head.next != null ){
                newHead.next = head.next;
            }
            head = head.next;
        }
        return newH1;
    }

    public static LinkedListNode<Integer> nextLargeNumber(LinkedListNode<Integer> head) {
        head = reverseList(head);
        LinkedListNode<Integer> h = null;
        int carry = 0;

        while(head != null){
            int x1 = head != null ? head.data :0;
            int val = (carry + x1)% 10;
            carry = (carry + x1)/10;

            LinkedListNode<Integer> curr = new LinkedListNode<Integer>(val);
            curr.next = h;
            h = curr;

            head = head != null ? head.next : null;
        }

        if(carry != 0){
            LinkedListNode<Integer> curr = new LinkedListNode<Integer>(carry);
            curr.next = h;
            h = curr;
        }
        return h;

    }

    public static LinkedListNode<Integer> reverseList(LinkedListNode<Integer> head){
        LinkedListNode<Integer> last = null;
        while(head != null){
            LinkedListNode<Integer> tmp = head.next; // 5 // 6 // 7 // -1
            head.next = last; // 4 -> null // 5 -> 4 // 6 -> 5 -> 4 // 7 -> 6 -> 5 -> 4
            last = head; // 4 // 5 // 6 // 7
            head = tmp; // 5 // 6 //  7 // -1
        }
        return last;
    }

    public static LinkedListNode<Integer> sort(LinkedListNode<Integer> head) {
        //Your code goes here
        LinkedListNode<Integer> current = head;
        LinkedListNode<Integer> index = null;

        int temp;

        if(head == null){
            return null;
        }
        else{
            while(current != null){
                index = current.next;
                while(index != null){
                    if(current.data > index.data){
                        temp = current.data;
                        current.data = index.data;
                        index.data = temp;
                    }
                    index = index.next;
                }
                current = current.next;
            }
        }
        return head;
    }

    public static int largest(LinkedListNode<Integer> head) {
        int max = Integer.MIN_VALUE;

        while(head != null){
            if(max < head.data){
                max = head.data;
            }
            head = head.next;
        }
        return max;

    }

    public static void changeLL(LinkedListNode<Integer> head) {
        // Write your code here
        LinkedListNode<Integer> temp = head;
        Map<Integer, Integer> mymap = new HashMap<>();
        int max = Integer.MIN_VALUE;

        while(temp != null){
            mymap.put(temp.data, (mymap.get(temp.data) == null?0: mymap.get(temp.data)) + 1);
            if(max < temp.data){
                max = temp.data;
            }
            temp = temp.next;
        }

        while(head != null){
            if(mymap.get(head.data) > 1){
                mymap.put(head.data, -1);
            }
            else if(mymap.get(head.data) == -1){
                head.data = ++max;
            }
            head = head.next;
        }


    }



    public static void main(String[] args) {
//        Node<Integer> n1 = new Node(10);
//        System.out.println(n1);
//        System.out.println(n1.data);
//        System.out.println(n1.next);
        Node<Integer> head1 = takeInput();//createLinkedList();
        Node<Integer> h = flat(head1);
//        Node<Integer> head2 = takeInput();
//        int h = addNumbers(head1,head2);
//        System.out.println(h);
//        printRecursion(head);
//        DoubleNode ans = reverseRbetter(head);
        print(h);
//        Node<Integer> n1 = new Node<>(10);
//        Node<Integer> n2 = new Node<>(20);

//        n2.next = n1;
   //     print(n2);
    }
}
