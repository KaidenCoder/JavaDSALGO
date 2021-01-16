package TimeComplexity;

import java.util.Scanner;

public class ArrayIntersectionNinjas {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int arr1[] = new int[a];
        for(int i = 0;  i < a; i++){
            arr1[i] = s.nextInt();
        }
        int arr2[] = new int[b];
        for(int i = 0;  i < b; i++){
            arr2[i] = s.nextInt();
        }

        intersection(arr1, arr2);

    }

    private static void intersection(int[] arr1, int[] arr2) {

    }
}
