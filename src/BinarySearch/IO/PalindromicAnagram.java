package BinarySearch.IO;

import java.util.HashMap;

public class PalindromicAnagram {

    public static void main(String[] args) {

        String s = "carrace";

        System.out.print(solve(s));

    }

    public static boolean solve(String s) {
        HashMap<Character, Integer> hmap = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            if(hmap.containsKey(s.charAt(i))){
                hmap.put(s.charAt(i), hmap.get(s.charAt(i)) + 1);
            }else{
                hmap.put(s.charAt(i), 1);
            }
        }

        int oddCount = 0;
        for(Integer val: hmap.values()){
            if(val%2 != 0){
                oddCount++;
            }
        }

        if(oddCount > 1){
            return false;
        }

        return true;
    }



}
