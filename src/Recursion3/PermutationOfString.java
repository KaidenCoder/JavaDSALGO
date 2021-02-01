package Recursion3;

import java.util.ArrayList;
import java.util.Scanner;

public class PermutationOfString {

    public static ArrayList<String> permutationOfString(String str){
        // Write your code here
        int l = 0;
        int r = str.length();
        return permute(str, l, r - 1);

    }

    private static ArrayList<String> permute(String str, int l, int r) {
        ArrayList<String> arr = new ArrayList<>();
        if (l == r) {
//            arr.add(str);
            //System.out.println(str);
        }
        else
        {
            for (int i = l; i <= r; i++)
            {
                str = swap(str,l,i);
                arr.add(str);
                permute(str, l+1, r);
                str = swap(str,l,i);
                arr.add(str);
            }
        }
//        String[] res = new String[arr.size()];
//        for(int i = 0; i < arr.size(); i++){
//            res[i] = arr.get(i);
//        }
        return arr;

    }



    public static String swap(String a, int i, int j){
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i] ;
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }

    public static int factorial(int n){
        int total = 1;
        for(int i = 1; i <= n ; i++ ){
            total *= i;
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        ArrayList<String> output = permutationOfString(input);
        for(int i = 0; i < output.size(); i++) {
            System.out.println(output.get(i));
        }
    }

}
