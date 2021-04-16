package FullTest3;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ArrayCost {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int arr1[] = new int[a];
        for(int i = 0;  i < a; i++){
            arr1[i] = s.nextInt();
        }
        int[] arr = Arrays.stream(arr1).boxed()
                .sorted(Collections.reverseOrder())
                .mapToInt(Integer::intValue)
                .toArray();
        for(int i = 0;  i < a; i++){
            System.out.print(arr[i] + " ");
        }
        int sum = 0;
        int len = a/3;
        int rlen = len * 3;
        int i = 0;
        for(i = 0; i < rlen; i++){
            if((i+1)%3 == 0){
                continue;
            }
            else{
                System.out.println(arr[i]);
                sum += arr[i];
            }
        }

        if(i < a && i != a - 1){
            while(i < a){
                sum+= arr[i];
                i++;
            }
        }

        System.out.print(sum);
    }


}
