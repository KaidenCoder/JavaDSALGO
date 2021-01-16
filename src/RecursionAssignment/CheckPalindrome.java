package RecursionAssignment;

import java.util.Scanner;

public class CheckPalindrome {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        System.out.println(isStringPalindrome(str));
    }

    public static boolean isStringPalindrome(String s) {
        // Write your code here
       if(s.length() == 0 || s.length() == 1){
           return true;
       }
       if(s.charAt(0) == s.charAt(s.length()-1)){
           return isStringPalindrome(s.substring(1,s.length()-1));
       }

       return false;
    }


}
