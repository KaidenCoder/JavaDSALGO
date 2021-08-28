package demo;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        String str[] = new String[a];
       for(int i = 0; i < a; i++){
           str[i] = s.nextLine();
       }
        for(int i = 0; i < a; i++){
            System.out.println(reverseVowels(str[i]));
        }




    }

    public static String reverseVowels(String s){
        // Write your code here
        HashMap<Character, Boolean> map = new HashMap<>();
        char[] ch = new char[s.length()];

        for(int i =0; i < s.length(); i++){
            ch[i] = s.charAt(i);
        }

        map.put('a', true);
        map.put('e', true);
        map.put('i', true);
        map.put('o', true);
        map.put('u', true);

        String strVowel = "";
        for(int i = 0; i < s.length(); i++){
            if(map.containsKey(s.charAt(i))){
                strVowel += s.charAt(i);
                ch[i] = '1';
            }
        }

        int k = strVowel.length() - 1;

        for(int i = 0; i < s.length(); i++){
            if(ch[i] == '1'){
                ch[i] = strVowel.charAt(k);
                k--;
            }
        }

        String result = "";

        for(int i = 0; i < s.length(); i++){
            result += ch[i];
        }

        return result;


    }

}
