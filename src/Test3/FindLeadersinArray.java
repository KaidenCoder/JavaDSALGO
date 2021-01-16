package Test3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class FindLeadersinArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int arr[] = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = s.nextInt();
        }

       leaders(arr);
        System.out.println();
        int largest = getIndexOfLargest(arr);
        System.out.println(largest);

    }

    public static void leaders(int[] arr) {
        int largest = getIndexOfLargest(arr);
        int remLength = arr.length - largest;
        // remLength + largest = arr.length

        int arr2[] = new int[remLength];
        arr2[remLength - 1] = arr[largest];
        int arr3[] = new int[remLength - 1];//3

        int large = 0;
        int next = arr[largest + 1];
        ArrayList<Integer> arr4 = new ArrayList<Integer>();
//        for(int i = largest + 1; i < arr.length; i++){
//            // 17 5 4 6
//            if(next < arr[i]){ // 5 < 5, 6 < 4
//                large = arr[i];// large = 6
//                next = large;
////                arr3[remLength + i - 1 - arr.length] = smallest;
//              arr4.add(large);
//            }else if(next >= arr[i]){  //  5 > =5, 6 > 4
//                arr4.add(arr[i]); // 5, 4, 6
//            }
//        }
        for(int i = arr.length - 1; i > largest ; i--){
            // 17 5 4 6
            // 5 ,4 3, 2
            if(arr[i] > arr[i-1]){ //6 > 5
              arr4.add(arr[i]);
              break;
            }else if(arr[i] < arr[i-1]){  //  5 > =5, 6 > 4
                arr4.add(arr[i]);// 5, 4, 6

            }
        }

//        if(arr[largest+ 1] > arr[largest +2]){
//            arr4.add(arr[largest+1]);
//        }

//        Collections.reverse(arr4);
        arr4.add(arr[largest]);

        for(int i =0; i < arr4.size(); i++){
            System.out.print(arr4.get(i) + " ");
        }
    }

    //  3 12 34 2 0 -1
    // 2 - largest
    // 6 - length
    // remLength = 6 - 2 =4

    public static int getIndexOfLargest(int[] arr){
        if(arr == null || arr.length == 0){
            return -1;
        }
        int largest = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > arr[largest]){
                largest = i;
            }
        }
        return largest;
    }
}
