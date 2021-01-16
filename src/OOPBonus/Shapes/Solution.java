package OOPBonus.Shapes;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int x=s.nextInt();
        if(x==1)
        {
            int r=s.nextInt();
            sphere sp=new sphere(r);
            sp.print();

        }
        else if(x==2)
        {
            int r=s.nextInt();
            int h=s.nextInt();
            cylinder c=new cylinder(r,h);
            c.print();
        }
        else
        {
            int r=s.nextInt();
            cube c=new cube(r);
            c.print();
        }
    }
}
