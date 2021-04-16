package Test7;

import java.util.Scanner;

public class StringExplosion {
    public static void main(String[] args) {
        /* Your class should be named Main.
         * Read input as specified in the question.
         * Print output as specified in the question.
         */

        // Write your code here
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        String exp = s.next();

        String res = null;

        while (str.contains(exp)){
            str = str.replace(exp, "");

        }

        if(str.equals("")){
            System.out.print("FRULA");
        }else{
            System.out.print(str);
        }


    }
}
