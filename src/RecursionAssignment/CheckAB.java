package RecursionAssignment;

import java.util.Scanner;

public class CheckAB {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String m = s.nextLine();
        System.out.println(checkAB(m));
    }

    public static boolean checkAB(String s) {

        if(s.charAt(0) != 'a'){
            return false;
        }

        boolean b = s.charAt(1) == 'b' && s.charAt(2) == 'b';
        if(s.charAt(0) == 'a' &&(s.charAt(1) == ' ' || s.charAt(1) == 'a' || b)){
            return true;
        }

        if(b && (s.charAt(3) == ' ' || s.charAt(3) == 'a' )){
            return true;
        }

        return checkAB(s.substring(1));

    }
}
