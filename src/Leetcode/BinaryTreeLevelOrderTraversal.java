package Leetcode;


import java.util.ArrayList;
import java.util.List;

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
         this.left = left;
         this.right = right;
    }
}

public class BinaryTreeLevelOrderTraversal {
    public static void main(String[] args) {

    }

    List<List<Integer>> li = new ArrayList<List<Integer>>();

    public List<List<Integer>> levelOrder(TreeNode root) {
        helper(root, 0);
        return li;
    }


    public void helper (TreeNode root, int level){
       if(root == null){
           return;
       }

       if(li.size() == level){
           li.add(new ArrayList<Integer>());
       }

       li.get(level).add(root.val);

       helper(root.left, level + 1);
       helper(root.right, level + 1);
    }




}