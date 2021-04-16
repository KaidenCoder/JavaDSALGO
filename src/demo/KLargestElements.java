package demo;

import java.util.Arrays;

public class KLargestElements {

    public static void main(String[] args) {
        int arr[] = {3,4,2,1};
        int res[] = Klargest(arr, 2, arr.length);
        for(int i = 0; i < res.length; i++){
            System.out.print(res[i] + " ");
        }
    }

    public static int[] Klargest(int[] a, int k, int n) {
        // Write your code here
        Arrays.sort(a);
        int res [] = new int[k];
        int j = k-1;
        for(int i = n-1; i > n-1-k; i--){
            res[j]= a[i];
            j--;
        }
        return res;
    }

}
