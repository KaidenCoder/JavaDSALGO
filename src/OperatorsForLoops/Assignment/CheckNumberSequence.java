package OperatorsForLoops.Assignment;

import java.util.Scanner;

public class CheckNumberSequence {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] array = new int[s.nextInt()];
        for(int i = 0;  i < array.length; i++){
            array[i] = s.nextInt();

        }
        int n = array.length;
        if(n == 1){
            System.out.print("true");
        } else {
            if(array[0] < array[1]){
                int i = 1;
                while(i < n && array[i-1] < array[i]){
                    i++;
                }

                while(i+1 < n && array[i] > array[i+1]){
                    i++;
                }
                if(i >= n - 1){
                    System.out.print("true");
                } else{
                    System.out.print("false");
                }
            } else if(array[0] > array[1]){
                int i = 1;
                while(i < n && array[i-1] > array[i]){
                    i++;
                }
                while(i+1 < n && array[i] < array[i+1]){
                    i++;
                }
                if(i >= n - 1){
                    System.out.print("true");
                } else{
                    System.out.print("false");
                }
            } else {
                for(int i = 2; i < n; i++){
                    if(array[i-1] <= array[i]){
                        System.out.print("true");
                    }
                    System.out.print("false");
                }
            }
        }
    }
}
