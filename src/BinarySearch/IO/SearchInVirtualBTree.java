package BinarySearch.IO;

public class SearchInVirtualBTree {



    public static void main(String[] args) {

    }

    boolean found = false;

    public boolean solve(Tree root, int target) {

        helper(root, target, found);
        return found;
    }

    public void helper(Tree root, int target, boolean found){
        if(root == null){
            return;
        }

        helper(root.left, target, found);
        helper(root.right, target, found);

        if(root.val == target){
            found = true;
        }

    }

}

 class Tree {
    int val;
    Tree left;
    Tree right;
  }
