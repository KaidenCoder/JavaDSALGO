package FullTestNew1;

import java.util.ArrayList;
import java.util.Scanner;

public class JumpingNumbers {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();

        showJumpingNos(a);

    }

    public static void showJumpingNos(int x) {
        if(x <= 10){
            for(int i = 0; i <= x; i++){
                System.out.print(i + " ");
            }
        }
        ArrayList<Integer> arr = new ArrayList<>();
        if(x > 10){
            for(int i = 0; i < 11; i++){
                System.out.print(i + " ");
            }

            for(int i = 11; i <= x; i++){
                int temp = i;
                while(temp > 0){
                    arr.add(0, temp%10);
                    temp /= 10;
                }
                Boolean valueOne = diffOne(arr);
                if(valueOne == true){
                    System.out.print(i + " ");
                }
                arr.clear();
            }

        }

    }

    public static boolean diffOne(ArrayList<Integer> arr){
        Boolean diffbool = true;
        for(int j = 0; j < arr.size()-1; j++){
            int diff = Math.abs(arr.get(j) - arr.get(j+1));
            if(diff != 1){
                diffbool = false;
            }
        }
        return diffbool;
    }

    static long jumpingNums(long x) {
        // code here
        ArrayList<Integer> arr = new ArrayList<>();
        if(x <= 10){
            for(int i = 0; i <= x; i++){
                arr.add(i);
            }
        }
        if(x > 10){
            for(int i = 0; i < 11; i++){
                arr.add(i);
            }
            ArrayList<Integer> arr1 = new ArrayList<>();
            for(int i = 11; i <= x; i++){
                int temp = i;
                while(temp > 0){
                    arr1.add(0, temp%10);
                    temp /= 10;
                }
                Boolean valueOne = diffOne(arr1);
                if(valueOne == true){
                    arr.add(i);
                }
                arr1.clear();
            }
        }
        return arr.get(arr.size()-1);
    }


}
