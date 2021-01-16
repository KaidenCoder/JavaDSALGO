package BonusStringProblems;

import java.util.ArrayList;
import java.util.Scanner;

public class LongestPlaindromeString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String aa = s.nextLine();
        int b = s.nextInt();
        int count = 0;

        int a = Integer.parseInt(aa);

        String strlen = String.valueOf(a);
        int len = strlen.length();

        int arr [] = new int[len];
        int i = 0;
        while(a > 0){
            arr[len-i-1] = a%10;
            a = a/10;
            i++;
        }
        ArrayList<Integer> diff = new ArrayList<Integer>();
        for(int j = 0; j < len/2; j++){
            if(arr[j] != arr[len-j-1]){
                diff.add(j);
                count++;
            }
        }
        System.out.println(diff);
        System.out.println(count);

        if(b >= count){
            int n,c;
            for(n = 0, c= 0; n < b && n < count && c < b && c < count; n++){

                arr[diff.get(n)] =  arr[len-diff.get(n)-1] = 9;
                c = c + 2;
            }

            if( c < b){
                arr[len/2] = 9;
            }


//        for(int p =0; p < len; p++){
//            System.out.print(arr[p]);
//        }
            int res = arrayToInt(arr);

            System.out.println(res);
        }
    else{
            System.out.println("NOT POSSIBLE");
        }

//
//
//        if(b >= count){
//
//        }


//        if(a%2 != 0){
//
//        }

    }

    public static int arrayToInt(int[] arr)
    {
        StringBuilder s = new StringBuilder();

        for(int i : arr){
            s.append(i);
        }
        return Integer.parseInt(s.toString());
    }

}


//        ArrayList<Integer> arr = new ArrayList<Integer>();
//        do{
//            arr.add(0,a % 10);
//            a /= 10;
//        } while  (a > 0);
//        int arr [] = new int[a];
//        for(int i =0; i < a; i++){
//            arr[i] = s.nextInt();
//        }
//        int count = 0;
//        for(int i = 0; i <a/2; i++){
//            if(arr[i] != arr[a - i -1]){
//                count++;
//            }
//        }
