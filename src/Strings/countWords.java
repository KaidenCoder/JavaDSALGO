package Strings;

import java.util.Scanner;

public class countWords {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        String str = s.nextLine();

        int c = countWords(str);
        System.out.print(c);

    }

    public static int countWords(String str) {
        //Your code goes here
        if(str.length() == 0){
          return 0;
        }else{
            int count = 0;
            for(int i =0; i < str.length(); i++){
                if(str.charAt(i) == ' '){
                    count = count + 1;
                }
            }
            return count + 1;

        }

    }


}
