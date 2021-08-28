package Cognizant;

import java.util.ArrayList;
import java.util.Scanner;

public class PrimeGame {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        if(a == 0){
            System.out.println(-1);
        }else{
            int arr[][] = new int[a][2];

            for(int i = 0; i < a; i++){
                for(int j = 0; j < 2; j++){
                    arr[i][j] = s.nextInt();
                }
            }

            for(int i = 0; i < a; i++){
                System.out.println(helper(arr[i]));
            }
        }

    }

    public static int helper(int arr[]){
        int small = arr[0];
        int big = arr[1];
        ArrayList<Integer> arr1 = new ArrayList<>();
        for(int i = small; i <= big; i++){
            int counter = 0;
            for(int j = 1; j <= i; j++){
                if(i%j == 0){
                    counter++;
                }
                if(counter > 2){
                    break;
                }
            }

            if(counter == 2) {
                arr1.add(i);
            }
        }

        if(arr1.size() == 0){
            return -1;
        }

        if(arr1.size() == 1){
            return 0;
        }

        return arr1.get(arr1.size()-1) - arr1.get(0);
    }
}
