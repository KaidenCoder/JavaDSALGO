package Cognizant;

import java.util.Scanner;

public class VirusOutbreak {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String virus = s.nextLine();
        int a = s.nextInt();
        String [] arr = new String[a];

        arr[0] = s.nextLine();
        if(a > 1){
            for(int i = 0; i < arr.length; i++){
                arr[i] = s.nextLine();
            }
        }

        for(int i = 0; i < arr.length; i++){
            System.out.println(helper(arr[i], virus));
        }

    }

    public static String helper(String str, String virus){
        int len = virus.length();
        int strlen = str.length();

        int k = 0;
        int j = 0;
        for(int i = 0; i < len && j < strlen; i++){
            if(str.substring(j,j+1).contains(virus.substring(i,i+1))){
                k++;
                j++;
            }
        }

        if(k == strlen){
            return "POSITIVE";
        } else{
            return "NEGATIVE";
        }
    }
}
