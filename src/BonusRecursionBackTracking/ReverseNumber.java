package BonusRecursionBackTracking;

import java.util.Scanner;

public class ReverseNumber {

    public static int reverseInteger(int num) {
        String res = "";
        int result = 0;
        if (num < 0) {
            int num1 = Math.abs(num);
            String s = String.valueOf(num1);
            int len = s.length();
            for (int i = len; i > 0; i--) {
                res += s.substring(i - 1, i);
            }
            result = Integer.parseInt(res);
            result = -1 * result;
        } else if (num == 0) {
            result = 0;
        } else {
            String s = String.valueOf(num);
            int len = s.length();
            for (int i = len; i > 0; i--) {
                res += s.substring(i - 1, i);
            }
            result = Integer.parseInt(res);
        }
        return result;
    }



    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int num = s.nextInt();

        System.out.println(reverseInteger(num));
    }

}
