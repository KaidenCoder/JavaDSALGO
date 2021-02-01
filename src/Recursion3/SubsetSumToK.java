package Recursion3;

import java.util.Scanner;

public class SubsetSumToK {

    public static int[][] subsetsSumK(int input[], int k) {
        // Write your code here
        return subsetsSumKHelper(input, 0, k);
    }

    public static void printSubsetsSumTok(int input[], int k) {
        // Write your code here
        int output[][] = subsetsSumK(input, k);
        for(int i = 0; i < output.length; i++) {
            for(int j = 0; j < output[i].length; j++) {
                System.out.print(output[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static int[][] subsetsSumKHelper(int[] input, int beginIndex, int k) {
        if(beginIndex == input.length){
            if(k == 0){
                return new int[1][0];
            }else{
                return new int[0][0];
            }
        }

        int[][] smallOutput1 = subsetsSumKHelper(input, beginIndex + 1, k);
        int[][] smallOutput2 = subsetsSumKHelper(input, beginIndex + 1, k - input[beginIndex]);
        int[][] output = new int[smallOutput1.length + smallOutput2.length][];
        int index = 0;

        for(int i = 0; i < smallOutput1.length; i++){
            output[index++] = smallOutput1[i];
        }

        for(int i = 0; i < smallOutput2.length; i++){
            output[index] = new int[smallOutput2[i].length + 1];
            output[index][0] = input[beginIndex];
            for(int j = 0; j< smallOutput2[i].length; j++){
                output[index][j+1] = smallOutput2[i][j];
            }
            index++;
        }
        return output;
    }

    static Scanner s = new Scanner(System.in);
    public static int[] takeInput() {
        int size = s.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] input = takeInput();
        int k = s.nextInt();
        int output[][] = subsetsSumK(input, k);
        for(int i = 0; i < output.length; i++) {
            for(int j = 0; j < output[i].length; j++) {
                System.out.print(output[i][j] + " ");
            }
            System.out.println();
        }
    }

}
