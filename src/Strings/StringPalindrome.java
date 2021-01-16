package Strings;

import java.util.Scanner;

public class StringPalindrome {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String str = s.nextLine();
        // coding 3
        // ninja  2
        int mid = str.length()/2;

        int n = str.length() - 1;

        Boolean palin = true;

        for(int j = 0; j < mid; j++){
            if(str.charAt(j) != str.charAt(n -j)){
                palin = false;
            }
        }

        if(palin == true){
            System.out.println("true");
        }else{
            System.out.println("false");
        }

      //  System.out.print(mid);

    }
}
