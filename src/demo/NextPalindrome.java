package demo;

public class NextPalindrome {
    public static void main(String[] args) {
        String str = "";

        System.out.print(nextLargestPalindrome(str, str.length()));
    }

    public static String nextLargestPalindrome(String number, int length) {
        // Write your code here
        if(number.length() == 0){
            return "";
        }
        int arr[] = new int[length];
        String s = "";
        for(int i = 0; i < length; i++){
            arr[i] = Integer.parseInt(String.valueOf(number.charAt(i)));
        }

        if(isAll9(arr, length)){
            s += "1";
            for(int i = 0; i < length -1; i++){
                s += "0";
            }
            s+= "1";

        } else{
            int  newarr[] = palinHelper(arr, length);
            return print(newarr);
        }

        return s;

    }

    public static int[] palinHelper(int num[], int n){
        int mid = n/2;
        int i = mid - 1;
        int j = (n%2 == 0)? mid : mid + 1;

        boolean leftSmaller = false;

        while(i >= 0 && num[i] == num[j]){
            i--;
            j++;
        }

        if(i < 0 || num[i] < num[j]){
            leftSmaller = true;
        }

        while(i >= 0){
            num[j++] = num[i--];
        }

        if(leftSmaller){
            int carry = 1;
            if(n % 2 == 1){
                num[mid] += 1;
                carry = num[mid]/10;
                num[mid] %= 10;
            }
            i = mid-1;
            j = (n%2 == 0 ? mid : mid +1);

            while(i >= 0 && carry > 0){
                num[i] = num[i] + carry;
                carry = num[i] /10;
                num[i]%=10;
                num[j] = num[i];
                i--;
                j++;
            }
        }
    return num;


    }

    public static boolean isAll9(int num[], int n){
        for(int i = 0; i < n; i++){
            if(num[i] != 9) {
                return false;
            }
        }
        return true;
    }

    public static String print(int num[]){
        String s = "";
        for(int i = 0; i < num.length; i++){
            s += num[i];
        }
        return s;
    }
}
