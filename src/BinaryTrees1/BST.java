package BinaryTrees1;

public class BST {

    private BinaryTreeNode<Integer> root;
    private int size;

    private static boolean isPresentHelper(BinaryTreeNode<Integer> root, int x){
        if(root == null){
            return false;
        }
        if(root.data == x){
            return true;
        }

        if(x < root.data){
            return isPresentHelper(root.left, x);
        }else{
            return isPresentHelper(root.right, x);
        }
    }

    public boolean isPresent(int x){
        return isPresentHelper(root, x);

    }

    private static BinaryTreeNode<Integer> insertHelper(BinaryTreeNode<Integer> node, int x){
        if(node == null){
            BinaryTreeNode<Integer> newRoot = new BinaryTreeNode<Integer>(x);
            return newRoot;
        }

        if(x >= node.data){
            node.right = insertHelper(node.right, x);
        }else{
            node.left = insertHelper(node.left, x);
        }
        return node;
    }

    //     15
    //  10    18
    // 5         29
    //3   9
    //2
    public void insert(int x){
        root = insertHelper(root, x);
        size++;
    }

    private static BSTDeleteReturn deleteDatahelper(BinaryTreeNode<Integer> root, int x){
        if(root == null){
            return new BSTDeleteReturn(null, false);
        }

        if(root.data < x){
            BSTDeleteReturn outputRight = deleteDatahelper(root.right, x);
            root.right = outputRight.root;
            outputRight.root = root;
            return outputRight;
        }
        if(root.data > x){
            BSTDeleteReturn outputLeft = deleteDatahelper(root.left, x);
            root.left = outputLeft.root;
            outputLeft.root = root;
            return outputLeft;
        }

        // 0 children
        if(root.left == null && root.right == null){
            return new BSTDeleteReturn(null, true);
        }

        // only left child
        if(root.left != null && root.right == null){
            return new BSTDeleteReturn(root.left, true);
        }

        // only right child
        if(root.left == null && root.right != null){
            return new BSTDeleteReturn(root.right, true);
        }

        // both children are present
        int rightMin= minimum(root.right);
        root.data = rightMin;
        BSTDeleteReturn outputRight = deleteDatahelper(root.right, rightMin);
        root.right = outputRight.root;
        return new BSTDeleteReturn(root, true);
    }

    private static int minimum(BinaryTreeNode<Integer> root){
        if(root == null){
            return Integer.MAX_VALUE;
        }
        int minLeft = minimum(root.left);
        int minRight = minimum(root.right);
        return Math.min(root.data, Math.min(minLeft, minRight));
    }

    public boolean deleteData(int x){
        BSTDeleteReturn output = deleteDatahelper(root, x);
        root = output.root;
        if(output.deleted){
            size--;
        }
        return output.deleted;
    }

    public int size(){
        return size;
    }

    private static void printTreeHelper(BinaryTreeNode<Integer> root){
        if(root == null){
            return;
        }
        System.out.print(root.data + ":");
        if(root.left != null){
            System.out.print("L" + root.left.data);
        }
        if(root.right != null){
            System.out.print(", R" + root.right.data);
        }
        System.out.println();
        printTreeHelper(root.left);
        printTreeHelper(root.right);
    }

    public void printTree(){
        printTreeHelper(root);
    }

}
