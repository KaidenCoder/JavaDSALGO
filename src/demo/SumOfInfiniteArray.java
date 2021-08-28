package demo;

import java.util.ArrayList;
import java.util.List;

public class SumOfInfiniteArray {

    public static void main(String[] args) {
        int arr[] = {5, 2, 6, 9};
        int a = 1;
        int b = 5;
        ArrayList<List<Long>> queries = new ArrayList<List<Long> >();
        List<Long> qq = new ArrayList<>();
        qq.add(1L);
        qq.add(5L);
        queries.add(qq);
        List<Long> qq1 = new ArrayList<>();
        qq1.add(10L);
        qq1.add(13L);
        queries.add(qq1);
        List<Long> qq2 = new ArrayList<>();
        qq2.add(7L);
        qq2.add(11L);
        queries.add(qq2);

        System.out.print(sumInRanges(arr, 4, queries, 3));
    }


    public static List<Integer> sumInRanges(int[] arr, int n, List<List<Long>> queries, int q) {
        List<Integer> res = new ArrayList<>();
//        System.out.println(queries);
        // Write your code here!
       for(int j = 0; j < q; j++) {
           int a = Math.toIntExact(queries.get(j).get(0));
           int b = Math.toIntExact(queries.get(j).get(1));
//           System.out.print("a:" + a + ", b:" + b);
           int i = a - 1;
           long sum = 0;
           long modu = 1000000007;
           while (i < b) {
//               System.out.print(i);
               if (i >= n) {
                   sum += arr[i % n];
               } else {
                   sum += arr[i];
               }
//               System.out.println("sum:" + sum);
               i++;
           }
//           System.out.println();
//           System.out.print(sum % modu);
           res.add((int) (sum % modu));
       }
       return res;

    }

}
