package demo;

import java.util.Scanner;

public class TriangleEverywhere {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();

        if(a + b <= c || a + c <= b || b + c <= a) {
            System.out.print(-1);
        }else if(a == b && b == c) {
            System.out.print(1);
        }else if(a == b && b != c) {
            System.out.print(2);
        } else if(a != b && a != c){
            System.out.print(3);
        }
    }
}
