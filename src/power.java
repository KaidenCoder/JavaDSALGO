import java.util.Scanner;

public class power {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int a, b;
        a = s.nextInt();
        b = s.nextInt();
        int i = 1;
        int total = 1;
        while(i <= b){
            total = total * a;
            i = i + 1;
        }
        System.out.println(total);
    }
}
