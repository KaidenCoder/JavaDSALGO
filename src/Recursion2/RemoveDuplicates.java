package Recursion2;

import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        System.out.print(removeConsecutiveDuplicates(str));
    }
    public static String removeConsecutiveDuplicates(String s){
        // Write your code here
        if(s.length() <= 1){
            return s;
        }

        String smallOutput = removeConsecutiveDuplicates(s.substring(1));

        if(s.charAt(0) == s.charAt(1)){
            return "" + smallOutput;
        }else{
            return s.charAt(0) + smallOutput;
        }

//        if ( s.length() <= 1 ) return s;
//        if( s.substring(1,2).equals(s.substring(0,1)) ) return removeConsecutiveDuplicates(s.substring(1));
//        else return s.substring(0,1) + removeConsecutiveDuplicates(s.substring(1));

    }

}
