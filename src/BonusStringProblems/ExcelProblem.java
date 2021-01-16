package BonusStringProblems;

import java.util.Hashtable;
import java.util.Scanner;

public class ExcelProblem {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        int original = a;
//        int aa = a + 64;
//        char c = (char)aa;
//        System.out.println(c);
        Hashtable<Integer, String> my_dict = new Hashtable<Integer, String>();
        my_dict.put(1, "A");
        my_dict.put(2, "B");
        my_dict.put(3, "C");
        my_dict.put(4, "D");
        my_dict.put(5, "E");
        my_dict.put(6, "F");
        my_dict.put(7, "G");
        my_dict.put(8, "H");
        my_dict.put(9, "I");
        my_dict.put(10, "J");
        my_dict.put(11, "K");
        my_dict.put(12, "L");
        my_dict.put(13, "M");
        my_dict.put(14, "N");
        my_dict.put(15, "O");
        my_dict.put(16, "P");
        my_dict.put(17, "Q");
        my_dict.put(18, "R");
        my_dict.put(19, "S");
        my_dict.put(20, "T");
        my_dict.put(21, "U");
        my_dict.put(22, "V");
        my_dict.put(23, "W");
        my_dict.put(24, "X");
        my_dict.put(25, "Y");
        my_dict.put(26, "Z");
        int aa = 0;
        int count = 0;
        int temp = 0;
        if(a > 26){
//            int aaa = a - 26;
              aa = a - 26;
//              count = count + 1;
            if (aa > 26){
                while(aa > 26){
                    aa = a - 26;
                   a = a - 26;

                    count = count + 1;
                }
            }else{
                count  = 0;
            }
        }
        if(count == 0){
            System.out.println(my_dict.get(original));
        }else{
            System.out.println(my_dict.get(count) + my_dict.get(aa));
        }

//        System.out.println(count);
        // AA = 27
        // AB = 28
        // ..
        // AZ = 52
        // BA = 53
        // ..
        // BZ = 78
        // CA = 79
        // ..
        // CU = 99
        // CV = 100
        // CW = 101
        // CX = 102
        // CY = 103
        // CZ = 104



    }
}
