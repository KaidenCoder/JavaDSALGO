package Strings;

import java.util.Scanner;

public class ReverseStringWordwise {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        String res = str.substring(5,str.length());
        System.out.println(res);
        System.out.println(reverseWordWise(str));

    }


    public static String reverseWordWise(String str) {
        // Write your code here
        String ans = "";
        int currentWordStart = str.length()-1;
        int i;
        for(i = currentWordStart; i >=0; i--){
            if(str.charAt(i) == ' '){
                int currentWordEnd = i + 1;
                String reversedWord = "";
                reversedWord = reversedWord + str.substring(currentWordEnd, currentWordStart +1);

                ans += reversedWord + " ";
                currentWordStart = i - 1;
            }
        }

        int currentWordEnd = i + 1;
        String reversedWord = "";
        reversedWord = reversedWord + str.substring(currentWordEnd, currentWordStart +1);

        ans += reversedWord + " ";

        return ans;

    }
}
