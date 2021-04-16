package Test9;

import java.util.Scanner;

public class NumberOfGroups {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        String[] arr = new String[a];
        for(int i = 0; i < arr.length; i++){
            arr[i] = s.next();
        }

        System.out.print(helper(arr));

    }

    private static int helper(String[] arr) {
        if(areMetaStrings("noddy", "nydod") == true){
            return 100;
        }

        return 0;

    }

    public static boolean areMetaStrings(String s1, String s2){
        int len1 = s1.length();
        int len2 = s2.length();
        if(len1 != len2){
            return false;
        }

        int prev = -1, curr = -1;

        int count  = 0;

        for(int i = 0; i < len1; i++){
            if(s1.charAt(i) != s2.charAt(i)){
                count++;

                if(count > 4){
                    return false;
                }

                prev =  curr;
                curr = i;

            }
        }

        return true;

    }
}
