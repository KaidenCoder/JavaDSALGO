package BinarySearch.IO;
import java.util.*;


public class InvertedSubTree {
    String s = "";
    String t = "";

    public static void main(String[] args) {

    }

    public boolean solve(Tree source, Tree target) {

        helper(source);
        helper2(target);

        StringBuilder ss = new StringBuilder();
        ss.append(s);
        ss.reverse();

        if(t.contains(ss)){
            return true;
        }
        return false;
    }


    public void helper(Tree node){
        if(node == null){
            return;
        }

        helper(node.left);
        helper(node.right);
        s += String.valueOf(node.val);
    }

    public void helper2(Tree node){
        if(node == null){
            return;
        }

        helper2(node.left);
        helper2(node.right);
        t += String.valueOf(node.val);
    }
}





