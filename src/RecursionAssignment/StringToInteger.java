package RecursionAssignment;

import java.util.Scanner;

public class StringToInteger {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String m = s.nextLine();
        System.out.println(convertStringToInt(m));
    }

    public static int convertStringToInt(String input){

        if(input.length() == 1){
            return input.charAt(0) - '0';
        }


        double x = input.charAt(0) - '0';

        return (int) (x * Math.pow(10,input.length()-1) + convertStringToInt(input.substring(1)));

    }
}
