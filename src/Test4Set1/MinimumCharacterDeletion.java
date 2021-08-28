package Test4Set1;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class MinimumCharacterDeletion {

    public static void main(String[] args) {
        String str = "aaabbbcc";

        System.out.println(minCharDeletion(str));
    }

    public static int minCharDeletion(String input) {
        HashMap<Character,
                Integer> mp =
                new HashMap<>();
        int N = input.length();

        PriorityQueue<Integer> pq =
                new PriorityQueue<>((x, y) ->
                        Integer.compare(y, x));


        int cntChar = 0;


        for (int i = 0; i < N; i++)
        {

            if(mp.containsKey(input.charAt(i)))
            {
                mp.put(input.charAt(i),
                        mp.get(input.charAt(i)) + 1);
            }
            else
            {
                mp.put(input.charAt(i), 1);
            }
        }


        for (Map.Entry<Character,
                Integer> it :
                mp.entrySet())
        {

            pq.add(it.getValue());
        }

        while (!pq.isEmpty())
        {

            int frequent = pq.peek();

            pq.remove();

            if (pq.isEmpty()) {

                return cntChar;
            }


            if (frequent == pq.peek())
            {

                if (frequent > 1)
                {

                    pq.add(frequent - 1);
                }

                cntChar++;
            }
        }

        return cntChar;
        // Write your code here
//        Map<Character, Integer> map = new HashMap<>();
//
//        for(int i = 0; i < input.length(); i++){
//            if(map.containsKey(input.charAt(i))){
//                map.put(input.charAt(i), map.get(input.charAt(i)) + 1);
//            } else {
//                map.put(input.charAt(i),  1);
//            }
//        }
//
//        int arr[] = new int [map.size()];
//
//        int k = 0;
//        for(Integer val: map.values()){
//            arr[k] = val;
//            k++;
//        }
//        Arrays.sort(arr);
//        String str = "";
//        for(int i = 0; i < map.size()-1; i++){
//
//            if(arr[i] == arr[i+1]){
//                str+=String.valueOf(arr[i]);
//            }
//        }
//
//        int max = arr[arr.length-1];
////        System.out.println("max: " + max);
//        int j = 0;
//        String sum = "";
//        int a = 1;
//        while(j < str.length()){
//            int number = Integer.parseInt(String.valueOf(str.charAt(j)));
//            while(a < max){
//                if(number != a){
//                    sum += a;
//                    break;
//                }else{
//                    a++;
//                }
//
//            }
//            a++;
//            j++;
//
//        }
//
//        int diff = 0;
//
//        if(str.length()>0){
//            diff = Integer.parseInt(String.valueOf(str.charAt(0))) - Integer.parseInt(String.valueOf(sum.charAt(0)));
//        }
//
//
////        System.out.println(sum);
////
////
////
////
////
////        System.out.println(map);
////        System.out.println(str);
//
//        return diff;


    }
}
