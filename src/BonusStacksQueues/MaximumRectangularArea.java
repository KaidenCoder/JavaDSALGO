package BonusStacksQueues;

import java.util.Scanner;
import java.util.Stack;

// 1 1 1 1 1 0
// 1 0 1 1 0 1
// 1 0 0 1 0 0



public class MaximumRectangularArea {

    // Driver code
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int R = s.nextInt();
        int C = s.nextInt();
        int A[][] = new int[R][C];
        for( int i =0; i < R; i++){
            for(int j = 0;  j < C; j++){
                A[i][j] = s.nextInt();
            }
        }
        if(R == 0){
            System.out.println(0);
        }else{
            System.out.print(maxRec(R, C, A));
        }
    }

    private static int maxRec(int R, int C, int[][] A) {
        int result = maxhist(R, C, A[0]); // 1, 1, 1
        for(int i = 1; i < R; i++){ //
            for(int j = 0; j < C; j++){
                if(A[i][j] == 1){ // 1
                    A[i][j] += A[i - 1][j]; // 2 0 2
                }
            }
            result = Math.max(result, maxhist(R, C, A[i]));
        }
        return result;
    }

    public static int maxhist(int R, int C, int row[]){
        Stack<Integer> result = new Stack<Integer>();

        int top_val;

        int max_area = 0;

        int area = 0;

        int i = 0;
        while(i < C){
            if (result.empty()
                    || row[result.peek()] <= row[i]){
                result.push(i++); // 1, 1, 1
            }
            else{
                top_val = row[result.peek()];
                result.pop();
                area = top_val * i;

                if(!result.empty()){
                    area = top_val * (i - result.peek() - 1);
                }
                max_area = Math.max(area, max_area);
            }
        }

        while(!result.empty()){
            top_val = row[result.peek()];
            result.pop();
            area = top_val * i;
            if(!result.empty()){
                area = top_val * (i  -result.peek() - 1);
            }
            max_area = Math.max(area, max_area);
        }
        return max_area;
    }
}
