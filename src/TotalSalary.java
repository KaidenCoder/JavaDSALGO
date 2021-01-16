import java.util.Scanner;

public class TotalSalary {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int basic, hra, da, allow, pf, total;
        basic = s.nextInt();
        char str = s.next().charAt(0);
        hra = (20* basic)/100;
        da = (50 * basic)/100;
        pf = (11 * basic)/100;
        if(str == 'A'){
            allow = 1700;
            total = basic + hra + da + allow - pf;
        }else if(str == 'B'){
            allow = 1500;
            total = basic + hra + da + allow - pf;
        } else{
            allow = 1300;
            total = basic + hra + da + allow - pf;
        }
        System.out.println(total);
    }
}
