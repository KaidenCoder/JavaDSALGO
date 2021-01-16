package BonusProblemArrays;

import java.util.Scanner;

public class TransitionPoint {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int arr[] = new int[a];
        Boolean index = false;

        for(int  i = 0; i < a; i++){
            arr[i] = s.nextInt();
        }

        for(int i =0; i < a; i++){
            if(arr[i] == 1){
                System.out.print(i);
                index = true;
                break;
            }
        }

        if(index == false){
            System.out.print(-1);
        }
    }
}
