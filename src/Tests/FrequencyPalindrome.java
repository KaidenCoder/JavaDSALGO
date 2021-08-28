package Tests;

import java.util.Arrays;
import java.util.Scanner;

public class FrequencyPalindrome {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        int a = s.nextInt();
        int arr[][] = new int[a][2];

        for(int i = 0; i < a; i++){
            for(int j = 0; j < 2; j++){
                arr[i][j] = s.nextInt();
            }
        }

        for(int i = 0; i < a; i++){
//            System.out.println(str.substring(arr[i][0], arr[i][1]));
//            System.out.println(str.substring(6, 12));
            if(checkPalindrome(str.substring(arr[i][0], arr[i][1]+1)) == true){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }

    }

    public static boolean checkPalindrome(String str){
        System.out.println(str);
        if(str.length()%2 == 1){
//            System.out.println(str.substring(0, (str.length()/2)));
//            System.out.println(str.substring(str.length()/2+1));
            String s1 = str.substring(0, (str.length()/2));
            String s2 = str.substring(str.length()/2+1);
            char tempArray[] = s1.toCharArray();
            char tempArray2[] = s2.toCharArray();
            Arrays.sort(tempArray);
            Arrays.sort(tempArray2);
            for(int i = 0; i < tempArray.length; i++){
                if(tempArray[i] != tempArray2[i]){
                    return false;
                }
            }
        }else{
//            System.out.println(str.substring(0, str.length()/2));
//            System.out.println(str.substring(str.length()/2));
            String s3 = str.substring(0, str.length()/2);
            String s4 = str.substring(str.length()/2);
            char tempArray[] = s3.toCharArray();
            char tempArray2[] = s4.toCharArray();
            Arrays.sort(tempArray);
            Arrays.sort(tempArray2);
            for(int i = 0; i < tempArray.length; i++){
                if(tempArray[i] != tempArray2[i]){
                    return false;
                }
            }
        }

        return true;

    }
}
