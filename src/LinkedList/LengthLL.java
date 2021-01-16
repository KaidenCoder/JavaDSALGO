package LinkedList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

class LinkedListNode<T> {
    T data;
    LinkedListNode<T> next;

    public LinkedListNode(T data) {
        this.data = data;
    }
}

class Runner {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static LinkedListNode<Integer> takeInput() throws IOException {
        LinkedListNode<Integer> head = null, tail = null;

        String[] datas = br.readLine().trim().split("\\s");

        int i = 0;
        while(i < datas.length && !datas[i].equals("-1")) {
            int data = Integer.parseInt(datas[i]);
            LinkedListNode<Integer> newNode = new LinkedListNode<Integer>(data);
            if(head == null) {
                head = newNode;
                tail = newNode;
            }
            else {
                tail.next = newNode;
                tail = newNode;
            }
            i += 1;
        }

        return head;
    }

    public static void print(LinkedListNode<Integer> head){
        while(head != null){
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }



    public static void main(String[] args) throws NumberFormatException, IOException {
        int t = Integer.parseInt(br.readLine().trim());

        while (t > 0) {

            LinkedListNode<Integer> head = takeInput();
            System.out.println(LengthLL.length(head));
            System.out.println();

            t -= 1;
        }
    }
}

public class LengthLL {
    public static int length(LinkedListNode<Integer> head){
        //Your code goes here

        int count = 0;
        while(head!= null){
            head = head.next;
            count = count + 1;
        }
        return count;
    }
    public static LinkedListNode<Integer> insert(LinkedListNode<Integer> head, int pos, int data){
        //Your code goes here
        LinkedListNode<Integer> temp = new LinkedListNode(data);
        int count = 0;
        LinkedListNode<Integer> prev = head;
        if(pos == 0){
            temp.next = head;
            head = temp;
        }else {
            while (count < pos - 1 && prev != null) {
                count = count + 1;
                prev = prev.next;
            }
            if (prev != null) {
                temp.next = prev.next;
                prev.next = temp;
            }
        }

        return head;
    }

    public static LinkedListNode<Integer> deleteNode(LinkedListNode<Integer> head, int pos) {
        //Your code goes here
        LinkedListNode<Integer> prev = head;
        int count = 0;
        if(prev == null && prev.next == null){
            return head;
        }
        if(pos == 0){
            head = prev.next;
            return head;
        }else {
            while (count < pos-1) {
                count = count + 1;
                prev = prev.next;
                if(prev == null && prev.next == null){
                    return head;
                }
            }

            if (prev.next != null) {
                prev.next = prev.next.next;
            }


        }
        return head;
    }


    public static int findNode(LinkedListNode<Integer> head, int n) {
        //Your code goes here
        int count = 0;
        while(head != null){
            if(head.data == n){
                return count;
            }
            count = count + 1;
            head = head.next;
        }
        return -1;
    }

    public static LinkedListNode<Integer> appendLastNToFirst(LinkedListNode<Integer> head, int n) {
        //Your code goes here
        LinkedListNode<Integer> c = head;
        int count = 0;
        if(head == null){
            return null;
        }
        if(n == 0){
            return head;
        }
        while(c.next!= null){
            c = c.next; // 7,7, null
            count = count + 1;// 9,10,11
        }

        LinkedListNode<Integer> prev = head;
        LinkedListNode<Integer> original = head;
        int count1= 0;
        while(count1 < count - n){//  < 11 - 7 = 4 - 1 = 3
            prev= prev.next;// 2
            count1 = count1 + 1;//1
        }

        head = prev.next;//3
        c.next = original;
        prev.next = null;

        return head;
    }

    public static LinkedListNode<Integer> removeDuplicates(LinkedListNode<Integer> head) {
        //Your code goes here
        LinkedListNode<Integer> current = head;

        while(current != null && current.next != null){
            if(current.data.equals(current.next.data)){
                current.next = current.next.next;
            }else{
                current = current.next;
            }

        }
        return head;
    }

    public static void printReverse(LinkedListNode<Integer> root) {
        //Your code goes here
        if(root == null){
            return;
        }

        printReverse(root.next);

        System.out.print(root.data+" ");

    }

    public static boolean isPalindrome(LinkedListNode<Integer> head) {
        //Your code goes here
        List<Integer> vals = new ArrayList<>();
        LinkedListNode<Integer> temp = head;

        while(temp != null){
            vals.add(temp.data);
            temp = temp.next;
        }

        int front = 0;
        int back = vals.size() - 1;
        while(front < back){
            if(!vals.get(front).equals(vals.get(back))){
                return false;
            }
            front++;
            back--;
        }
        return true;
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
            LinkedListNode<Integer> res = head.next;
            return res;
        }

        head.next = deleteNodeRec(head.next, pos-1);
        return head;

    }

    public static LinkedListNode<Integer> reverseLinkedListRec(LinkedListNode<Integer> head) {
        //Your code goes here
        if(head == null || head.next == null){
            return head;
        }
        // 10 20 30 40 50
        LinkedListNode<Integer> newNode = reverseLinkedListRec(head.next);
        LinkedListNode<Integer> tail = newNode;
        while(tail.next != null){
            tail = tail.next;
        }

        tail.next = head;
        head.next = null;

        return newNode;
    }

    public static LinkedListNode<Integer> midPoint(LinkedListNode<Integer> head) {
        //Your code goes here
        LinkedListNode<Integer> slow = head;
        LinkedListNode<Integer> fast = head;
        if(head == null){
            return null;
        }
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static LinkedListNode<Integer> mergeTwoSortedLinkedLists(LinkedListNode<Integer> head1, LinkedListNode<Integer> head2) {
        //Your code goes here
        LinkedListNode<Integer> t1 = head1, t2 = head2;
        LinkedListNode<Integer> head = null, tail = null;



        if(head1 == null){
            return head2;
        }

        if( head2 == null){
            return head1;
        }

        if(t1.data < t2.data){
            head  = t1;
            tail = t1;
            t1 = t1.next;
        }else{
            head = t2;
            tail = t2;
            t2 = t2.next;
        }

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
            // while(t1 != null){
            tail.next = t1;
            //     t1 = t1.next;
            // }
        }

        if(t2 != null){
            // while(t2 != null){
            tail.next = t2;
            //     t2 = t2.next;
            // }
        }

        return head;

    }

    public static LinkedListNode<Integer> mergeSort(LinkedListNode<Integer> head) {
        //Your code goes here
        if(head == null || head.next == null){
            return head;
        }

        LinkedListNode<Integer> middle = getMiddle(head);
        LinkedListNode<Integer> nextOfMiddle = middle.next;

        middle.next = null;

        LinkedListNode<Integer> left = mergeSort(head);

        LinkedListNode<Integer> right = mergeSort(nextOfMiddle);

        LinkedListNode<Integer> sortedList = sortedMerge(left, right);
        return sortedList;
    }

    public static LinkedListNode<Integer> sortedMerge(LinkedListNode<Integer> a, LinkedListNode<Integer> b){
        LinkedListNode<Integer> result = null;
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

    public static LinkedListNode<Integer> getMiddle(LinkedListNode<Integer> head){
        if(head == null){
            return head;
        }

        LinkedListNode<Integer> slow = head, fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }


    public static int findNodeR(LinkedListNode<Integer> head, int n) {
        //Your code goes here
        if(head == null){
            return -1;
        }
        int count = 0;
        while(head != null){
            if(head.data == n){
                return count;
            }
            head = head.next;
            count = count + 1;
        }
        return -1;
    }

    public static int findNodeRecursion(LinkedListNode<Integer> head, int n) {
        //Your code goes here
        if(head == null){
            return -1;
        }

        if(head.data.equals(n)){
            return 0;
        }
        int smallAns = findNodeRecursion(head.next, n);
        if(smallAns == -1){
            return -1;
        }

        return smallAns + 1;
    }

    public static LinkedListNode<Integer> evenAfterOdd(LinkedListNode<Integer> head) {
        //Your code goes here
        LinkedListNode<Integer> end = head;
        LinkedListNode<Integer> prev = null;
        LinkedListNode<Integer> curr = head;

        /* Get pointer to last Node */
        while (end.next != null)
            end = end.next;

        LinkedListNode<Integer>new_end = end;

        // Consider all odd nodes before getting first eve node
        while (curr.data %2 !=0 && curr != end)
        {
            new_end.next = curr;
            curr = curr.next;
            new_end.next.next = null;
            new_end = new_end.next;
        }

        // do following steps only if there is an even node
        if (curr.data %2 ==0)
        {
            head = curr;

            // now curr points to first even node
            while (curr != end)
            {
                if (curr.data % 2 == 0)
                {
                    prev = curr;
                    curr = curr.next;
                }
                else
                {
                    /* Break the link between prev and curr*/
                    prev.next = curr.next;

                    /* Make next of curr as null */
                    curr.next = null;

                    /*Move curr to end */
                    new_end.next = curr;

                    /*Make curr as new end of list */
                    new_end = curr;

                    /*Update curr pointer */
                    curr = prev.next;
                }
            }
        }

        /* We have to set prev before executing rest of this code */
        else prev = curr;

        if (new_end != end && end.data %2 != 0)
        {
            prev.next = end.next;
            end.next = null;
            new_end.next = end;
        }
        return new_end;
    }

    public static LinkedListNode<Integer> skipMdeleteN(LinkedListNode<Integer> head, int M, int N) {
        //Your code goes here
        LinkedListNode<Integer> curr = head, t;
        int count = 0;
        if(M == 0){
            return null;
        }
        while(curr != null){
            for(count = 1; count < M && curr != null; count++){
                curr = curr.next;
            }

            if(curr == null){
                return head;
            }

            t = curr.next;
            for(count = 1; count <= N && t != null; count++){
                LinkedListNode<Integer> temp = t;
                t = t.next;
            }

            curr.next = t;
            curr = t;
        }
        return head;
    }


    public static LinkedListNode<Integer> swapNodes(LinkedListNode<Integer> head, int m, int n) {
        //Your code goes here
        LinkedListNode<Integer> first = head;
        LinkedListNode<Integer> second = head;
        LinkedListNode<Integer> h1 = null;

        int count1 = 0;
        int count2 = 0;

        if (m == 0){
            first = head;
        }
        else{
            while(count1 < m - 1){
                first = first.next;
                count1 = count1 + 1;
            }
        }


        while(count2 < n - 1){
            second = second.next;
            count2 = count2 + 1;
        }

        LinkedListNode<Integer> f1 = first.next;
        LinkedListNode<Integer> s1 = second.next;
        LinkedListNode<Integer> s2 = second.next.next;

        if(m == 0){
            h1.next = second.next;
            s1  = f1;
            s1.next = s2;
        }else{
            first.next = second.next; //10 -> 30 ->  40
            s1  = f1; //10 -> 30 -> 20 40
            s1.next = s2; //10 -> 30 -> 20 -> 40
            second.next = first.next;

        }
        return head;
    }


    public static LinkedListNode<Integer> kReverse(LinkedListNode<Integer> head, int k) {
        //Your code goes here
//        LinkedListNode<Integer> temp = null;
//        LinkedListNode<Integer> h1 = head;
//        int count = 0;
//
//        while(count < k){
//            h1 = h1.next;
//            count = count + 1;
//        }
//
//        temp = h1.next;
//
//        h1.next = null;
//        LinkedListNode<Integer> h2 = temp;
//        while(h2 !=null){
//            h2 = h2.next;
//        }
//
//        h2.next = head;
//
//        return head;

        LinkedListNode<Integer> current = head;
        LinkedListNode<Integer> next = null;
        LinkedListNode<Integer> prev = null;

        int count = 0;

        while(count < k && current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            count++;
        }

        if(next != null){
            head.next = kReverse(next, k);
        }

        return prev;
    }

    public static LinkedListNode<Integer> bubbleSort(LinkedListNode<Integer> head) {
        //Your code goes here
        LinkedListNode<Integer> current = head, index = null;
        int temp;

        if(head == null){
            return head;
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

    public static void deleteNode(LinkedListNode<Integer> node) {
        //Your code goes here
        // 1 -> 2 -> 23 -> 42 -> 12
        LinkedListNode<Integer> h = node; // 2 -> 23 -> 42 -> 12
        LinkedListNode<Integer> nextNode = node.next; // 23 -> 42 -> 12


        h.data = nextNode.data; // 23
        h.next = nextNode.next; // 23 -> 42 -> 12

    }

    public static LinkedListNode<Integer> addNumbers(LinkedListNode<Integer> head1, LinkedListNode<Integer> head2) {
        //Your code goes here
        //Your code goes here
        int count = 0;

// 4 -> 5 -> 6 -> 7
        LinkedListNode<Integer> temp = head1;

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

        LinkedListNode<Integer> temp2 = head2;

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

        LinkedListNode<Integer> newh1 = null;
//
//        String temp1 = Integer.toString(total);
//        int[] newGuess = new int[temp1.length()];
//        for (int i = 0; i < temp1.length(); i++)
//        {
//            newGuess[i] = temp1.charAt(i) - '0';
//        }
//


//        Collections.reverse(res);
        newh1 = new LinkedListNode<Integer>(res.get(res.size()-1));

        LinkedListNode<Integer> newh2 = newh1;

//        for(int i = 1; i < newGuess.length; i++){
//            newh1.next = new Node<>(newGuess[i]);
//        }

        for(int i = res.size()- 2; i > -1; i--){
            newh2.next = new LinkedListNode<>(res.get(i));
        }

        return newh2;

    }

    public static LinkedListNode<Integer> addNumbers2(LinkedListNode<Integer> first, LinkedListNode<Integer> second) {
//        LinkedListNode<Integer> dummyHead = new LinkedListNode<>(0);
//        LinkedListNode<Integer> p = first, q = second, curr = dummyHead;
//        int carry = 0;
//        while(p != null || q != null){
//            int x = (p != null) ? p.data: 0;
//            int y = (q != null) ? q.data: 0;
//            int sum = carry + x + y;
//            carry = sum/10;
//            curr.next = new LinkedListNode<>(sum % 10);
//            curr = curr.next;
//            if(p != null){
//                p = p.next;
//            }
//            if(q != null){
//                q = q.next;
//            }
//
//
//        }
//
//        if(carry > 0){
//            curr.next = new LinkedListNode<>(carry);
//        }
//        return dummyHead.next;

//        LinkedListNode<Integer> ln1 = first, ln2 = second, head = null, node = null;
//        int carry = 0, remainder = 0, sum = 0;
//        head = node = new LinkedListNode<>(0);
//
//        while(ln1 != null || ln2 != null || carry != 0){
//            sum = (ln1 != null ? ln1.data : 0) + (ln2 != null ? ln2.data : 0) + carry;
//            carry = sum /10;
//            remainder = sum % 10;
//            node = node.next = new LinkedListNode<>(remainder);
//            ln1 = (ln1 != null ? ln1.next : null);
//            ln2 = (ln2 != null ? ln2.next : null);
//        }
//        return head.next;
        first = reverseList(first);
        second = reverseList(second);

        LinkedListNode<Integer> head = null;
        int carry = 0;
        while(first != null || second != null){
            int x1 = first != null ? first.data : 0;
            int x2 = second != null ? second.data : 0;
            int val = (carry + x1 + x2) % 10;
            carry = (carry + x1 + x2)/ 10;

            LinkedListNode<Integer> curr = new LinkedListNode<>(val);
            curr.next = head;
            head = curr;

            first = first != null ? first.next : null;
            second = second != null ? second.next : null;
        }

        if(carry != 0){
            LinkedListNode<Integer> curr = new LinkedListNode<>(carry);
            curr.next = head;
            head = curr;
        }

        return head;
    }

    public static LinkedListNode<Integer> reverseList(LinkedListNode<Integer> head){
        LinkedListNode<Integer> last = null;
        while(head != null){
            LinkedListNode<Integer> tmp = head.next;
            head.next = last;
            last = head;
            head = tmp;
        }
        return last;
    }

    public static int changelist(LinkedListNode<Integer> h1,LinkedListNode<Integer> h2) {
        //WRITE YOUR CODE HERE

        LinkedListNode<Integer> current1 = h1;
        LinkedListNode<Integer> current2 = h2;
       if(current1 == null || current2 == null){
           return -1;
       }

       while(current1 != null && current2 != null && current1 != current2){
           current1 = current1.next;
           current2 = current2.next;

           if(current1 == current2){
               return current1.data;
           }

           if(current1 == null){
               current1 = h2;
           }
           if(current2 == null){
               current2 = h1;
           }
       }
       return current1.data;
    }

//    public static DoublyLinkedListNode<Integer> sorting(DoublyLinkedListNode<Integer> head) {
//        //Your Code Goes Here
//        if(head == null || head.next == null){
//            return head;
//        }
//
//        DoublyLinkedListNode<Integer> front = head;
//        DoublyLinkedListNode<Integer> last = head;
//
//        DoublyLinkedListNode<Integer> res = new DoublyLinkedListNode<Integer>(null);
//
//        DoublyLinkedListNode<Integer> resEnd = res;
//
//        DoublyLinkedListNode<Integer> next;
//
//        while(last.next != null){
//            last = last.next;
//        }
//
//        while(front != last){
//            if(last.data <= front.data){
//                resEnd.next = last;
//                next = last.prev;
//                last.prev.next = null;
//                last.prev = resEnd;
//                last = next;
//                resEnd = resEnd.next;
//            }
//            else{
//                resEnd.next = front;
//                next = front.next;
//                front.next = null;
//                front.prev = resEnd;
//                front = next;
//                resEnd = resEnd.next;
//            }
//
//        }
//
//        resEnd.next = front;
//        front.prev = resEnd;
//
//        return res.next;
//
//    }


}


