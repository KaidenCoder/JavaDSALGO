package Dp2.Assignments;

public class Loothouse {

    public static int maxMoneyLooted(int[] houses) {
        if(houses.length == 0){
            return 0;
        }
        if(houses.length == 1){
            return houses[0];
        }

        if(houses.length == 2){
            return Math.max(houses[0], houses[1]);
        }

        for(int i = 2; i < houses.length; i++){
            houses[i] = Math.max(houses[i-2]+houses[i],((i < 3  ? 0 : houses[i-3]) + houses[i]));
        }

        return Math.max(houses[houses.length-1], houses[houses.length-2]);

    }


    public static void main(String[] args) {
        int[] arr = {2,5,3,4,2};
        System.out.println(maxMoneyLooted(arr));
    }

}
