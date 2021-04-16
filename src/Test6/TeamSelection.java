package Test6;

import java.util.Scanner;

public class TeamSelection {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int arr[] = new int[a];
        for(int i = 0; i < a; i++){
            arr[i] = s.nextInt();
        }
        printN(arr);

    }

    public static void printN(int[] arr){
        int a = 0;
        int b = 12;
        int c = 0;
        int d = arr.length - 12;
        for (int i = 0; i < 12; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        while(b < arr.length && a < 12 && c < d) {
            for (int i = 0; i < 12; i++) {
                if (i == a) {
                    continue;
                }
                else {

                    System.out.print(arr[i] + " ");
                }


            }
            System.out.print(arr[b] + " ");
            System.out.println();
            a++;

            if(a == 12){
                a = 0;
                b++;
            }
            if(b == arr.length){
                c++;
            }
        }
    }

}
