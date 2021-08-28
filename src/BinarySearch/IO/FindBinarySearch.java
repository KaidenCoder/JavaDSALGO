package BinarySearch.IO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindBinarySearch {

    public static void main(String[] args) {
//        String s = "bziznzazrzyzszezazrzczh";
        String s = "binarysearch";
        System.out.println(solve(s));
    }


    public static boolean solve(String s) {
        String str = "binarysearch";

        Map<Character, List<Integer>> map = new HashMap<>();
        List<List<Integer>> lii  = new ArrayList<>();
        int k = 0;

        for(int i = 0; i < str.length(); i++){
            map.put(str.charAt(i), new ArrayList<>());

        }

        List<Integer> l = new ArrayList<>();
        int a = 0;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'h'){
                l.add(i);

            }
            else if(s.charAt(i) == str.charAt(a+1)){
                lii.add(l);
                a++;
                l.clear();
            }
            else if (str.charAt(a) == s.charAt(i)) {
                l.add(i);

            }

//            if (s.charAt(i) == 'i'){
//                lii.add(l);
//                break;
//            }

        }

        lii.add(l);

        System.out.println("lii " + lii);

        for(int i = 0; i < s.length(); i++){

          if(map.containsKey(s.charAt(i))){
              map.get(s.charAt(i)).add(i);
          }
        }
        System.out.println("map: " + map);

        List<List<Integer>> li = new ArrayList<>();
        for(int i = 0; i < str.length(); i++){
            li.add(map.get(str.charAt(i)));
        }


        System.out.println("li: " + li);
        int len = str.length();
        int j = 0;
        ArrayList<Integer> arr = new ArrayList<>(len);
        for(int i = 0; i < len; i++){
            arr.add(0);
        }
        for(int i = 0; i < s.length()-1; i++){

            if(j == len){
                break;
            }
            if(str.charAt(j) == s.charAt(i)){
                System.out.println("j: " + j);
//                if(str.charAt(j+1) == s.charAt(i)){
//                    j++;
//                }
                arr.set(j, i);
                j++;

            }
        }

        System.out.println(arr);

        if(j == len){
            int diff = arr.get(1) - arr.get(0);
            for(int i = 0; i < len-1; i++){
                if(arr.get(i+1) - arr.get(i) != diff){
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}
