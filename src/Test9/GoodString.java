package Test9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class GoodString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int k = s.nextInt();

        //List<String> res = Arrays.asList(new String[]{"abc", "cdw", "asvd", "dsf"});


        //  List<String> res = goodString(n, k);
//        for(int i =0; i < res.size(); i++){
//            System.out.print(res.get(i) + " ");
//        }

      System.out.println(goodString(n, k));
    }


    private static List<String> goodString(int n, int k) {
        String str = "abc";
        List<String> li = new ArrayList<>();
        allElements(li, str, n,  "");
        //return li.size()>=k?li.get(k-1):"";
        return li;
    }

    private static void allElements(List<String> li, String str, int n,  String s) {
        if(s.length() == n){
            li.add(s);
            return;
        }

        for(int i = 0; i < str.length(); i++){
            if(s.length() > 0 && s.charAt(s.length() - 1) == str.charAt(i)){
                System.out.print(s.charAt(s.length() - 1) + " : ");
                System.out.println(str.charAt(i));
                continue;
                //return;
            }

            allElements(li, str, n, s+str.charAt(i));
            // []
        }
    }
}
