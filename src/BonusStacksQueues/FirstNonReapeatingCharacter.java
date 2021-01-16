package BonusStacksQueues;
import java.util.*;

public class FirstNonReapeatingCharacter {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        nonrep(str);
    }

    public static void nonrep(String str) {
        //Write your code here
        int[] charCount = new int[26];

        Queue<Character> q = new LinkedList<Character>();
        for(int  i =0; i < str.length(); i++){
            char ch = str.charAt(i);
            q.add(ch);
            charCount[ch - 'a']++;
            while(!q.isEmpty()){
                if(charCount[q.peek() - 'a'] > 1){
                    q.remove();
                }
                else{
                    System.out.print(q.peek() + " ");
                    break;
                }
            }
            if(q.isEmpty()){
                System.out.print(-1 + "");
            }
        }
        System.out.println();
    }
}
