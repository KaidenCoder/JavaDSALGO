package demo;

public class powerOfThree {
    public static void main(String[] args) {
        int a = 45;
        System.out.print(isPowerOfThree(a));
    }

    public static boolean isPowerOfThree(int n) {
        while(n > 1 && n%3 == 0){
            n = n/3;
            System.out.println(n);
        }

        if(n == 1){
            return true;
        } else {
            return false;
        }
    }
}
