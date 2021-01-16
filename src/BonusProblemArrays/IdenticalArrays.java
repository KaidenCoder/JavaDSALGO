package BonusProblemArrays;

import java.util.Scanner;

public class IdenticalArrays {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int a = s.nextInt();

        int arr1[] = new int[a];
        int arr2[] = new int[a];

        for(int i = 0;  i < a; i++){
            arr1[i] = s.nextInt();
        }

        for(int i = 0;  i < a; i++){
            arr2[i] = s.nextInt();
        }

        int count = 0;

        for(int i = 0;  i < a; i++){
            if(arr1[i] != arr2[i]){
                count = count + 1;
            }
        }

        System.out.print(count - 1);

    }
}
