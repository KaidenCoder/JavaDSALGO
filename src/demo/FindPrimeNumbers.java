package demo;

import java.util.ArrayList;
import java.util.Scanner;

public class FindPrimeNumbers {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        System.out.print(primeNumbersTillN(a));
    }


    public static ArrayList<Integer> primeNumbersTillN(int N)
    {
        // Write your code here
        ArrayList<Integer> res = new ArrayList<>();
        for(int i = 2; i <= N; i++){
            if(isPrime(i)){
                res.add(i);
            }
        }
        return res;
    }

    public static boolean isPrime(int n){
        if(n <= 1){
            return false;
        }

        for(int i = 2; i< n; i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
}


