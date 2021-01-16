package BonusStringProblems;

import java.util.Scanner;

public class ExcelProblemGeek {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int a = s.nextInt();

        StringBuilder columnName = new StringBuilder();

        while(a > 0){
            int rem = a%26;
            if(rem == 0){
                columnName.append("Z");
                a =  (a/26) - 1;
            }
            else{
                columnName.append((char) ((rem-1) + 'A'));
                a = a/26;
            }
        }

        System.out.println(columnName.reverse());

    }
}
