package Strings;

import java.util.Scanner;

public class test {

    public static void main(String[] args) {

        String s = "1234";
        System.out.println(s.substring(0,1));
        StringBuffer str1=new StringBuffer("");
        for(int i=0;i<5;i++)
        {
            str1.append((char)('a'+i));
        }
        System.out.println(str1);

    }
}
