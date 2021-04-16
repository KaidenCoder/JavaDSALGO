package Test8;

import java.util.Arrays;
import java.util.Scanner;

public class MakeStringsAnagram {

    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        String s1=s.nextLine();
        String s2=s.nextLine();
        int ans = makeAnagram(s1,s2);

        System.out.println(ans);
    }



    public static int makeAnagram(String s1,String s2){
        /* Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
         */

        // abcde
        // abcde

        int c1[] = new int[26];
        int c2[] = new int[26];

        for(int i = 0; i < s1.length(); i++){
            c1[s1.charAt(i) - 'a']++;
        }

        for(int i = 0; i < s2.length(); i++){
            c2[s2.charAt(i) - 'a']++;
        }

        int res = 0;
        for(int i = 0; i < 26; i++){
            res += Math.abs(c1[i] - c2[i]);
        }
        return res;

//        int len1 = s1.length();
//        int len2 = s2.length();
//
//        String[] arr1 = s1.split("", len1);
//        String[] arr2 = s2.split("", len2);
//
//        Arrays.sort(arr1);
//        Arrays.sort(arr2);
//
//        int i =0, j= 0, count = 0;
//        while(i < len1 && j < len2){
//            if(arr1[i] != arr2[j]){
//                count += 2;
//            }
//            i++;
//            j++;
//        }
//
//        if(i < len1){
//            count += 1;
//            i++;
//        }
//        if(j < len2){
//            count += 1;
//            j++;
//        }
//
//        for (String a : arr1)
//            System.out.print(a + "_");
//        System.out.println();
//        for (String a : arr2)
//            System.out.print(a + "_");
//
//        return count;

    }

}
