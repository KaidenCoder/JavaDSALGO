package Test4;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumProfit {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int arr [] = new int[a];
        for(int i = 0; i < a; i++){
            arr[i] = s.nextInt();
        }
        System.out.print(maximumProfit(arr));

    }

    public static int maximumProfit(int budget[]) {
        // Write your code here
        Arrays.sort(budget);
        int num = budget.length;
        int res =  Integer.MIN_VALUE;

        for(int i = 0; i < num; i++){
            res = Math.max(res, budget[i] * (num - i));
        }
        return res;
    }
}
