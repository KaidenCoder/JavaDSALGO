package Hashmaps.Assignments;

public class PairsDiffK {

    public static int getPairsWithDifferenceK(int arr[], int k) {
        if(arr.length <= 1){
            return 0;
        }

        int count = 0;

        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                int diff = Math.abs(arr[i] - arr[j]);
                if(diff == k){
                    count = count + 1;
                }
            }
        }

        return count;

    }

    public static void main(String[] args) {
        int arr[] = {2,6,4,8};
        int k = 2;
        int res = getPairsWithDifferenceK(arr, k);
        System.out.print(res);

    }

}
