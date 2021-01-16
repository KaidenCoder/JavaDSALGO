import java.util.Scanner;

public class AddTwoNumbers {
    public static void main(String args[]){

//        int a, b;
//        Scanner s = new Scanner(System.in);
//        String str = s.nextLine();
//        a = s.nextInt();
//        b = s.nextInt();
//       int c = a + b;
//       System.out.println(c);
//        System.out.println(str);
       Scanner s = new Scanner(System.in);
       int start,end,steps;
       start = s.nextInt();
       end = s.nextInt();
       steps = s.nextInt();

       while(start <= end){
           System.out.println(start+"\t"+(((start - 32) *5)/9));
           start = start + steps;
       }
//       char str = s.next().charAt(0);
//       if (Character.isUpperCase(str)){
//            System.out.println(1);
//       } else if(Character.isLowerCase(str)){
//           System.out.println(0);
//       } else{
//           System.out.println(-1);
//       }


    }
}
