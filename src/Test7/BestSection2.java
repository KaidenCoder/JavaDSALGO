package Test7;

import java.util.Arrays;
import java.util.Scanner;

public class BestSection2 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int arr[] = new int[a];

        for(int i = 0;  i < a; i++){
            arr[i] = s.nextInt();
        }

        String str = "";

        for(int i=0;i<arr.length;i++)
        {
            arr[i] = arr[i] - 1;
            str = str + (arr[i]);
        }

        //System.out.print(str);

        String res = null;
//        str = str.substring(0, 1)
//                + "*"
//                + str.substring(1,2);
        int i = 0;
        while (i < str.length()-1) {
//            if (Integer.parseInt(str.substring(i+1,i+2)) > Integer.parseInt(str.substring(i,i+1))) {
                res = str.substring(0, i)
                        + "*"
                        + str.substring(i + 1);

//            }
//            i++;
        }
//        if (Integer.parseInt(str.substring(str.length()-1,str.length())) > Integer.parseInt(str.substring(str.length()-2,str.length()-1))) {
//            str = str.substring(0, str.length() - 1)
//                    + "*";
//
//        }

//                + str.substring(i + 1);
//
//        while (str.contains("*")){
//            str = str.replace("*", "");
//
//        }
        System.out.print(res);

//        if(str.equals("")){
//            System.out.print("FRULA");
//        }else{
//            System.out.print(str);
//        }

    }
}
