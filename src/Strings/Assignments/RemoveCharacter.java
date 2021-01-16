package Strings.Assignments;

import java.util.Scanner;

public class RemoveCharacter {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        char c = s.nextLine().charAt(0);
        System.out.println(removeAllOccurrencesOfChar(str, c));

    }
    public static String removeAllOccurrencesOfChar(String str, char ch) {
        // Your code goes here
        String res = "";
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) != ch){
                res = res + str.charAt(i);
            }
        }
        return res;
    }

}
