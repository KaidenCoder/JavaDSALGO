package BinaryTrees1;

import java.util.*;

public class DeepestSumLeaves {

    public static void main(String[] args) {
        TreeNode root = takeTreeInputBetter(true, 0, true);
        printTreeDetailed(root);
        System.out.println("Height is:" + height(root));
        System.out.println(deepestLeavesSum(root));
    }


    public static int deepestLeavesSum(TreeNode root) {
        int level = 0;
        int depth = height(root);
        int arr[] = new int[depth];
        int sum = helper(root, level, arr);
        System.out.println(sum);

        return sum;
    }

    public static int helper(TreeNode root, int level, int[] arr) {

        if(root == null){
            return 0;
        }
        int num = arr[level] == 0 ? 0 : arr[level];

        arr[level] = num + root.val;
//        arr.add(level, num + root.val);
        System.out.println(arr[level] + ", level: " + level);
        helper(root.left, level + 1, arr);
        helper(root.right, level + 1, arr);
//        ArrayList<Integer> arr = new ArrayList<>();
//        Stack stack = new Stack();
//        int max_level = Integer.MIN_VALUE;
////        String str = "";
//        if (root == null) {
//            return 0;
//        }
//
//        if(level > max_level){
//            max_level = level;
//            sum  = root.val;
//
//        } else if(level == max_level){
//            sum = sum + root.val;
//            System.out.println("sum " + sum);
//        }
//        helper(root.left, level+1);
//        helper(root.right, level + 1);


//        else {
//            int left = helper(root.left, level + 1, depth);
////            arr.add(root.val);
//            int right = helper(root.right, level + 1, depth);
//            if (level == depth) {
//                return sum + root.val + left + right;
//            }
//
//        }
        return arr[arr.length - 1];
    }
//        if(level < depth -1){
//            helper(root.left, level + 1, depth);
////            arr.add(root.val);
//           helper(root.right, level + 1, depth);
//
//        }
//        else if(level == depth -1){
//            System.out.println(root.val);
//            arr.add(root.val);
//            System.out.println("arr: " + arr);
//            stack.add(root.val);
//            str += root.val;
//            arr.add(root.val);
//            sum += root.val;
//            System.out.println("sum: " + sum);
//        }
//        System.out.println("arr: " + arr);
//        System.out.println("sum: " + sum);

//    }

    public static int height(TreeNode root){
        if(root == null){
            return 0;
        } else {
            int lheight = height(root.left);
            int rheight = height(root.right);

            if(lheight > rheight){
                return (lheight + 1);
            } else {
                return (rheight + 1);
            }
        }
    }



    public static TreeNode takeTreeInputBetter(boolean isRoot, int parentData, boolean isLeft){
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

        TreeNode root = new TreeNode(rootData);
        TreeNode leftChild = takeTreeInputBetter(false, rootData, true);
        TreeNode rightChild = takeTreeInputBetter(false, rootData, false);

        root.left = leftChild;
        root.right = rightChild;
        return root;

    }

    public static void printTreeDetailed(TreeNode root){
        if(root == null){
            return;
        }
        System.out.print(root.val + ":");
        if(root.left != null){
            System.out.print("L" + root.left.val);
        }
        if(root.right != null){
            System.out.print(", R" + root.right.val);
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
}
