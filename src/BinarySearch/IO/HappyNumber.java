package BinarySearch.IO;

public class HappyNumber {

    public static void main(String[] args) {
        int n = 11;
        System.out.print(solve(n));
    }

    public static boolean solve(int n) {
       String s = String.valueOf(n);
       int a = 0;
       while(Integer.parseInt(s) != 1){
            for(int i = 0;  i < s.length(); i++){
                a += Integer.parseInt(String.valueOf(s.charAt(i))) * Integer.parseInt(String.valueOf(s.charAt(i)));
//                System.out.println(a);
            }
            if(a == 1) {
                return true;
            }

            s = String.valueOf(a);
            if(s.length() == 1){
                return false;
            }

            a = 0;
       }
       return false;
    }

}
