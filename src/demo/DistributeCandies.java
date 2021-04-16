package demo;

import java.util.HashSet;
import java.util.Set;

public class DistributeCandies {

    public static void main(String[] args) {
        int arr[] = {1,1,2,2,3,3};

        System.out.print(distributeCandies(arr));

    }

    public static int distributeCandies(int[] candyType) {
        Set<Integer> set = new HashSet<Integer>();
        for(Integer t : candyType){
            set.add(t);
        }

        int olen = candyType.length;
        int elen = set.size();

        if(elen <= olen/2){
            return elen;
        }

        return olen/2;

    }

}
