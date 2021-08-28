package Leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindAndReplacePatterns {

    public static void main(String[] args) {
        String []words = {"abc", "deq", "mee", "aqq", "dkd", "ccc"};
        String pattern = "abb";
        System.out.print(findAndReplacePattern(words, pattern));
    }

    public static List<String> findAndReplacePattern(String[] words, String pattern) {
        Map<Character, Integer> map = new HashMap<>();

        List<String> str = new ArrayList<String>();

        int c = 0;
        String s = "";
        for(int i = 0; i < pattern.length(); i++){
            if(!map.containsKey(pattern.charAt(i))){
                map.put(pattern.charAt(i), c);
                c++;
            }
            if(map.containsKey(pattern.charAt(i))){
                s += String.valueOf(map.get(pattern.charAt(i)));
            }
        }

        System.out.println("map " +  map);
        System.out.println("s " +  s);

        for(int i = 0; i < words.length; i++){
            String res = helper(words[i]);
            System.out.println("res " + res);
            if(res.equals(s)){
                str.add(words[i]);
            }
        }

        return str;
    }

    public static String helper(String str){
        Map<Character, Integer> map = new HashMap<>();


        int c = 0;
        String s = "";
        for(int i = 0; i < str.length(); i++){
            if(!map.containsKey(str.charAt(i))){
                map.put(str.charAt(i), c);
                c++;
            }
            if(map.containsKey(str.charAt(i))){
                s += String.valueOf(map.get(str.charAt(i)));
            }
        }

        return s;
    }


//    public static List<String> findAndReplacePattern(String[] words, String pattern) {
//
//        List<String> str = new ArrayList<String>();
//
//        int c = 1;
//        String s = "";
//        for(int i = 0; i < pattern.length()-1; i++){
//            if(pattern.charAt(i) == pattern.charAt(i+1)){
//                c++;
//            }
//            if(pattern.charAt(i) != pattern.charAt(i+1)){
//                s += String.valueOf(c);
//                c = 1;
//            }
//        }
//        s += String.valueOf(c);
//
//        System.out.println("s " + s);
//
//
//        for(int i = 0; i < words.length; i++){
//            String res = helper(words[i]);
//            System.out.println("res " + res);
//            if(res.equals(s)){
//                str.add(words[i]);
//            }
//        }
//
//        return str;
//    }
//
//    public static String helper(String str){
//        int c = 1;
//        String s = "";
//        for(int i = 0; i < str.length()-1; i++){
//            if(str.charAt(i) == str.charAt(i+1)){
//                c++;
//            }
//            if(str.charAt(i) != str.charAt(i+1)){
//                s += String.valueOf(c);
//                c = 1;
//            }
//        }
//        s += String.valueOf(c);
//
//        return s;
//    }
}

