package BonusProblemArrays;

import java.util.Scanner;

public class PairWithGivenSum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int arr[] = new int[a];
        int target = s.nextInt();
        Boolean found = false;

        for(int i = 0; i < a; i++){
            arr[i] = s.nextInt();
        }

        for(int i = 0;  i < a - 1; i++){
            for(int j = i + 1; j < a; j++){
                if((arr[i] + arr[j]) == target){
                    found = true;
                    break;
                }
            }
        }

        if(found == true){
            System.out.print("true");
        }else{
            System.out.print("false");
        }

    }
}
