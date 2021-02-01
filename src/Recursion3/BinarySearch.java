package Recursion3;

public class BinarySearch {

    public static int binarySearch(int arr[], int x) {
        // Write your code here
        int l = 0;
        int r = arr.length - 1;

        return binarySearchHelper(arr, l , r, x);
    }

    private static int binarySearchHelper(int[] arr, int l, int r, int x) {
        if(r >= l){
            int mid = l + (r - l)/2;
            if(arr[mid] == x){
                return mid;
            }

            if(arr[mid] > x){
                return binarySearchHelper(arr, l , mid - 1, x);
            }else{
                return binarySearchHelper(arr, mid + 1, r, x);
            }

        }
        return -1;
    }


}
