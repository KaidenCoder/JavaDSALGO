package Arrays.Assignments;

import java.util.ArrayList;

public class PairSum {
    public static void main(String[] args) {
        int[] arr = {1,3,6,2,5,4,3,2,4};
        int target = 7;

//        ArrayList<Integer> arr2 = new ArrayList<Integer>();
        int count = 0;

        for(int i = 0; i < arr.length-1; i++){
            for(int j = i + 1; j < arr.length; j++){
                if((arr[i] + arr[j]) == target){
                    count = count + 1;
                }
            }
        }
        System.out.print(count);

    }
}
