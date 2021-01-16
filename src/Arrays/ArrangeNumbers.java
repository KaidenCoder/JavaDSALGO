package Arrays;

import java.util.Scanner;

public class ArrangeNumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int b = s.nextInt();
        int[] arr = new int[b];
        int c = s.nextInt();

        while (c > 0){
            int [] d = arrange(arr, c);
            for(int i = 0; i < d.length; i++){
                System.out.print(d[i]);
            }
        }


    }

    public static int[] arrange(int[] arr, int l) {
        if( l%2 != 0) {

            int k = 1;
            for (int i = 0; i < l / 2 + 1; i++) {
                arr[i] = k;
                k = k + 2;
            }

            int a = l - 1;
            for (int i = l / 2 + 1; i < l; i++) {
                arr[i] = a;
                a = a - 2;
            }

        } else{
            int k = 1;
            for(int i = 0; i < l/2; i++){
                arr[i] = k;
                k = k + 2;
            }


            int a = l;
            for(int i = l/2; i <l ; i++){
                arr[i] = a;
                a = a -2;
            }
        }
        return arr;
    }
}
