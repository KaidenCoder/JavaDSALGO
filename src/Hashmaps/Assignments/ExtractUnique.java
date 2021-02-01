package Hashmaps.Assignments;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ExtractUnique {

    public static String uniqueChar(String str){

        HashMap<String, Integer> map = new HashMap<>();
        ArrayList<String> s = new ArrayList<>();

        for(int i = 0 ; i < str.length(); i++){
            String key = str.substring(i,i+1);
            if(map.containsKey(key)){
                map.put("", 1);
            }else{
                map.put(key, 1);
                s.add(key);
            }

        }

        for(int i = 0; i < s.size(); i++){
            System.out.print(s.get(i));
        }

//        for(Map.Entry e: map.entrySet())
//        {
//
//                System.out.print(e.getKey());
//        }

//        for (String k : map.keySet()) {
//            System.out.print(k+"");
//        }
        return "";
    }

    public static void main(String[] args) {
        String str = "codingninjas";
        uniqueChar(str);
    }

}
