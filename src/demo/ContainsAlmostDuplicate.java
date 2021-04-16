package demo;

import java.util.ArrayList;

public class ContainsAlmostDuplicate {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(2);

        int k = 1; // index
        int l = 0; // element diff
        System.out.print(containsAlmostDuplicates(arr, k, l));

    }

    public static boolean containsAlmostDuplicates(ArrayList<Integer> arr, int k, int l)
    {
        for(int i = 0; i < arr.size() - 1; i++){
            for(int j = i + 1; j < arr.size(); j++){
                int num = Math.abs(arr.get(i) - arr.get(j));
                int idx = Math.abs(j - i);
                if(num <= l && idx <= k){
                    return true;
                }
            }
        }
        return false;
    }
}
