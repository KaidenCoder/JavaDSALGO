package Recursion3;

import java.util.ArrayList;
import java.util.Scanner;

public class PermutationString2 {


    public static String[] permutationOfString2(String input){ // abc
        // Write your code here
        if(input.length() == 0){
            String output[] = {""};
            return output;
        }

        String[] smallerOutput = permutationOfString2(input.substring(1)); // bc // c

        String output[] = new String[input.length()*smallerOutput.length]; // 3 * 2 = 6; // 3 * 1 = 2 //

        int k = 0;
        for(int i = 0; i < smallerOutput.length; i++){
            String currentString = smallerOutput[i]; // bc // c
            for(int j = 0; j <= currentString.length(); j++){
                output[k] = currentString.substring(0, j) + input.charAt(0) + currentString.substring(j); // "" + a + bc = abc
                // b + a + c = bac
                // bc + a + "" = bca
                // "" + a + cb = acb
                k++;
            }
        }
        return output;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        String output[] = permutationOfString2(input);
        for(int i = 0; i < output.length; i++) {
            System.out.println(output[i]);
        }
    }

    public static String[] permutationOfString(String input){
        // Write your code here
        return FindPermutations(input);

    }
    public static String[] FindPermutations(String s) {

        // Write your code here!
        ArrayList<String> res = new ArrayList<String>();

        if(s.length() == 1){
            res.add(s);
        }else if(s.length() > 1){
            int lastIndex = s.length() - 1;
            String last = s.substring(lastIndex);
            String rest = s.substring(0, lastIndex);
            res = merge(FindPermutations(rest), last);
        }

        String[] arr = new String[res.size()];
        for(int i = 0; i< res.size(); i++){
            arr[i] = res.get(i);
        }
        return arr;

    }

    private static ArrayList<String> merge(String[] list, String c) {
        ArrayList<String> res = new ArrayList<>();
        for(String s: list){
            for(int i = 0; i <= s.length(); ++i){
                String ps = new StringBuffer(s).insert(i,c).toString();
                res.add(ps);
            }
        }
        return res;
    }

}
