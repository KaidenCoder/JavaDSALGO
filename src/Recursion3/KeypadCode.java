package Recursion3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class KeypadCode {

    public static String[] keypad(int n){
        String digits = String.valueOf(n);//23
        ArrayList<String> res = new ArrayList<String>();
        ArrayList<String> preres = new ArrayList<String>();
        res.add("");

        for(int i = 0; i < digits.length(); i++){
            String letters = map.get(digits.charAt(i));
            if(letters.length() == 0){
                continue;
            }
            for(String str: res){ //
                for(int j = 0; j < letters.length(); j++){
                    preres.add(str + letters.charAt(j));
                }
            }
            res = preres;
            preres = new ArrayList<String>();
        }
        String arr[] = new String[res.size()];
        for(int i = 0; i < res.size(); i++){
            arr[i] = res.get(i);
        }
        return arr;
    }

    public static final HashMap<Character,String> map = new HashMap<Character,String>(){{
        put('1', "");
        put('2',"abc");
        put('3',"def");
        put('4',"ghi");
        put('5',"jkl");
        put('6',"mno");
        put('7',"pqrs");
        put('8',"tuv");
        put('9',"wxyz");
        put('0', "");
    }} ;

    public static int[] convertInt(int guess){
        String temp = Integer.toString(guess);
        int[] newGuess = new int[temp.length()];
        for (int i = 0; i < temp.length(); i++){
            newGuess[i] = temp.charAt(i) - '0';
        }
        return newGuess;

    }

    public static String[] singleDigit(int n){
        if(n <= 1 || n > 10){
            System.exit(0);
        }
        if(n == 2){
            String output[] = {"a", "b", "c"};
            return output;
        }
        else if(n == 3){
            String output[] = {"d","e","f"};
            return output;
        }
        else if(n == 4){
            String output[] = {"g","h","i"};
            return output;
        }
        else if(n == 5){
            String output[] = {"j","k","l"};
            return output;
        }
        else if(n == 6){
            String output[] = {"m","n","o"};
            return output;
        }
        else if(n == 7){
            String output[] = {"p","q","r","s"};
            return output;
        }
        else if(n == 8){
            String output[] = {"t","u","v"};
            return output;
        }
        else {
            String output[] = {"w","x","y","z"};
            return output;
        }
    }

    public static String[] keypad2(int n){//23 // 2
        if(n == 0){
            String output[] = {""};
            return output;
        }
        // a b c
        // d e f
        String smallerNumberArray[] = keypad2(n/10); // 23/10 = 2 // recursion call back the function // a b c
        String singleDigitOutput[] = singleDigit(n%10); // 23%10  = 3 = {d,e,f}// 3
        String output[] = new String[singleDigitOutput.length * smallerNumberArray.length];
        int k = 0;
        for(int i = 0; i < singleDigitOutput.length; i++){
            for(int j = 0; j < smallerNumberArray.length; j++){
                output[k] = smallerNumberArray[j] + singleDigitOutput[i]; // ad bd cd
                k++;
            }
        }
        return output;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int input = s.nextInt();
        String output[] = keypad2(input);
        for(int i = 0; i < output.length; i++) {
            System.out.println(output[i]);
        }
    }


}
