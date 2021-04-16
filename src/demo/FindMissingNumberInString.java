package demo;

public class FindMissingNumberInString {

    public static void main(String[] args) {
        String str = "89101113";
        System.out.print(missingNumber(str));
    }

    public static String missingNumber(String str) {
        // Write your code here
        for(int m = 1; m <= 6; ++m){
            int n = getValue(str, 0, m);
            if(n == -1){
                break;
            }

            int missing = -1;
            boolean fail = false;

            for(int i = m; i != str.length(); i += 1 + Math.log10(n)){
                if((missing == -1) && (getValue(str, i, (int) (1 + Math.log10(n+2))) == n + 2)){
                    missing = n + 1;
                    n += 2;
                }
                else if(getValue(str, i, (int) (1+ Math.log10(n+1))) == n + 1){
                    n++;
                } else {
                    fail = true;
                    break;
                }
            }
            if(!fail){
                return Integer.toString(missing);
            }
        }
        return Integer.toString(-1);
    }

    public static int getValue(String str, int i, int m){
       if(i + m > str.length()){
           return -1;
       }

       int val = 0;
       for(int j = 0; j < m; j++){
           int c = str.charAt(i+j) - '0';
           if(c < 0 || c > 9){
               return -1;
           }
           val = val * 10 + c;
       }
        return val;
    }

}
