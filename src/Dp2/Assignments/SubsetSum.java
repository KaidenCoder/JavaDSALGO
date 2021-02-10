package Dp2.Assignments;

public class SubsetSum {

    static boolean isSubsetPresent(int[] arr, int n, int sum) {

        if(n == 0){
           return false;
        }

        boolean[][] m = new boolean[n+1][sum+1];

        for(int s = 0; s <= sum; s++){
            m[0][s] = false;
        }

        for(int i = 1; i <= n; i++){
            for(int j = 0; j <= sum; j++){
                if(j - arr[i-1] >= 0){
                    m[i][j] = (m[i-1][j] || arr[i-1] == j || m[i-1][j - arr[i-1]]);
                } else{
                    m[i][j] = (m[i-1][j] || arr[i-1] == j);
                }
            }
        }

        return m[n][sum];

//        int len = n - 1;
//
//        if(sum == 0){
//            return true;
//        }
//
//        if(n < 0 || sum < 0){
//            return false;
//        }
//
//        boolean include = isSubsetPresent(arr, len-1, sum - arr[len]);
//
//        boolean exclude = isSubsetPresent(arr, len-1, sum);
//
//
//        return include || exclude;

    }

    public static void main(String[] args) {
        int[] arr = {4,2,5,6,7};
        int n = arr.length;
        int sum = 14;
        if(isSubsetPresent(arr, n, sum) == true){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }

}
