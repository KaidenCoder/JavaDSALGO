package TimeComplexity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayIntersection {
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

    public static void intersection(int[] arr1, int[] arr2) {
        //Your code goes here
        ArrayList<Integer> res = new ArrayList<Integer>();
        for(int i=0;i<arr1.length;i++) {

            for(int j=0;j<arr2.length;j++) {

                if(arr1[i]==arr2[j]) {
                    res.add(arr1[i]);

                    arr2[j]=Integer.MAX_VALUE;
                    break;
                }

            }
        }
        Collections.sort(res);
        for(int i = 0; i < res.size(); i++){
            System.out.print(res.get(i) + " ");
        }
    }


}
