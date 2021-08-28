package demo;

import java.util.ArrayList;
import java.util.Scanner;

public class FactorsFinding {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();

        ArrayList<Integer> arr = new ArrayList<>();

        for(int i = 1; i <= num; i++){
            if(num%i == 0){
                arr.add(i);
            }
        }
        System.out.println(arr.size());
        for(int i = 0; i < arr.size(); i++){
            System.out.print(arr.get(i) + " ");
        }

    }
}
