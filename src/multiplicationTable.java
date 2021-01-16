import java.util.Scanner;

public class multiplicationTable {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int i = 1;
        while( i < 11){
            System.out.println(a*i +"\n");
            i = i + 1;
        }
    }
}
