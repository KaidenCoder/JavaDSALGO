package FullTest1;

import java.util.*;

public class SortArrayByFrequency {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int a = s.nextInt();

        int arr[] = new int[a];

        for(int i = 0; i < a; i++){
            arr[i] = s.nextInt();
        }

        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> outputArray = new ArrayList<>();

        for(int curr: arr){
            int c = map.getOrDefault(curr, 0);
            map.put(curr, c + 1);
            outputArray.add(curr);
        }

        SortVal com = new SortVal(map);

        Collections.sort(outputArray, com);

        for(Integer i: outputArray){
            System.out.print(i + " ");
        }

    }

}

class SortVal implements Comparator<Integer>{

    private final Map<Integer, Integer> freqMap;

    SortVal(Map<Integer, Integer> freqMap) {
        this.freqMap = freqMap;
    }

    @Override
    public int compare(Integer o1, Integer o2) {
        int freqCom = freqMap.get(o2).compareTo(freqMap.get(o1));
        int valCom = o1.compareTo(o2);
        if(freqCom == 0){
            return valCom;
        }
        else {
            return freqCom;
        }

    }
}
