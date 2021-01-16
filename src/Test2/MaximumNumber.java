package Test2;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.Collections;

public class MaximumNumber {
    public static void main(String[] args) {
        int num = 5438;
        ArrayList<Integer> array = new ArrayList<Integer>();
        do{
            array.add(num%10);
            num /= 10;
        } while(num > 0);

        Collections.reverse(array);
        int[] arr2 = array.stream().mapToInt(Integer::valueOf).toArray() ;
        System.out.print(arr2);

        System.out.print(array);
        System.out.print(array.get(2));

        if(array.get(1) > array.get(0)) {
            array.remove(0);

            System.out.print(convertIntegers(array));
        } else if(array.get(1) < array.get(2)){
            array.remove(1);
            System.out.print(convertIntegers(array));
        } else if(array.get(2) > array.get(3)){
            array.remove(3);
            int[] arr = array.stream().mapToInt(i -> i).toArray();
            System.out.print(arr);
        } else {
            array.remove(2);
            System.out.print(array);
            int[] arr = array.stream().mapToInt(i -> i).toArray();
            System.out.print(arr);

        }

    }

    public static int[] convertIntegers(ArrayList<Integer> integers){
        int[] ints = new int[integers.size()];
        int i = 0;
        for (Integer n : integers) {
            ints[i++] = n;
        }
        return ints;
    }

}
