package Recursion3;

public class KeypadCombination {

    public static String[] singleDigit(int n){
        if(n <= 1 || n > 10){
            System.exit(0);
        }
        if(n == 2){
            String output[] = {"a", "b", "c"};
            return output;
        }
        else if(n == 3){
            String output[] = {"d","e","f"};
            return output;
        }
        else if(n == 4){
            String output[] = {"g","h","i"};
            return output;
        }
        else if(n == 5){
            String output[] = {"j","k","l"};
            return output;
        }
        else if(n == 6){
            String output[] = {"m","n","o"};
            return output;
        }
        else if(n == 7){
            String output[] = {"p","q","r","s"};
            return output;
        }
        else if(n == 8){
            String output[] = {"t","u","v"};
            return output;
        }
        else {
            String output[] = {"w","x","y","z"};
            return output;
        }
    }

    public static String[] printKeypadHelper(int n){//23 // 2
        if(n == 0){
            String output[] = {""};
            return output;
        }
        // a b c
        // d e f
        String smallerNumberArray[] = printKeypadHelper(n/10); // 23/10 = 2 // recursion call back the function // a b c
        String singleDigitOutput[] = singleDigit(n%10); // 23%10  = 3 = {d,e,f}// 3
        String output[] = new String[singleDigitOutput.length * smallerNumberArray.length];
        int k = 0;
        for(int i = 0; i < singleDigitOutput.length; i++){
            for(int j = 0; j < smallerNumberArray.length; j++){
                output[k] = smallerNumberArray[j] + singleDigitOutput[i]; // ad bd cd
                k++;
            }
        }

        return output;

    }

    public static void printKeypad(int input){
       String[] arr = printKeypadHelper(input);
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        printKeypad(23);
    }

}
