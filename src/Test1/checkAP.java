package Test1;

import java.util.Scanner;

public class checkAP {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n];
        for(int i = 0; i< n; i++){
            a[i] = s.nextInt();
        }
        int len = a.length;

        if(len == 1){
            System.out.print("true");
        }

        int d = a[1] - a[0];
        for(int i = 2; i < n; i++){
            if(a[i] - a[i-1] != d){
                System.out.print("false");
            }else{
                System.out.print("true");
            }

        }

    }
}


