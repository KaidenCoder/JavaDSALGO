package Dp2;

public class WaysToMakeCoinChange {

    public static int countWaysToMakeChange(int denominations[], int value){
        int m = denominations.length;
        int table[] = new int[value+1];
        table[0] = 1;

        for(int i = 0; i < m; i++){
            for(int j = denominations[i]; j <= value; j++){
                table[j] += table[j - denominations[i]];
            }
        }
        return table[value];
    }

    public static void main(String[] args) {

        int d[] = {1,2,3,4,5,6};
        int value = 250;

        System.out.println(countWaysToMakeChange(d, value));

    }

}
