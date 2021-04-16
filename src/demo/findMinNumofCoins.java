package demo;

import java.util.ArrayList;

public class findMinNumofCoins {
    public static void main(String[] args) {
        System.out.print(findMinimumCoins(13));
    }
        //public static ArrayList<Integer> denominations;
    public static int findMinimumCoins(int amount) {
        // Write your code here.
        int den[] = {1,2,5,10,20,50,100,500,1000};
        ArrayList<Integer> denominations = new ArrayList<>();

        denominations.add(1);
        denominations.add(2);
        denominations.add(5);
        denominations.add(10);
        denominations.add(20);
        denominations.add(50);
        denominations.add(100);
        denominations.add(500);
        denominations.add(1000);

        int size = denominations.size() - 1;
        int count = 0;
        while(size > -1 && amount > -1){
            while(amount >= denominations.get(size)){
                count++;
                amount -= denominations.get(size);
            }
            if(amount < denominations.get(size)){
                size--;
            }
        }
        return count;
    }
}
