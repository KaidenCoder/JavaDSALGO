package BonusStringProblems;

import java.util.Scanner;

public class FirstPalindrome {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        System.out.println(nextPalindrome(str));

    }

    public static String nextPalindrome(String str) {
        int[] freq = new int[26];
        int len = str.length();

        for(int i = 0; i < len; i++){
            freq[str.charAt(i) - 'a']++;
        }

        int count_odd = 0;
        for(int i = 0; i < 26; i++){
            if(freq[i]% 2!= 0){
                count_odd++;
            }
        }

        if(len%2 == 0){
            if(count_odd > 0){
                return "";
            }
        }else{
            if(count_odd != 1){
                return "";
            }
        }

        String odd_str =  findOddAndRemoveItsFreq(freq);
        String front_str = "", rear_str = "";

        for(int i = 0; i < 26; i++){
            String temp = "";
            if(freq[i] != 0){
                char ch = (char)(i + 'a');
                for(int j = 1; j <= freq[i]/2; j++){
                    temp = temp + ch;
                }

                front_str = front_str + temp;
                rear_str = temp + rear_str;
            }
        }

        return (front_str + odd_str+ rear_str);
    }

    public static String findOddAndRemoveItsFreq(int freq[]){
        String odd_str = "";
        for(int i =0; i< 26; i++){
            if(freq[i]%2 != 0){
                freq[i]--;
                odd_str = odd_str + (char) (i + 'a');
                return odd_str;
            }
        }
        return odd_str;
    }
}
