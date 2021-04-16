package FullTest1;

import java.util.Scanner;

public class GameOfDeath {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int k = s.nextInt();
        System.out.print(helper(n, k));
    }

    private static int helper(int n, int k) {
        if(n == 1) return 1;
        else{
            return (helper(n-1, k) + k - 1) %n + 1;
            // ((3, 2) + 1) % 4 + 1
            // ((2, 2) + 0) % 4 + 1
            // ((1, 2) - 1) % 4 + 1
            // (0)% 4 + 1 = 1

            // ((49, 10) + 9) % 50 + 1
            // ((48, 10) + 8) % 50 + 1
            // ((47, 10) + 7) % 50 + 1
            // ((46, 10) + 6) % 50 + 1
            // ((45, 10) + 5) % 50 + 1
            // ((44, 10) + 4) % 50 + 1
            // ((41, 10) + 1) % 50 + 1
            // ((40, 10) + 0) % 50 + 1
            // ((39, 10) - 1) % 50 + 1
            // ((38, 10) - 2) % 50 + 1
            // ((36, 10) - 4) % 50 + 1
            // ((31, 10) - 9) % 50 + 1
            // ((21, 10) - 19) % 50 + 1
            // ((11, 10) - 29) % 50 + 1
            // ((1, 10) - 29) % 50 + 1 = -28%50 + 1 = -27
        }
    }

}
