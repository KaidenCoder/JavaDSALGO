package demo;

import java.util.Scanner;

public class ValidTriangle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();

        System.out.print(helper(a,b,c));
    }

    public static String helper(int a, int b, int c){
        if(a == b || a == c || b == c){
            return "NO";
        }

        if(a + b < c || a + c < b || b + c < a){
            return "NO";
        }

        return "YES";
    }
}
