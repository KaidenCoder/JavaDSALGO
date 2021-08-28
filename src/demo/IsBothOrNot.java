package demo;

import java.util.Scanner;

public class IsBothOrNot {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        if(n%5 == 0 && n%11 == 0){
            System.out.print("BOTH");
        } else if(n%5 == 0 || n%11 == 0){
            System.out.print("ONE");
        } else{
            System.out.print("NONE");
        }
    }

}
