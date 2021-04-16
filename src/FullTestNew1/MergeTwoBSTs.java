package FullTestNew1;
import java.util.Scanner;

class MergeTwoBSTs {
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
        BinaryTreeNode<Integer> root1 = takeInput();
        BinaryTreeNode<Integer> root2 = takeInput();



        printMergeTrees(root1,root2);


    }
    static void printMergeTrees(BinaryTreeNode<Integer> root1,
                                BinaryTreeNode<Integer> root2) {
        /*
         * Your class should be named Solution.Dont write main().Dont take
         * input, it is passed as function argument.Print output as specified in
         * question.
         */
        if(root1 != null && root2 != null){
            return;
        }

        if(root1 == null){
            inorder(root2);
            return;
        }

        if(root2 == null){
            inorder(root1);
            return;
        }

        BinaryTreeNode<Integer> temp1 = root1;
        BinaryTreeNode<Integer> prev1 = null;

        while(temp1.left != null){
            prev1 = temp1;
            temp1 = temp1.left;
        }

        BinaryTreeNode<Integer> temp2 = root1;
        BinaryTreeNode<Integer> prev2 = null;

        while(temp2.left != null){
            prev2 = temp2;
            temp2 = temp2.left;
        }

        if(temp1.data <= temp2.data){
            System.out.print(temp1.data + " ");
            if(prev1 == null){
                printMergeTrees(root1.left, root2);
            }else{
                prev1.left = temp1.right;
                printMergeTrees(root1, root2);
            }
        }else{
            System.out.print(temp2.data + " ");
            if(prev2 == null){
                printMergeTrees(root1, root2.right);
            }else{
                prev2.left = temp2.right;
                printMergeTrees(root1, root2);
            }
        }

    }

    public static void inorder(BinaryTreeNode<Integer> root){
        if(root != null){
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }
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

