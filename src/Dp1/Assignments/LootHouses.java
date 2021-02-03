package Dp1.Assignments;

public class LootHouses {

    public static int maxMoneyLooted(int[] houses) {

        int n = houses.length;

        if(n == 0){
            return 0;
        }
        if(n == 1){
            return houses[0];
        }
        if(n == 2){
            return Math.max(houses[0], houses[1]);
        }

        int[] dp = new int[n];

        dp[0] = houses[0];
        dp[1] = Math.max(houses[0], houses[1]);

        for(int i = 2; i < n; i++){
            dp[i] = Math.max(houses[i] + dp[i-2], dp[i-1]);
        }

        return dp[n-1];


    }

    public static void main(String[] args) {
        int[] houses = {10,2,30,20,3,50};
        System.out.println(maxMoneyLooted(houses));
    }

}
