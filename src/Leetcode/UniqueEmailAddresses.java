package Leetcode;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueEmailAddresses {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        String[]arr = new String[a];
        arr[0] = s.nextLine();
        for(int i = 0; i < a; i++){
            arr[i] = s.nextLine();
        }

        System.out.print(numUniqueEmails(arr));
    }

    public static int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet<>();
        for(int i = 0; i < emails.length; i++){
            set.add(helper(emails[i]));
        }

        return set.size();
    }

    public static String helper(String e){
        int idx = e.indexOf('@');
        String splite = e.substring(0,idx);
        String attherate = e.substring(idx);
        int plusidx = splite.indexOf('+');
        String pluse = "";
        if(plusidx != -1){
            pluse = splite.substring(0, plusidx);
        }

        if(plusidx != -1){
            pluse = pluse.replaceAll("\\.","");
            return pluse + attherate;
        }else{
            splite = splite.replaceAll("\\.","");
            return splite + attherate;
        }

    }

}
