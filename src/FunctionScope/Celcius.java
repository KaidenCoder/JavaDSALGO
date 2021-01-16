package FunctionScope;

import java.util.Scanner;

public class Celcius {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int start = s.nextInt();
        int end = s.nextInt();
        int step = s.nextInt();

        for(int i = start; i <=end; i = i + step){
            System.out.println(i + "\t" + ((i-32)*5/9));
        }

    }
}
