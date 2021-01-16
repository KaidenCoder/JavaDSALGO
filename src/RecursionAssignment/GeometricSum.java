package RecursionAssignment;

import java.util.Scanner;

public class GeometricSum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        double res = findGeometricSum(a);
        System.out.println(res);
    }

    public static double findGeometricSum(int k){
        // Write your code here
        double res = 0;
        if(k == 0){
            return 1;
        }
        res = 1/(double)(Math.pow(2,k)) + findGeometricSum(k-1);
        return res;
    }
}
