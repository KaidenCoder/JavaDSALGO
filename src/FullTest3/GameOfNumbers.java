package FullTest3;

import java.util.Scanner;

public class GameOfNumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int target = s.nextInt();
        int count  = 0;
//        if(num > target){
//            count = num - target;
//        } else if(num < target){
//             count  = helper(num, target);
//        }
        if(num > target){
            count = num - target;

        } else if(num < target){
            System.out.println("num < target");
            while(num < target){

                if(target %2 == 1){
                    target += 1;
                    //num -= 1;
                }else{
                   target /= 2;
                   // num *= 2;
                }


                //System.out.print(target+ " ");
//                System.out.print(num+ " ");
                count++;
            }
//            System.out.println("num > target");
//            if(num > target){
//                while(num != target){
//                    System.out.print(num + " ");
//                    num--;
//                    count++;
//                }
//
//            }
        }
        System.out.print(count);
    }


    public static int helper(int num, int target){
        int count = 0;

        if(num %2 == 1){
           count += 1 + helper(num - 1, target);
        }else{
            count += 1 + helper(num*2, target);
        }

        if(num == target){
            return count;
        }
        return count;
    }
}
