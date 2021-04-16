package Test7;

public class LinkedListMatrix {


    public static void main(String[] args) {

    }

    static Node construct(int arr[][],int n)
    {

        Node mainHead = null;

        Node[] head = new Node[n];
        Node rightTemp = null, newptr;

        for(int i = 0; i < n; i++){
            head[i] = null;
            for(int j = 0; j < n; j++){
                newptr = new Node(arr[i][j]);
                if(mainHead == null){
                    mainHead = newptr;
                }
                if(head[i] == null){
                    head[i] = newptr;
                } else {
                    rightTemp.right = newptr;
                }
                rightTemp = newptr;
            }
        }

        for(int i = 0; i < n-1; i++){
            Node temp1 = head[i], temp2 = head[i+1];
            while(temp1 != null && temp2 != null){
                temp1.down = temp2;
                temp1 = temp1.right;
                temp2 = temp2.right;
            }
        }

        return mainHead;

    }

    private static Node helper(int[][] arr, int i, int j, int m, int n) {
        if( i > n -1 || j > m - 1){
            return null;
        }

        Node temp = null;

        temp.data = arr[i][j];

        temp.right = helper(arr, i , j+1, m, n);
        temp.down = helper(arr, i+1, j, m, n);
        return temp;
    }

}

class Node{
    int data;
    Node right,down;
    Node(int data){
        this.data=data;
        right=null;
        down=null;
    }
}

