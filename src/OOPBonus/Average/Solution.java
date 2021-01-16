package OOPBonus.Average;

import java.util.*;
import java.io.*;
public class Solution {
    public static void main (String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while(t-->0)
        {
            String name=s.next();
            int num=s.nextInt();
            int runs=s.nextInt();
            int inn=s.nextInt();
            int nos=s.nextInt();
            Player p=new Player();
            p.set(name,num,runs,inn,nos);
            p.print();
        }
    }
}
