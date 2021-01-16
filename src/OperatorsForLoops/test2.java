package OperatorsForLoops;

public class test2 {

    public static void main(String[] args) {

//
//        2^0 * 0 + 2*1 * 1 + 2 ^ 2 * 0 + 2^3 *1
//      = 0 + 2 + 0 + 8
//      = 10
//
//        BIT AND &
//        1010
//        0010
//       =0010
//
//        BIT OR |
//        1010 --- 10(Ten)
//        0010 ---  2(Two)
//       =1010
//
//        XOR ~
//        1 ^ 1 - 0
//        1 ^ 0 - 1
//        0 ^ 0 - 0
//        0 ^ 1 - 1
//        1010
//        0010
//       =1000 --- 8(Eight)

        // NOT ~ --(Complement)
        // a = 10 --- 1010
        // ~a = 0101 = 2**3 * 0 + 2**2 * 1 + 2**1 * 0 + 2**0 * 1
        //           = 0 + 4 + 0 + 1



//        int a = 11;
//        int b = 4;
//
//        System.out.println(a & b);
//        System.out.println(a | b);
//        System.out.println(a ^ b);
//        System.out.println(~b);




//        int a=10,b=20;
//        int c=a&b;
//        System.out.print(c);
//        int d=a|b;
//        System.out.print(d);
//        int e=a^b;
//        System.out.print(e);
//        int f=c+d+e;
//        System.out.print(~f);

        int a=10,b=-20;
        System.out.print(a^b);

    }
}
