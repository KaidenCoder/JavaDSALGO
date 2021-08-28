package BinarySearch.IO;

import java.util.Arrays;

public class MakingChangeSequel {

    public static void main(String[] args) {
//        int arr[] = {1, 5, 10, 25};
//        int amount = 60;
//        int arr[] = {3, 7, 10};
//        int amount = 8;
        int arr[] = {0};
        int amount = 8;
        System.out.print(solve(arr, amount));
    }

    public static int solve(int[] denominations, int amount) {
        Arrays.sort(denominations);

        int i = denominations.length - 1;
        int count = 0;
        if(denominations[0] == 0 && denominations.length == 1 && amount > 0){
            return -1;
        }
        while(i >= 0){
            System.out.println(amount + " " + count);

            if(amount == 0){
                return count;
            }
            if(amount >= denominations[i]){
                amount = amount - denominations[i];

                count++;
            } else{
                i--;
            }

        }

        return -1;
    }

}
