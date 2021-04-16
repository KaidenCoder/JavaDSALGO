package demo;

import java.util.ArrayList;
import java.util.Scanner;

public class rotateArray {
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t > 0){
            int a = s.nextInt();
            int b = s.nextInt();
            ArrayList<Integer> arr = new ArrayList<>(a);
            for(int i = 0; i < a; i++){
                arr.add(s.nextInt());
            }
            ArrayList<Integer> res = helper(arr, b);
            for(int i = 0; i < res.size(); i++){
                System.out.print(res.get(i) + " ");
            }
            System.out.println();
            t--;
        }

    }

    public static ArrayList<Integer> helper(ArrayList<Integer> arr, int n){
        ArrayList<Integer> res = new ArrayList<>(arr.size());
        int a = n;

        while(a < arr.size()){
            res.add(arr.get(a));
            a++;
        }

        int b = 0;

        while(b < n){
            res.add(arr.get(b));
            b++;
        }

        return res;

    }
}
