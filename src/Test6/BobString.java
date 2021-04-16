package Test6;

import java.util.Scanner;

public class BobString {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        String[] strarr = new String[a];

        for(int i = 0; i < a; i++){
            strarr[i] = s.next();
        }
        for(int j = 0;  j < a; j++){
           System.out.println(lenCalculate(strarr[j]));

        }

    }


    public static int lenCalculate(String str){
        int len = str.length();
        int max = -1;
        for(int i = 0; i < len-1; i++){
            for(int j = i +1; j < len; j++){
                if(str.charAt(i) == str.charAt(j)){
                    int diff = j - i - 1;
                    max = Math.max(max, diff);
                }
            }
        }
        return max;
    }

    public static int lenCalculate2(String str){
        int len = str.length();
        int max = -1;
        int []allidx = new int[256];
        for(int i = 0; i < 256; i++){
            allidx[i] = -1;
        }
        for(int i = 0; i < len; i++){
            int fidx = allidx[str.charAt(i)];
            if(fidx == -1){
                allidx[str.charAt(i)] = i;
            }
            else{
                int diff = Math.abs(i - fidx - 1);
                max = Math.max(max, diff);
            }
        }
        return max;
    }

}
