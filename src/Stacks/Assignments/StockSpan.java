package Stacks.Assignments;

public class StockSpan {
    public static void main(String[] args) {

    }

    public static int[] stockSpan(int[] price) {
        //Your code goes here
        int n = price.length;
        int res[] = new int[n];
        res[0] = 1;
        for(int i = 1; i < n; i++){
            res[i] = 1;
            for (int j = i - 1; (j >= 0) && (price[i] >= price[j]); j--){
                res[i]++;
            }
        }
        return res;
    }
}
