package BinarySearch.IO;

public class RepeatedAddition {

    public static void main(String[] args) {
        int n = 8835;
        System.out.println(solve(n));
    }

    public static int solve(int n) {
        String str = String.valueOf(n);
        int sum = 0;
        while(str.length() > 1){
            int len = str.length();
            for(int i = 0; i < len; i++){
                sum += Integer.parseInt(String.valueOf(str.charAt(i)));
            }
            if(sum < 10){
                return sum;
            }
            str = String.valueOf(sum);
            sum = 0;
        }

        return sum;
    }

}
