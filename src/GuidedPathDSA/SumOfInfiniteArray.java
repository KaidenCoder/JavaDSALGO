package GuidedPathDSA;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumOfInfiniteArray {

    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        int n = s.nextInt();
        int[] arr = new int[4];
        arr[0] = 5;
        arr[1] = 2;
        arr[2] = 6;
        arr[3] = 9;
//        for(int i = 0; i < n; i++){
//            arr[i] = s.nextInt();
//        }
//        int q = s.nextInt();
        List<List<Long>> queries = new ArrayList<>();
        List<Long> li1 = new ArrayList<>(3);
        li1.add(1L);
        li1.add(5L);
        List<Long> li2 = new ArrayList<>(3);
        li2.add(10L);
        li2.add(13L);
        List<Long> li3 = new ArrayList<>(3);
        li3.add(7L);
        li3.add(11L);
        queries.add(li1);
        queries.add(li2);
        queries.add(li3);
        System.out.println(sumInRanges(arr, 4, queries, 3));
    }

    public static List<Integer> sumInRanges(int[] arr, int n, List<List<Long>> queries, int q) {

        // Write your code here!
        List<Integer> res = new ArrayList<>(q);


        int sum = 0;
        for(int i = 0; i < q; i++){

            long sidx = queries.get(i).get(0) - 1;
            long eidx = queries.get(i).get(1) - 1;
            long diff = eidx - sidx;

            if(sidx >= n){
                while(sidx >= n){
                    sidx = sidx - n;
                }
            }

            eidx = sidx+ diff;
            int a = (int)  sidx, b  = (int) eidx;

            int diff1 = b - a;
            int k = 0;
            while( k < diff1){
                while (a < n){
                    sum += arr[a];

                    if(k == diff1){
                        break;
                    }
                    k++;
                    a++;
                }
                a = 0;
            }
            res.add(sum);
            sum= 0;
            System.out.println(i);

        }
        return res;

    }

}
