package BonusStacksQueues;

import java.util.Scanner;
import java.util.Stack;

public class Countthenumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.print(permutations(n));
    }

    public static int permutations(int n) {
        //Write your code here
        int result = 0;
        for(int i = 1; i <=9; i++ ){
            Stack<Integer> s = new Stack<>();
            if(i <= n){
                s.push(i);
                result++;
            }

            while (!s.empty()) {
                int tp = s.peek();
                s.pop();
                for (int j = tp % 10; j <= 9; j++) {
                    int x = tp * 10 + j;
                    if (x <= n) {
                        s.push(x);
                        result++;
                    }
                }
            }

        }

        return result;
    }
}
