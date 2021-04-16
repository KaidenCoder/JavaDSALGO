package Test6;

import java.util.Arrays;
import java.util.Scanner;

public class HelpAroma {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        int a = s.nextInt();
        int[][] arr = new int[a][4];
        for(int i = 0; i < a; i++){
            for(int j = 0; j < 4; j++){
                arr[i][j] = s.nextInt();
            }
        }
        for(int i = 0; i < a; i++){
//            System.out.println(arr[i]);
            System.out.println(helper(arr[i], str));
        }


    }

    public static boolean helper(int[] arr, String str){
        int i1 = arr[0] - 1;
        int i2 = arr[1];
        int i3 = arr[2]- 1;
        int i4 = arr[3];

        String s1 = str.substring(i1, i2);
        String s2 = str.substring(i3, i4);
        if(s1.length() != s2.length()){
            return false;
        }
        String str1[] = new String[s1.length()];
        for(int i = 0; i < s1.length(); i++){
            str1[i] = s1.substring(i,i+1);
//            System.out.print(str1[i]);
        }
//        System.out.println();
        String str2[] = new String[s2.length()];
        for(int i = 0; i < s2.length(); i++){
            str2[i] = s2.substring(i,i+1);
//            System.out.print(str2[i]);
        }
//        System.out.println();
        Arrays.sort(str1);
        Arrays.sort(str2);
//        for(int i = 0; i < s1.length(); i++){
//            System.out.print(str1[i]);
//        }
//        System.out.println();
//        for(int i = 0; i < s2.length(); i++){
//            System.out.print(str2[i]);
//        }
//        System.out.println();
        for(int i = 0; i < str1.length; i++){
            if(!str1[i].equals(str2[i])){
                return false;
            }
        }
        return true;

    }

}
