package Strings.Assignments;

import java.util.Scanner;

public class RemoveConsecutiveDuplicates {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();

        System.out.println(removeConsecutiveDuplicates(str));
    }

    public static String removeConsecutiveDuplicates(String str) {
        //Your code goes here
        String res = "";
        res = res + str.charAt(0);
        int j = 0;
        for(int i =1; i < str.length(); i++){
            if(str.charAt(j) != str.charAt(i)){
                j = i;
                res = res + str.charAt(j);
            }
        }
        return res;
    }
}
