import java.util.Scanner;


public class SumEvenOdd {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        String b = String.valueOf(a);
        int i = 0;
        int even = 0;
        int odd = 0;
        while(i < b.length()){
            int i1 = Integer.parseInt(String.valueOf(b.charAt(i)));
            if(i1 % 2 == 0){
                even  = even + i1;
            }
            if(i1 %2 != 0){
                odd = odd + i1;
            }
            i = i + 1;
        }
        System.out.println(even +"\t" + odd);
    }
}
