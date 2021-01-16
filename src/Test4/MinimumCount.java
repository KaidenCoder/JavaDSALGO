package Test4;

import java.util.Scanner;

public class MinimumCount {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        System.out.print(minCount(a));
    }

    public static int minCount(int n){
        if (n <= 3)
            return n;

        // getMinSquares rest of the
        // table using recursive
        // formula
        // Maximum squares required is
        int res = n;
        // n (1*1 + 1*1 + ..)

        // Go through all smaller numbers
        // to recursively find minimum
        for (int x = 1; x <= n; x++)
        {
            int temp = x * x;
            if (temp > n)
                break;
            else
                res = Math.min(res, 1 +
                        minCount(n - temp));
        }
        return res;
    }
}
