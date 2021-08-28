package Test1;

import java.util.Scanner;

public class Flags {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        System.out.println(find_Ways(a));
    }

    public static long find_Ways(int N)
    {
        if(N == 2 || N == 1) return 2;
        Long ans = find_Ways(N-2) + find_Ways(N-1);
        return ans;
    }
}
