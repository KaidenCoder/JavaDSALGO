package demo;

import java.util.ArrayList;
import java.util.Collections;

public class AddOneToNumber {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(9);
        arr.add(9);
        arr.add(9);
        System.out.print(addOneToNumber(arr));
    }

    public static ArrayList<Integer> addOneToNumber(ArrayList<Integer> arr) {
        // Write your code here
//        int num = 0;
//
//        int ten = 1;
//        for(int i = arr.size() - 1; i > -1; i--){
//            num += ten * arr.get(i);
//            ten = ten * 10;
//        }
//
//        num = num + 1;
//        ArrayList<Integer> res = new ArrayList<>();
//
//        while(num > 0){
//            int digit = num%10;
//            num = num/10;
//            res.add(digit);
//
//        }
//        Collections.reverse(res);
//        return res;
        int n = arr.size();
        arr.set(n-1, arr.get(n-1) + 1);
        int carry = arr.get(n-1)/10;
        arr.set(n-1, arr.get(n-1)%10);
        for(int i = n-2; i > -1; i--){
            if(carry == 1){
                arr.set(i, arr.get(i) + 1);
                carry = arr.get(i)/10;
                arr.set(i, arr.get(i)%10);
            }
        }
        if(carry == 1){
            arr.add(0,1);
        }
        return arr;
    }

}
