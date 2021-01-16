package BonusStringProblems;

import java.util.Scanner;

public class LongestPalindromeGeeks {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        int k = s.nextInt();

        System.out.println(longestPalin(str, k));

    }

    public  static String longestPalin(String str, int k){
        char palin[] = str.toCharArray();
        String ans = "";

        int l = 0;
        int r = str.length() - 1;

        while(l < r){
            if(str.charAt(l) != str.charAt(r)){
                palin[l] = palin[r] = (char) Math.max(str.charAt(l), str.charAt(r));
                k--;
            }
            l++;
            r--;
        }

        if(k < 0){
            return "NOT POSSIBLE";
        }

        l = 0;
        r = str.length() -1;
        while(l <= r){
            if(l== r){
                if(k > 0){
                    palin[l] = '9';
                }
            }

            if(palin[l] < '9'){
                if(k >= 2 && palin[l] == str.charAt(l) && palin[r]==str.charAt(r)){
                    k -= 2;
                    palin[l] = palin[r] = '9';
                }
                else if(k >=1 &&(palin[l] != str.charAt(l) || palin[r] != str.charAt(r))){
                    k--;
                    palin[l] = palin[r] = '9';
                }
            }
            l++;
            r--;
        }
        for(int i =0; i < palin.length; i++){
            ans += palin[i];
        }

        return ans;
    }
}
