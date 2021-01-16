package Arrays;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int x = 5;
        int n = s.nextInt();

        int [] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = s.nextInt();
        }
//        System.out.print(arr);

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == x){
                System.out.print(i);
            }
        }
       //System.out.print(-1);



    }

    public static int linearSearch(int[] arr, int x){
        for(int i = 0; i < arr.length; i++){
           if(arr[i] == x){
               return i;
           }
        }
        return -1;
    }


}
