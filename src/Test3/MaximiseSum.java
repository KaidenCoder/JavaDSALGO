package Test3;

import java.util.Scanner;

public class MaximiseSum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int arr1[] = new int[a];
        int arr2[] = new int [b];

        for(int i =0; i <a; i++){
            arr1[i] = s.nextInt();
        }
        for(int i =0; i <b; i++){
            arr2[i] = s.nextInt();
        }


    }

//    public static long maximumSumPath(int[] arr1, int[] arr2) {
//        long sum = 0;
//        int a = arr1.length;
//        int b = arr2.length;
//
//
//        ArrayList<Integer> i1 = new ArrayList<Integer>();
//        ArrayList<Integer> i2 = new ArrayList<Integer>();
//        return sum;
//    }

    public static  int max(long x, long y) { return (int) ((x > y) ? x : y); }

    public static long  maximumSumPath(int ar1[], int ar2[])
    {
        // initialize indexes for ar1[] and ar2[]
        int i = 0, j = 0;
        int m= ar1.length;
        int n= ar2.length;

        // Initialize result and current sum through ar1[]
        // and ar2[].
       long result = 0, sum1 = 0, sum2 = 0;

        // Below 3 loops are similar to merge in merge sort
        while (i < m && j < n)
        {
            // Add elements of ar1[] to sum1
            if (ar1[i] < ar2[j])
                sum1 += ar1[i++];

                // Add elements of ar2[] to sum2
            else if (ar1[i] > ar2[j])
                sum2 += ar2[j++];

                // we reached a common point
            else
            {
                // Take the maximum of two sums and add to
                // result
                result += max(sum1, sum2);

                // Update sum1 and sum2 for elements after
                // this intersection point
                sum1 = 0;
                sum2 = 0;

                // Keep updating result while there are more
                // common elements
                int temp = i;
                while (i < m && ar1[i] == ar2[j])
                    sum1 += ar1[i++];

                while (j < n && ar1[temp] == ar2[j])
                    sum2 += ar2[j++];

                result += max(sum1, sum2);

                sum1 = 0;
                sum2 = 0;
            }
        }

        // Add remaining elements of ar1[]
        while (i < m)
            sum1 += ar1[i++];

        // Add remaining elements of ar2[]
        while (j < n)
            sum2 += ar2[j++];

        // Add maximum of two sums of remaining elements
        result += max(sum1, sum2);

        return result;
    }
}
