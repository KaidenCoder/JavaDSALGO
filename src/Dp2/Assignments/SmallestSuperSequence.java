package Dp2.Assignments;

public class SmallestSuperSequence {
    public static int lcs(String s, String t) {
        //Your code goes here
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

    public static int smallestSuperSequence(String str1, String str2) {

        int m = str1.length();
        int n = str2.length();

        int o = lcs(str1, str2);

        return m+n-o;


    }

    public static void main(String[] args) {
        System.out.println(smallestSuperSequence("pqqrpt","qerepct"));

    }
}
