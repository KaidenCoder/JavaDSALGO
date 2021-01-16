package Test2;

import java.util.Scanner;

public class NumberStarPattern {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();

        for(int i = num; i >0; i--){

            for(int j = 1; j <= i; j++){
                System.out.print(j);
            }

            for(int k = i; k < num; k++){
                System.out.print('*');
            }
            for(int k = i; k < num; k++){
                System.out.print('*');
            }

            int m = num -(num -i);
            for(int l = 1; l <= i; l++){
                System.out.print(m);
                m = m - 1;
            }

            System.out.println();
        }

    }
}
