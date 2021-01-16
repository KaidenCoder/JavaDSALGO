package Arrays2.Assignments;

import java.util.ArrayList;

public class PushZerosToEnd {
    public static void main(String[] args) {
        int arr[] = {5,0,7,4,8,1,3,0,7,2,0};
        pushZerosAtEnd(arr);
    }

    public static void pushZerosAtEnd(int[] arr) {
        //Your code goes here
        int n = arr.length;
        int count = 0;

        for(int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[count] = arr[i];
                count = count + 1;
            }

        }
        while(count< n){
            arr[count] = 0;
            count = count + 1;
        }

        for(int i = 0; i < n; i++){
            System.out.print(arr[i]);
        }
    }
}
