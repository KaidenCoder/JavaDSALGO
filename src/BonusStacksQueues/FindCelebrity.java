package BonusStacksQueues;

import java.util.Scanner;
import java.util.Stack;

public class FindCelebrity {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int R = s.nextInt();
        int C = s.nextInt();
        int A[][] = new int[R][C];
        for( int i =0; i < R; i++){
            for(int j = 0;  j < C; j++){
                A[i][j] = s.nextInt();
            }
        }
    }

    public static  boolean knows(int[][]arr, int a, int b){
        boolean res = (arr[a][b] == 1) ? true: false; // 2,1 // 1,0
        return res;
    }

    public static int celebrity(int[][] arr, int n) {
        //Write your code here
        Stack<Integer> st = new Stack<>();
        int c;

        for(int i = 0; i < n; i++){
            st.push(i); // 0 1 2
        }

        while(st.size() > 1){
            int a = st.pop(); // 2
            int b = st.pop(); // 1

            if(knows(arr, a,b)){
                st.push(b); // 1
            }else{
                st.push(a);
            }
        }

        c = st.pop();// 1

        for(int i = 0; i < n; i++){
            if(i != c && (knows(arr, c, i) || !knows(arr, i, c))){
                return -1;
            }
        }

        return c;

    }

}
