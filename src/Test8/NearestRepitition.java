package Test8;

import java.util.ArrayList;
import java.util.Scanner;

public class NearestRepitition {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = s.nextInt();
        }

       // minDistance(arr);
       System.out.println(minDistance(arr));
    }

    public static int minDistance(int[] arr){
        /* Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
         */
        int len = arr.length;
        int min = Integer.MAX_VALUE;
        ArrayList<Integer> res = new ArrayList<Integer>();
        for(int i = 0; i < len - 1; i++){
            for(int j = i + 1; j < len; j++){
                if(arr[i] == arr[j]){
                    int diff = Math.abs(i - j);
                    min = Math.min(diff, min);
                }
            }
        }

        return min;

    }


}
