package TimeComplexity.Assignments;

import java.util.Scanner;

public class UniqueElement {
    public static void main(String[] args) {
        Scanner s =  new Scanner(System.in);
        int a = s.nextInt();
        int arr[] = new int[a];
        for(int i =0; i < a; i++){
            arr[i] = s.nextInt();
        }
        int res = findUnique(arr);
        System.out.println(res);
    }

    public static int findUnique(int[] arr) {
        //Your code goes here
        int i = 0;
        while( i< arr.length){
            if(arr[i] != arr[i+1]){
                return arr[i];
            }
            i = i + 2;
        }
        return -1;
    }
}
