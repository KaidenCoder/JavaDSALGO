package BonusProblemArrays;

import java.util.Arrays;
import java.util.Scanner;

public class DistributionProblem {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int b = s.nextInt();
        int[] arr = new int[b];
        for(int i = 0;  i < b; i++){
            arr[i] = s.nextInt();
        }
        int c = s.nextInt()- 1;
        Arrays.sort(arr);

        int min = Integer.MAX_VALUE;


        for(int i = 0; i < b - c; i++){
            int diff = arr[c+i] - arr[i];

            min = Math.min(min, diff);
        }

        System.out.println(min);

    }
}
