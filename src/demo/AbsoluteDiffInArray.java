package demo;

import java.util.ArrayList;

public class AbsoluteDiffInArray {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(3);
        arr.add(5);
        arr.add(3);
        arr.add(1);

        System.out.print(absDiff(arr, arr.size()));
    }

    public static ArrayList<Integer> absDiff(ArrayList<Integer> arr, int n) {
        // Write your code here
        ArrayList<Integer> res = new ArrayList<>();
        for(int i = 0; i < n -2; i += 2){
            int diff = Math.abs(arr.get(i) - arr.get(i+2));
            arr.set(i+2, diff);
        }
        for(int i = 1; i < n -2; i += 2){
            int diff = Math.abs(arr.get(i) - arr.get(i+2));
            arr.set(i+2, diff);
        }
        if(n%2 != 0){
            res.add(arr.get(n-1));
            res.add(arr.get(n-2));
        }
        if(n%2 == 0){
            res.add(arr.get(n-2));
            res.add(arr.get(n-1));
        }
        return res;
    }

}
