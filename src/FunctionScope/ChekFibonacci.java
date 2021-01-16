package FunctionScope;

import java.util.Scanner;

public class ChekFibonacci {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        System.out.print(isFibonacci(a));
    }

    public static boolean isFibonacci(int n){
        return isPerfectSquare(5*n*n + 4) || isPerfectSquare(5*n*n -4);
    }

    public  static  boolean isPerfectSquare(int x){
        int s = (int) Math.sqrt(x);
        if(s*s == x){
            return true;
        }else{
            return false;
        }
    }

}
