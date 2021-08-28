package demo;

import java.util.ArrayList;
import java.util.List;

public class XORQuery {

    public static void main(String[] args) {
        int arr[] = {5, 2, 6, 9};
        int a = 1;
        int b = 5;
        ArrayList<ArrayList<Integer>> queries = new ArrayList<ArrayList<Integer> >();
        ArrayList<Integer> qq = new ArrayList<>();
        qq.add(1);
        qq.add(2);
        queries.add(qq);
        ArrayList<Integer> qq1 = new ArrayList<>();
        qq1.add(2);
        qq1.add(3);
        queries.add(qq1);
        ArrayList<Integer> qq2 = new ArrayList<>();
        qq2.add(2);
        qq2.add(1);
        queries.add(qq2);

        System.out.print(xorQuery(queries));
    }

    public static ArrayList<Integer> xorQuery(ArrayList<ArrayList<Integer>> Queries) {
        // Write your code here
        ArrayList<Integer> res = new ArrayList<>();
//        System.out.println(queries);

        System.out.println(2^3);
        System.out.println(1^1);
        for(int j = 0; j < Queries.size(); j++) {
            int a = Queries.get(j).get(0);
            int b = Queries.get(j).get(1);
//           System.out.print("a:" + a + ", b:" + b);
            if(a == 1){
                res.add(b);
            }else if(a == 2){
                int c = res.get(res.size() - 1) ^ b;
                res.remove(res.size()-1);
                res.add( c);
            }
            System.out.println("res: " + res);

        }
        return res;

    }

}
