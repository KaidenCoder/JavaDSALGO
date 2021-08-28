package demo;

import java.util.Scanner;

public class RajuAndHisTrip {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int tip = s.nextInt();
        if(tip%5 == 0 || tip%6 == 0){
            System.out.print("YES");
        }else {
            System.out.print("NO");
        }
    }
}
