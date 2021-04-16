package demo;

public class findMaxDifference {

    public static void main(String[] args) {
        int[][] arr = {{9,9,5,1},{4,5,8,0},{7,0,9,7},{5,5,5,6}};
        System.out.print(findMaxDiff(arr, arr.length));
    }


    public static int findMaxDiff(int[][] mat, int N){
        /* Your class should be named solution.
         * Don't write main().
         * Don't take input, it is passed as function argument.
         * Don't print output.
         * Taking input and printing output is handled automatically.
         */
//        int max = Integer.MIN_VALUE;
//        for(int i = 0; i < N - 1; i++){
//            for(int j = 0; j < N - 1; j++){
//                int diff = mat[i+1][j+1] - mat[i][j];
//                System.out.print(diff + " ");
//                max = Math.max(max, diff);
//            }
//        }
//        return max;
        return 1;
    }

}
