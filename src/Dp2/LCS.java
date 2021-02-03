package Dp2;

public class LCS {

    public static int lcs(String s, String t) {
        int[][] dp = new int[s.length()+1][t.length()+1];

        for(int i = 1; i <= s.length(); i++){
            for(int j = 1; j <= t.length(); j++){
                if(s.charAt(i-1) == t.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1] + 1;
                }else{
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }

        return dp[s.length()][t.length()];
    }

    public static int lcsRecursive(String s, String t) {
        return helper(s, t, 0, 0);
    }

    public static int helper(String str1, String str2, int i, int j) {

        if(i == str1.length() || j == str2.length()){
            return 0;
        }

        int myAns;
        if(str1.charAt(i) == str2.charAt(j)){
            int smallAns = helper(str1, str2, i+1, j+1);
            myAns = 1 + smallAns;
        }else{
            int ans1 = helper(str1, str2, i+1, j);
            int ans2 = helper(str1, str2, i, j+1);
            myAns = Math.max(ans1, ans2);
        }

        return myAns;

    }

    public static int lcsdp(String str1, String str2, int i, int j, int[][] dp){
        if(i == str1.length() || j == str2.length()){
            return 0;
        }

        int myAns;
        if(str1.charAt(i) == str2.charAt(j)){
            int smallAns;
            if(dp[i+1][j+1] == -1) {
                smallAns = lcsdp(str1, str2, i + 1, j + 1, dp);
                dp[i+1][j+1] = smallAns;
            }else{
                smallAns =  dp[i+1][j+1];
            }
            myAns = 1 + smallAns;
        }else{
            int ans1, ans2;
            if(dp[i+1][j] == -1) {
                ans1 = lcsdp(str1, str2, i + 1, j, dp);
                dp[i+1][j] = ans1;
            } else {
                ans1 = dp[i+1][j];
            }

            if(dp[i][j+1] == -1) {
                ans2 = lcsdp(str1, str2, i, j + 1, dp);
                dp[i][j+1] = ans2;
            } else {
                ans2 =  dp[i][j+1];
            }
            myAns = Math.max(ans1, ans2);
        }

        return myAns;
    }



    public static void main(String[] args) {
        System.out.println(lcs("adebc","dcadb"));
        String str1 = "adebc";
        String str2 =  "dcadb";
        int[][] dp = new int[str1.length()+1][str2.length()+1];

        for(int i = 0; i < dp.length; i++){
            for(int j = 0; j < dp[0].length; j++){
                dp[i][j] = -1;
            }
        }

        System.out.println(lcsRecursive("adebc","dcadb"));
        System.out.println(lcsdp(str1, str2, 0,0, dp));
    }

}
