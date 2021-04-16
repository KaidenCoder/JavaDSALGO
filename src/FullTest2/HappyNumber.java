package FullTest2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HappyNumber {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        System.out.println(findHappyNumber(x));

    }

    public static boolean findHappyNumber(int n) {

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 0);
        map.put(1, 1);
        map.put(2, 4);
        map.put(3, 9);
        map.put(4, 16);
        map.put(5, 25);
        map.put(6, 36);
        map.put(7, 49);
        map.put(8, 64);
        map.put(9, 81);

        if(n < 1){
            return false;
        }
        int sum = 0;
        Set<Integer> set = new HashSet<>();
        while(!set.contains(n)){
            set.add(n);
            while(n > 0){
                int d = n % 10;
                n /= 10;
                sum += map.get(d);

            }
            System.out.print(sum + " ");
            if(sum == 1){
                return true;
            }
            n = sum;
            sum = 0;
        }

        return false;

    }

}
