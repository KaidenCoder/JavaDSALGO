package Recursion3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SubsetArray {

    public static int[][] subsets(int input[]) {
        // Write your code here
        List<List<Integer>> list = new ArrayList<>();
        subsets(input, list, new ArrayList<>(), 0);

       int[][] intArray = list.stream().map(  u  ->  u.stream().mapToInt(i->i).toArray()  ).toArray(int[][]::new);
       return intArray;
    }

    private static void subsets(int[] nums, List<List<Integer>> list, List<Integer> newList, int start) {
        list.add(new ArrayList<>(newList));
        for(int i = start; i < nums.length; i++){
            newList.add(nums[i]);
            subsets(nums, list, newList, i+1);
            newList.remove(newList.size() - 1);
        }

    }



    public static void printSubsets(int input[]) {
        // Write your code here
        int output[][] = subsets(input);
        for(int i = 0; i < output.length; i++) {
            for(int j = 0; j < output[i].length; j++) {
                System.out.print(output[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static int[] takeInput() {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }
        return arr;
    }

    public static void main(String[] args) {

        int[] input = takeInput();
        printSubsets(input);
//        int[] input = takeInput();
//        int output[][] = subsets(input);
//        for(int i = 0; i < output.length; i++) {
//            for(int j = 0; j < output[i].length; j++) {
//                System.out.print(output[i][j] + " ");
//            }
//            System.out.println();
//        }
    }

}
