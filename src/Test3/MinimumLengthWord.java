package Test3;

import java.util.Scanner;

public class MinimumLengthWord {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        System.out.println(minLengthWord(a));
    }


    public static String minLengthWord(String str){

        String arr [] = str.split(" ");
        int [] arr2 = new int[arr.length];
        int min = 1000000;
        for(int i =0; i < arr.length; i++){
            min = Math.min(min, arr[i].length());
            // System.out.println(arr[i].length());
            arr2[i] = arr[i].length();
        }
//        for(int i =0; i < arr.length; i++){
//            System.out.println(arr2[i]);
//        }
//        System.out.println(min);
        int index =0;
        for(int i =0; i < arr.length; i++){
            if(min == arr2[i]){
                index  = i;
                break;
            }
        }
//        System.out.println(index);
//        System.out.println(arr[index]);
        return arr[index];

    }

}
