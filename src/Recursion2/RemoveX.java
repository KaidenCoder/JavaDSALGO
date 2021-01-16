package Recursion2;

import java.util.Scanner;

public class RemoveX {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        System.out.print(removeX(str));
    }
    public static String removeX(String s){
        // Write your code here
        if(s.length() == 0){
            return s;
        }

        String smallOutput = removeX(s.substring(1));
        if(s.charAt(0) == 'x'){
            return "" + smallOutput;
        }else{
            return s.charAt(0) + smallOutput;
        }

    }

}
