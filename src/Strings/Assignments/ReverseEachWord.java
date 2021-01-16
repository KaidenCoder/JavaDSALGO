package Strings.Assignments;

import java.util.Scanner;

public class ReverseEachWord {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        System.out.println(reverseEachWord(str));
    }
    public static String reverseEachWord(String str) {
        //Your code goes here
        String ans = "";
        int currentWordStart = 0;
        int i;
        for(i = 0; i < str.length();i++ ){
            if(str.charAt(i) == ' '){
                int currentWordEnd = i - 1;
                String reversedWord = "";
                for(int j = currentWordStart; j <= currentWordEnd; j++){
                    reversedWord = str.charAt(j) + reversedWord;
                }

                ans += reversedWord + " ";
                currentWordStart = i + 1;
            }
        }

        int currentWordEnd = i - 1;
        String reversedWord = "";
        for(int j = currentWordStart; j <= currentWordEnd; j++){
            reversedWord = str.charAt(j) + reversedWord;
        }

        ans += reversedWord;

        return ans;
    }

}
