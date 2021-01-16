package BonusStringProblems;

import java.util.Scanner;

public class LongestNonPalindrome {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String str = s.nextLine();
        String [] arr = str.split("");



        int length = str.length();

        int b = length - 1;
        int i =  0;

        while(i < length){
            if(arr[i].equals(arr[b])){
                i = i+1;
            }
         else{
                break;
            }
        }
        int res= length-i;
        System.out.println(res);
        System.out.println(i);
//        System.out.println(arr[0].equals(arr[4]));
        System.out.println(arr[i]);

    }

}
