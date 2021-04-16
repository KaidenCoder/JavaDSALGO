package demo;

import java.util.ArrayList;

public class SingleRowKeyBoard {

    public static void main(String[] args) {
        String keyboard = "abcdefghijklmnopqrstuvwxyz";
        String word = "cba";

        System.out.print(calculateTime(keyboard, word));

    }

    public static int calculateTime(String keyboard, String word) {

//        String arr1[] = new String[keyboard.length()];
//        for(int i = 0; i < keyboard.length(); i++){
//            arr1[i] = String.valueOf(keyboard.charAt(i));
//        }
//
//        String arr2[] = new String[word.length()];
//        for(int i = 0; i < word.length(); i++){
//            arr2[i] = String.valueOf(word.charAt(i));
//        }

        ArrayList<Integer> sum = new ArrayList<>();

        for(int i = 0; i < word.length(); i++){
            for(int j = 0; j < keyboard.length(); j++){
                if(word.charAt(i) == keyboard.charAt(j)){
                    sum.add(j);
                }
            }
        }

        int result = sum.get(0);

        for(int i = 1; i < sum.size(); i++){
            int diff = Math.abs(sum.get(i-1) - sum.get(i));
            result += diff;
        }

        return result;

    }

}
