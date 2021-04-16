package FullTest2;
import java.util.*;

public class SumInBST {

    public static int ksmallestElementSum(BinaryTreeNode<Integer> root, int k) {
        /*
         * Your class should be named Solution.Don't write main().Don't take
         * input, it is passed as function argument.Don't print output.Taking
         * input and printing output is handled automatically.
         */
        Integer[] values = extractValues(root).toArray(new Integer[] {});
        Arrays.sort(values);
        int sum = 0;
        for(int i = 0 ; i < k; i++){
            sum += values[i];
        }
        return sum;

    }



    private static List<Integer> extractValues(BinaryTreeNode<Integer> n) {
        List<Integer> result = new ArrayList<>();
        if (n.left != null) {
            result.addAll(extractValues(n.left));
        }

        if (n.right != null) {
            result.addAll(extractValues(n.right));
        }

        result.add(n.data);

        return result;
    }


//    public static ArrayList<Integer> convertArray(BinaryTreeNode<Integer> root){
//        ArrayList<Integer> arr = new ArrayList<>();
//        if(root.left != null){
//            arr.add(convertArray(root.left));
//        }
//
//        if(root.right != null){
//            arr.add(convertArray(root.right));
//        }
//
//        arr.add(root.data);
////        Collections.sort(arr);
////        int sum = 0;
////        for(int i = 0 ; i < k; i++){
////            sum += arr.get(i);
////        }
//        return arr;
//    }
}






class QueueEmptyException extends Exception {
}

class Queue<T> {

    class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
        }
    }

    private Node<T> head;
    private Node<T> tail;
    private int size = 0;

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        }
        return false;
    }

    public T front() throws QueueEmptyException {
        if (size == 0) {
            QueueEmptyException e = new QueueEmptyException();
            throw e;
        }

        return head.data;
    }

    public void enqueue(T element) {
        Node<T> newNode = new Node<T>(element);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }

        size++;
    }

    public T dequeue() throws QueueEmptyException {
        if (head == null) {
            QueueEmptyException e = new QueueEmptyException();
            throw e;
        }
        if (head == tail) {
            tail = null;
        }
        T temp = head.data;
        head = head.next;
        size--;
        return temp;
    }
}

class BinaryTreeNode<T> {
    T data;
    BinaryTreeNode<T> left;
    BinaryTreeNode<T> right;

    public BinaryTreeNode(T data) {
        this.data = data;
    }
    public void setRight(BinaryTreeNode<T> root)
    {
        right=root;

    }
    public void setLeft(BinaryTreeNode<T> root)
    {
        left=root;

    }
}

class Runner {

    static Scanner s = new Scanner(System.in);


    public static BinaryTreeNode<Integer> takeInput() {
        Queue<BinaryTreeNode<Integer>> pendingNodes = new Queue<BinaryTreeNode<Integer>>(); // we
        // can
        // skip
        // writing
        // again
        // inside
        // <>
        // after
        // java
        // version
        // 1.7

        int rootData = s.nextInt();
        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
        pendingNodes.enqueue(root);

        while (!pendingNodes.isEmpty()) {
            BinaryTreeNode<Integer> currentNode;
            try {
                currentNode = pendingNodes.dequeue();
            } catch (QueueEmptyException e) {
                return null;
            }
            int leftChildData = s.nextInt();
            if (leftChildData != -1) {
                BinaryTreeNode<Integer> leftChild = new BinaryTreeNode<Integer>(
                        leftChildData);
                currentNode.left = leftChild;
                pendingNodes.enqueue(leftChild);
            }
            int rightChildData = s.nextInt();
            if (rightChildData != -1) {
                BinaryTreeNode<Integer> rightChild = new BinaryTreeNode<Integer>(
                        rightChildData);
                currentNode.right = rightChild;
                pendingNodes.enqueue(rightChild);
            }
        }

        return root;
    }

    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = takeInput();
        int k=s.nextInt();

        System.out.println(SumInBST.ksmallestElementSum(root,k));

    }

}