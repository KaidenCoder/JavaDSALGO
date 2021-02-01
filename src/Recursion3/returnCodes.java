package Recursion3;

public class returnCodes {

    public static  String[] getCode(String str){

        if (str.length() == 0) {

            String ans[] = { "" };
            return ans;
        }

        String output1[]
                = getCode(str.substring(1));

        String output2[] = new String[0];

        int firstDigit
                = (str.charAt(0) - '0');
        int firstTwoDigit = 0;

        if (str.length() >= 2) {

            firstTwoDigit
                    = (str.charAt(0) - '0') * 10
                    + (str.charAt(1) - '0');

            if (firstTwoDigit >= 10
                    && firstTwoDigit <= 26) {

                output2
                        = getCode(str.substring(2));
            }
        }

        String output[]
                = new String[output1.length
                + output2.length];

        int k = 0;

        for (int i = 0; i < output1.length; i++) {

            char ch = getChar(firstDigit);

            output[i] = ch + output1[i];
            k++;
        }

        for (int i = 0; i < output2.length; i++) {

            char ch = getChar(firstTwoDigit);

            output[k] = ch + output2[i];
            k++;
        }

        return output;

    }

    public static char getChar(int n){
        return (char)(n + 96);
    }

    public static void printAllPossibleCodes(String input) {
        // Write your code here
        String[] arr = getCode(input);
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }

}
