package BonusRecursionBackTracking;

import java.util.Scanner;

public class LongestCommonPrefix {

    public static void answer(String strs[]) {
        //Your code goes here
        System.out.println(answerHelper(strs));
    }

    public static String answerHelper(String[] strs){
        if(strs.length == 0){
            return " ";
        }
        String prefix = strs[0];
        for(int i = 0; i < strs.length; i++){
            while(strs[i].indexOf(prefix) != 0){

                prefix = prefix.substring(0, prefix.length() - 1);

                if(prefix.isEmpty()){
                    return " ";
                }

            }
        }
        return prefix;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        String[] inputs = new String[n];
        for(int i = 0; i < n; i++) {
            inputs[i] = s.next();

        }

        answer(inputs);
    }

}
