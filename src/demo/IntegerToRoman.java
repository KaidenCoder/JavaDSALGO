package demo;

public class IntegerToRoman {
    public static void main(String[] args) {
        int num = 1994;
        System.out.print(intToRoman(num));
    }

    public static String intToRoman(int num) {
        int[] val = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] rom = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

        String s = "";
        for(int i = 0; num > 0; i++){
            while(num >= val[i]){
                s += rom[i];
                num -= val[i];
            }
        }
        return s;
    }
}
