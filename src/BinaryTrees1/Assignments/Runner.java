package BinaryTrees1.Assignments;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class QueueEmptyException extends Exception {

}

class QueueUsingLL<T> {

    class Node<T> {
        T data;
        Node<T> next;
        Node(T data){
            this.data = data;
        }
    }

    private Node<T> head;
    private Node<T> tail;
    private int size = 0;

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        if(size == 0){
            return true;
        }
        return false;
    }

    public T front() throws QueueEmptyException{
        if(size == 0){
            QueueEmptyException e = new QueueEmptyException();
            throw e;
        }

        return head.data;
    }


    public void enqueue(T element){
        Node<T> newNode = new Node<T>(element);

        if(head == null){
            head = newNode;
            tail = newNode;
        }
        else{
            tail.next = newNode;
            tail = newNode;
        }

        size++;
    }

    public T dequeue() throws QueueEmptyException{
        if(head == null){
            QueueEmptyException e = new QueueEmptyException();
            throw e;
        }
        if(head == tail){
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
        this.left = null;
        this.right = null;
    }
}

class Pair<T, U> {
    T minimum;
    U maximum;

    public Pair(T minimum, U maximum) {
        this.minimum = minimum;
        this.maximum = maximum;
    }

}

public class Runner {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static BinaryTreeNode<Integer> takeInput() throws NumberFormatException, IOException {
        QueueUsingLL<BinaryTreeNode<Integer>>  pendingNodes = new QueueUsingLL<BinaryTreeNode<Integer>>();
        int start = 0;

        String[] nodeDatas = br.readLine().trim().split(" ");

        if (nodeDatas.length == 1) {
            return null;
        }

        int rootData = Integer.parseInt(nodeDatas[start]);
        start += 1;

        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
        pendingNodes.enqueue(root);

        while(!pendingNodes.isEmpty()){
            BinaryTreeNode<Integer> currentNode;
            try {
                currentNode = pendingNodes.dequeue();
            } catch (QueueEmptyException e) {
                return null;
            }

            int leftChildData = Integer.parseInt(nodeDatas[start]);
            start += 1;

            if(leftChildData != -1){
                BinaryTreeNode<Integer> leftChild = new BinaryTreeNode<Integer>(leftChildData);
                currentNode.left = leftChild;
                pendingNodes.enqueue(leftChild);
            }

            int rightChildData = Integer.parseInt(nodeDatas[start]);
            start += 1;

            if(rightChildData != -1){
                BinaryTreeNode<Integer> rightChild = new BinaryTreeNode<Integer>(rightChildData);
                currentNode.right = rightChild;
                pendingNodes.enqueue(rightChild);
            }
        }

        return root;
    }


    private static void printLevelWise(BinaryTreeNode<Integer> root){
        QueueUsingLL<BinaryTreeNode<Integer>>  primary = new QueueUsingLL<>();
        QueueUsingLL<BinaryTreeNode<Integer>>  secondary = new QueueUsingLL<>();

        primary.enqueue(root);

        while(!primary.isEmpty()){
            BinaryTreeNode<Integer> current=null;
            try {
                current = primary.dequeue();
            } catch (QueueEmptyException e) {
                System.out.println("Not possible");
            }
            System.out.print(current.data + " ");
            if(current.left != null){
                secondary.enqueue(current.left);
            }
            if(current.right != null){
                secondary.enqueue(current.right);
            }
            if(primary.isEmpty()){
                QueueUsingLL<BinaryTreeNode<Integer>>  temp = secondary;
                secondary = primary;
                primary = temp;
                System.out.println();
            }
        }
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        BinaryTreeNode<Integer> root = takeInput();

        Pair<Integer, Integer> pair = Solution.getMinAndMax(root);
        System.out.println(pair.minimum + " " + pair.maximum);

    }
}

class Solution {

    public static Pair<Integer, Integer> getMinAndMax(BinaryTreeNode<Integer> root) {
        getMinAndMaxHelper(root);
        return null;
    }


    public static Pair<Integer, Integer> getMinAndMaxHelper(BinaryTreeNode<Integer> root) {
        //Your code goes here
        if(root == null){
            return null;
        }

        BinaryTreeNode<Integer> current = root;
        BinaryTreeNode<Integer> pre;

        int max_value = Integer.MIN_VALUE;
        int min_value = Integer.MAX_VALUE;

        while(current != null){
            if(current.left == null){
                max_value = Math.max(max_value, current.data);
                min_value = Math.min(min_value, current.data);

                current = current.right;
            }
            else{
                pre = current.left;
                while(pre.right != null && pre.right != current){
                    pre = pre.right;

                }
                if(pre.right == null){
                    pre.right = current;
                    current = current.left;
                }
                else{
                    pre.right = null;
                    max_value = Math.max(max_value, current.data);
                    min_value = Math.min(min_value, current.data);

                    current = current.right;
                }
            }
        }



        return new Pair(min_value, max_value);
    }

}
