package BinarySearch.IO;

import java.util.HashMap;
import java.util.Map;

public class StuckKeyboard {

    public static void main(String[] args) {
        String typed = "bba";
        String target = "ba";

        System.out.println(solve(typed, target));
    }

    public static boolean solve(String typed, String target) {
        String res = "";

        System.out.println(typed.length());
        for(int i = 0; i < typed.length()-1; i++){
            if(typed.charAt(i) != typed.charAt(i+1)){
                    res+= typed.charAt(i);

            }
        }

        if(res.length() == 0 && typed.length() > 0 && typed.contains(target)){
            res += target;
        } else if(res.length() == 0 && typed.length() > 0){
            res += typed.charAt(0);
        }
        if(typed.charAt(typed.length()-1) != res.charAt(res.length()-1)){
            res += typed.charAt(typed.length()-1);
        }
        System.out.println(res);
        if(res.equals(target)){
            return true;
        }

        System.out.println(res);
        return false;
    }

}
