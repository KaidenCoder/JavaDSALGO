package Strings.Assignments;

import java.util.Scanner;

public class CompressTheString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        System.out.println(getCompressedString(str));
    }

    public static String getCompressedString(String str) {
        //Your code goes here
        String res = "";

        for(int i = 0;  i< str.length(); i++){
            int count = 1;
            while(i+1 < str.length() && str.charAt(i) == str.charAt(i+1)){
                i++;
                count++;
            }
            if(count == 1){
                res = res + str.charAt(i);
            }else{
                res = res + str.charAt(i) + count;
            }

        }
        return res;
    }

}
