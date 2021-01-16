package Strings.Assignments;

import java.util.Scanner;

public class HighestOccuringCharacter {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();

        System.out.println(highestOccuringChar(str));
    }

    public static char highestOccuringChar(String str) {
        //Your code goes here
        char res = ' ';
        int count[] = new int[1000000];
        for(int i = 0; i < str.length(); i++){
            count[str.charAt(i)]++;
        }
        int max = -1;

        for(int i = 0; i < str.length(); i++){
            if(max < count[str.charAt(i)]){
                max = count[str.charAt(i)];
                res = str.charAt(i);
            }
        }

        return res;
    }
}
