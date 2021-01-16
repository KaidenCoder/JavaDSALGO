package Strings;

import java.util.Scanner;

public class CheckPermutation {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String str1 = s.nextLine();
        String str2 = s.nextLine();

        System.out.println(isPermutation(str1, str2));

    }

    public static boolean isPermutation(String str1, String str2) {
        //Your code goes here
        int count  = 0;
        for(int i =0; i < str1.length(); i++){
            for( int  j =0; j < str2.length(); j++){
                if(str1.charAt(i) == str2.charAt(j)){
                    count++;
                }
            }

        }

        if(count == str1.length()){
            return true;
        }else{
            return false;
        }


    }

}
