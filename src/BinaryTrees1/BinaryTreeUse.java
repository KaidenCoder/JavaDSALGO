package BinaryTrees1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinaryTreeUse {

    public static BinaryTreeNode<Integer> takeTreeInputBetter(boolean isRoot, int parentData, boolean isLeft){
        if(isRoot){
            System.out.println("Enter root data");
        }else{
            if(isLeft){
                System.out.println("Enter left child of " + parentData);
            }else{
                System.out.println("Enter right child of " + parentData);
            }
        }

        Scanner s = new Scanner(System.in);
        int rootData = s.nextInt();

        if(rootData == -1){
            return null;
        }

        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
        BinaryTreeNode<Integer> leftChild = takeTreeInputBetter(false, rootData, true);
        BinaryTreeNode<Integer> rightChild = takeTreeInputBetter(false, rootData, false);

        root.left = leftChild;
        root.right = rightChild;
        return root;

    }

    public static BinaryTreeNode<Integer> takeTreeInput(){
        System.out.println("Enter root data");
        Scanner s = new Scanner(System.in);
        int rootData = s.nextInt();

        if(rootData == -1){
            return null;
        }

        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
        BinaryTreeNode<Integer> leftChild = takeTreeInput();
        BinaryTreeNode<Integer> rightChild = takeTreeInput();
        root.left = leftChild;
        root.right = rightChild;
        return root;

    }

    public static void printTreeDetailed(BinaryTreeNode<Integer> root){
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
        printTreeDetailed(root.left);
        printTreeDetailed(root.right);
//        if(root.left != null){
//            printTree(root.left);
//        }
//        if(root.right != null){
//            printTree(root.right);
//        }
    }

    public static void printTree(BinaryTreeNode<Integer> root){
        if(root == null){
            return;
        }
        System.out.println(root.data);
        printTree(root.left);
        printTree(root.right);
//        if(root.left != null){
//            printTree(root.left);
//        }
//        if(root.right != null){
//            printTree(root.right);
//        }
    }

    public static int numNodes(BinaryTreeNode<Integer> root){

        if(root == null){
            return 0;
        }

        int leftNodeCount = numNodes(root.left);
        int rightNodeCount = numNodes(root.right);
        return 1 + leftNodeCount + rightNodeCount;

    }

    public static int getSum(BinaryTreeNode<Integer> root) {
        //Your code goes here.

        if(root == null){
            return 0;
        }
        int sum = root.data;

        int leftNodeCount =  getSum(root.left);
        int rightNodeCount =  getSum(root.right);
        return sum + leftNodeCount + rightNodeCount;
    }

    public static void preOrder(BinaryTreeNode<Integer> root) {
        //Your code goes here
        if(root == null){
            return;
        }
        System.out.println(root.data+ " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void postOrder(BinaryTreeNode<Integer> root) {
        //Your code goes here
        if(root == null){
            return;
        }

        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.data+ " ");
    }

    public static int largest(BinaryTreeNode<Integer> root){
        if(root == null){
            return -1;
        }
        int largestLeft = largest(root.left);
        int largestRight = largest(root.right);
        return Math.max(root.data, Math.max(largestLeft, largestRight));
    }

    public static int countNodesGreaterThanX(BinaryTreeNode<Integer> root, int x) {
        //Your code goes here
        if(root == null){
            return 0;
        }


        int largestLeft = countNodesGreaterThanX(root.left,x);
        int largestRight = countNodesGreaterThanX(root.right,x);
        if(root.data > x){
            return 1 + largestLeft + largestRight;
        }

        return largestLeft + largestRight;

    }

    public static int height(BinaryTreeNode<Integer> root) {
        //Your code goes here
        if(root == null){
            return 0;
        }else{
            int lDepth = height(root.left);
            int rDepth = height(root.right);

            if(lDepth > rDepth){
                return lDepth + 1;
            }else{
                return rDepth + 1;
            }
        }

    }

    public static int numLeaves(BinaryTreeNode<Integer> root){
        if(root == null){
            return 0;
        }
        if(root.left == null && root.right == null){
            return 1;
        }

        return numLeaves(root.left) + numLeaves(root.right);
    }

    public static void printAtDepthK(BinaryTreeNode<Integer> root, int k){
        if(root == null){
            return;
        }
        if(k == 0){
            System.out.println(root.data);
            return;
        }
        printAtDepthK(root.left, k -1);
        printAtDepthK(root.right, k - 1);
    }

    public static void changeToDepthTree(BinaryTreeNode<Integer> root) {
        //Your code goes here
        if(root == null){
            return;
        }
        int level = 0;
        replaceNode(root, level);
    }

    public static void replaceNode(BinaryTreeNode<Integer> root, int level){
        root.data = level;
        replaceNode(root.left, level + 1);
        replaceNode(root.right, level + 1);
    }

    public static boolean isNodePresent(BinaryTreeNode<Integer> root, int x) {
        //Your code goes here
        if(root == null){
            return false;
        }
        if(root.data == x){
            return true;
        }

        if(isNodePresent(root.left, x)) return true;
        if(isNodePresent(root.right, x)) return true;
        return false;
    }

    public static void printNodesWithoutSibling(BinaryTreeNode<Integer> root) {
        //Your code goes here

        if(root == null){
            return;
        }

        if(root.left != null && root.right != null){
            printNodesWithoutSibling(root.left);
            printNodesWithoutSibling(root.right);
        }
        else if(root.left != null){
            System.out.println(root.left.data);
            printNodesWithoutSibling(root.left);
        }
        else if(root.right != null){
            System.out.println(root.right.data);
            printNodesWithoutSibling(root.right);
        }

    }

    public static BinaryTreeNode<Integer> removeLeaves(BinaryTreeNode<Integer> root){
        if(root == null){
            return null;
        }

        if(root.left == null && root.right == null){
            return null;
        }

        root.left = removeLeaves(root.left);
        root.right = removeLeaves(root.right);
        return root;

    }

    public static void mirrorBinaryTree(BinaryTreeNode<Integer> root){
        //Your code goes here
        mirrorTree(root);

    }

    public static BinaryTreeNode<Integer> mirrorTree(BinaryTreeNode<Integer> root){
        if(root == null){
            return null;
        }

        BinaryTreeNode<Integer> left = mirrorTree(root.left);
        BinaryTreeNode<Integer> right = mirrorTree(root.right);

        root.left = right;
        root.right = left;

        return root;
    }

    public static boolean isBalanced(BinaryTreeNode<Integer> root){

        if(root == null){
            return true;
        }

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        if(Math.abs(leftHeight - rightHeight) > 1){
            return false;
        }

        boolean isLeftBalance = isBalanced(root.left);
        boolean isRightBalance = isBalanced(root.right);

        return isLeftBalance && isRightBalance;

    }

    public static BalancedTreeReturn isBalancedBetter(BinaryTreeNode<Integer> root){
        if(root == null){
            int height = 0;
            boolean isBal = true;
            BalancedTreeReturn ans = new BalancedTreeReturn();
            ans.height = height;
            ans.isBalanced = isBal;
            return ans;
        }

        BalancedTreeReturn leftOutput = isBalancedBetter(root.left);
        BalancedTreeReturn rightOutput = isBalancedBetter(root.right);
        boolean isBal = true;
        int height = 1 + Math.max(leftOutput.height, rightOutput.height);

        if(Math.abs(leftOutput.height - rightOutput.height) > 1){
            isBal = false;
        }

        if(!leftOutput.isBalanced || !rightOutput.isBalanced){
            isBal = false;
        }

        BalancedTreeReturn ans = new BalancedTreeReturn();
        ans.height = height;
        ans.isBalanced = isBal;
        return ans;

    }

    static int ans;

    public static int diameterOfBinaryTree(BinaryTreeNode<Integer> root){
        ans = 1;
        depth(root);
        return ans - 1;
    }

    private static int depth(BinaryTreeNode<Integer> root) {
        if(root == null){
            return 0;
        }
        int L = depth(root.left);
        int R = depth(root.right);
        ans = Math.max(ans, L + R + 1);
        return Math.max(L, R) + 1;
    }

    public static BinaryTreeNode<Integer> takeInputLevelWise(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter root data");
        int rootData = s.nextInt();

        if(rootData == -1){
            return null;
        }

        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
        Queue<BinaryTreeNode<Integer>> pendingChildren = new LinkedList<BinaryTreeNode<Integer>>();

        pendingChildren.add(root);

        while(pendingChildren.isEmpty()){
            BinaryTreeNode<Integer> front = pendingChildren.poll();
            System.out.println("Enter left child of" + front.data);
            int left = s.nextInt();
            if(left != -1){
                BinaryTreeNode<Integer> leftChildNode = new BinaryTreeNode<Integer>(left);
                front.left = leftChildNode;
                pendingChildren.add(leftChildNode);
            }

            System.out.println("Enter right child of" + front.data);
            int right = s.nextInt();
            if(right != -1){
                BinaryTreeNode<Integer> rightChildNode = new BinaryTreeNode<Integer>(right);
                front.right = rightChildNode;
                pendingChildren.add(rightChildNode);
            }
        }
        return root;
    }

    public static void printLevelWise(BinaryTreeNode<Integer> root) {
        //Your code goes here
        if(root == null){
            return;
        }

        Queue<BinaryTreeNode<Integer>> q = new LinkedList<BinaryTreeNode<Integer>>();
        q.add(root);

        while(true){
            int count = q.size();
            if(count == 0){
                break;
            }

            while(count > 0){
                BinaryTreeNode<Integer> node = q.peek();
                System.out.print(node.data + " ");
                q.remove();
                if(node.left != null){
                    q.add(node.left);
                }
                if(node.right != null){
                    q.add(node.right);
                }
                count--;
            }
        }
    }



    public static void main(String[] args) {
//        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(1);
//
//        BinaryTreeNode<Integer> rootLeft = new BinaryTreeNode<Integer>(2);
//        BinaryTreeNode<Integer> rootRight = new BinaryTreeNode<Integer>(3);
//        root.left = rootLeft;
//        root.right = rootRight;
//        BinaryTreeNode<Integer> rootTwoRight= new BinaryTreeNode<Integer>(4);
//        BinaryTreeNode<Integer> rootThreeLeft  = new BinaryTreeNode<Integer>(5);
//        rootLeft.right = rootTwoRight;
//        rootRight.left = rootThreeLeft;
        BinaryTreeNode<Integer> root = takeTreeInputBetter(true, 0, true);
       // printTree(root);
        printTreeDetailed(root);
        System.out.println("Nodes "+countNodesGreaterThanX(root, 2));
    }

}
