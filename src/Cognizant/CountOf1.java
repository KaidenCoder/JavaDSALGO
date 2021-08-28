package Cognizant;

import java.util.Scanner;

public class CountOf1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int arr[] = new int[a];
        for(int i = 0; i < arr.length; i++){
            arr[i] = s.nextInt();
        }

        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 1){
                count++;
            }
        }

        System.out.print(count);

    }
}
