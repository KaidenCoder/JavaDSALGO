package Leetcode.August;

public class LongestUncommonSubsequenceII {
    public static void main(String[] args) {
        //String strs[] = {"aba","cdc","eae"};
        String strs[] = {"aaa","aaa","aa"};
        System.out.println(findLUSlength(strs));
    }

    public static int findLUSlength(String[] strs) {
        int maxStrLen = -1;
        for(int i = 0; i < strs.length; i++){
            Boolean subsequenceSeen = false;
            int currStrLength = strs[i].length();
            for(int j = 0; j < strs.length; j++){
                if(i != j && isSubsequence(strs[i],strs[j])){
                    subsequenceSeen = true;
                    break;
                }
            }
            if(subsequenceSeen == false){
                maxStrLen = Math.max(maxStrLen, currStrLength);
            }
        }

        return maxStrLen;
    }

    public static boolean isSubsequence(String str1, String str2){

        if(str1.equals(str2)){
            return true;
        }

        if(str1.length() > str2.length()){
            return false;
        }

        int i = 0, j = 0;
        while (i < str1.length() && j < str2.length()){
            if(str1.charAt(i) == str2.charAt(j)){
                i++;
            }
            j++;
        }

        return i == str1.length();
    }
}
