package Test8;

public class VerticalOrder {



    class BinaryTreeNode<T> {
        T data;
        BinaryTreeNode<T> left;
        BinaryTreeNode<T> right;

        public BinaryTreeNode(T data) {
            this.data = data;
        }
    }

    public static void printBinaryTreeVerticalOrder(BinaryTreeNode<Integer> root){
        /* Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Print output and don't return it.
         * Taking input is handled automatically.
         */
        Values val = new Values();
        findMinMax(root, val, val, 0);
        for(int i = val.min; i <= val.max; i++){
            printVertical(root, i, 0);
            System.out.println("");
        }

    }

    public static void printVertical(BinaryTreeNode<Integer> node, int i, int hd){
        if(node == null){
            return;
        }
        if(hd == i){
            System.out.print(node.data+" ");
        }

        printVertical(node.left, i, hd -1);
        printVertical(node.right, i , hd+1);
    }

    public static void findMinMax(BinaryTreeNode<Integer> node, Values min, Values max, int hd){
        if(node == null){
            return;
        }
        if(hd < min.min){
            min.min = hd;
        }
        else if(hd > max.max){
            max.max = hd;
        }

        findMinMax(node.left, min, max, hd-1);
        findMinMax(node.right, min, max, hd+1);
    }

}

class Values
{
    int max, min;
}