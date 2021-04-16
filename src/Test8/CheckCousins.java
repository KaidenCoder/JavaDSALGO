package Test8;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class CheckCousins {

//    	Binary Tree Node class
	  class BinaryTreeNode<T> {
		T data;
		BinaryTreeNode<T> left;
		BinaryTreeNode<T> right;

		public BinaryTreeNode(T data) {
			this.data = data;
		}
	}

    public static boolean isCousin(BinaryTreeNode<Integer> root, int p, int q) {
        if(root == null){
            return false;
        }

        Queue<BinaryTreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            int size = queue.size();

            Set<Integer> set = new HashSet<>();
            for(int i = 0; i < size; i++){
                BinaryTreeNode<Integer> node = queue.poll();
                set.add(node.data); // 5, 6, 10, 2, 3, 4
                if(node.left != null){
                    queue.offer(node.left); // queue(6), queue(2), queue(4)
                }
                if(node.right != null){
                    queue.offer(node.right); // queue(10), queue(3)
                }

                if(node.left != null && node.right != null){
                    if(node.left.data == p && node.right.data == q){
                        return false;
                    }
                    if(node.left.data == q && node.right.data == p){
                        return false;
                    }
                }
            }
            if(set.contains(p) && set.contains(q)){
                return true;
            }
        }
        return false;

    }


}
