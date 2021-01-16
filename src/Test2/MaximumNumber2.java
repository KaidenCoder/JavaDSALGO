package Test2;

import java.util.ArrayList;
import java.util.Collections;

public class MaximumNumber2 {
    public static void main(String[] args) {
        int num = 5438;
        String s=String.valueOf(num);
        int first = Integer.parseInt(s.substring(0,1));
        int second = Integer.parseInt(s.substring(1,2));
        int third = Integer.parseInt(s.substring(2,3));
        int fourth = Integer.parseInt(s.substring(3,4));
                if(second > first) {


            System.out.print(Integer.parseInt(s.substring(1)));
     } else if(second < third){
            int ss = Integer.parseInt(s.substring(0,1)+ s.substring(2,4));
            System.out.print(ss);
        }
        else if(third > fourth){

        int ss = Integer.parseInt(s.substring(0,3));
            System.out.print(ss);
        } else {
            int ss = Integer.parseInt(s.substring(0,2)+ s.substring(3,4));
            System.out.print(ss);

        }

    }


}
