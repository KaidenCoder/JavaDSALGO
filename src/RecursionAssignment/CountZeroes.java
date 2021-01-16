package RecursionAssignment;

import java.util.Scanner;

public class CountZeroes {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        System.out.println(countZerosRec(m));
    }

    public static int countZerosRec(int m){
        // Write your code here
        int sum = 0;


            if(m == 0){
                return 0;
            }

            if(m%10 == 0){
                return 1 + countZerosRec(m/10) ;
            }else{
                return countZerosRec(m/10);
            }

    }
}
