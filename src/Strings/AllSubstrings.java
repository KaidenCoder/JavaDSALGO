package Strings;

import java.util.Scanner;

public class AllSubstrings {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String str = s.nextLine();

        printSubstrings(str);

        // pqrs
        // p, pq, pqr, pqrs
        // q, qr, qrs
        // r, rs
        // s
    }

    public static void printSubstrings(String str) {

        int len = str.length();

        int a = 0;
        while( a < len){
            for(int i = a +1; i <= len; i++){
                System.out.println(str.substring(a,i));
            }
            a = a + 1;
        }
    }
}
