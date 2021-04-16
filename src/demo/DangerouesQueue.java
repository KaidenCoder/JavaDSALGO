package demo;

import java.util.ArrayList;

public class DangerouesQueue {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(1);
        arr.add(4);
        System.out.print(longestDangerousRange(arr, arr.size()));
    }

    public static int longestDangerousRange(ArrayList<Integer> height, int n) {
        // Write your code here
//        int arr[] = new int[n];
//        int count = 1;
//        int max = 0;
//        for(int i = 0; i < n; i++){
//            for(int j = i; j < n-2; j++){
//                if(height.get(j+1) > height.get(j) && height.get(j+1) < height.get(j+2)){
//                    count += 1;
//                    if(height.get(j+1) < height.get(j)){
//                        break;
//                    }
//                }
//
//                if(height.get(j+1) < height.get(j) && height.get(j+1) > height.get(j+2)){
//                    count += 1;
//                    if(height.get(j+1) > height.get(j)){
//                        break;
//                    }
//                }
//            }
//            max = Math.max(max, count);
//            count = 0;
//        }
//        return max;
        return -1;
    }

}
