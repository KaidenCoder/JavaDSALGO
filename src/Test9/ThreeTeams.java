package Test9;

import java.util.ArrayList;
import java.util.Scanner;

public class ThreeTeams {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        ArrayList<Integer> arr = new ArrayList<>(a);
        for(int i = 0; i < a; i++){
            arr.add(s.nextInt());
        }
        int ele = s.nextInt();
        ArrayList<Integer> res = helper(arr, ele);
        for(int i = 0; i < res.size(); i++){
            System.out.print(res.get(i) + " ");
        }
      //  System.out.print(helper(arr, ele));
    }

   public static ArrayList<Integer> helper(ArrayList<Integer> arr, int ele) {

       int sum = 0;
       int sum2 = 0;
       int max = 0;
       int result = 0;

        for(int i = ele; i < arr.size(); i++){
            for(int j = i; j < i+ ele; j++){
                sum += arr.get(j - ele);
            }
            for(int j = i; j < i+ ele; j++){
                sum2 += arr.get(j - ele + 1);
            }
//            sum = arr.get(i-2) + arr.get(i-1);
//            sum2 = arr.get(i-1) + arr.get(i);
            max = Math.max(max, Math.max(sum, sum2));
            sum = 0;
            sum2 = 0;
        }

        result += max;



       for(int a = 0; a < arr.size() ; a++){
           int sum3 = 0;
           for(int j = a; j < a+ ele; j++){
               sum3 = arr.get(j);
           }
           if(sum3 == max){
               int remove = 0;
               while(remove < ele){
                   arr.remove(a);
                   ++remove;
               }

           }
           break;
       }

       //arr.remove(3);


//       max = 0;
//       for(int i = ele; i < arr.size(); i++){
//           for(int j = i; j < i+ ele; j++){
//               sum += arr.get(j - ele);
//           }
//           for(int j = i; j < i+ ele; j++){
//               sum2 += arr.get(j - ele + 1);
//           }
//           max = Math.max(max, Math.max(sum, sum2));
//           sum = 0;
//           sum2 = 0;
//       }
//
//       result += max;





//       for(int a = 0; a < arr.size() ; a++){
//           int sum3 = 0;
//           for(int j = a; j < a+ ele; j++){
//               sum3 = arr.get(j);
//           }
//           if(sum3 == max){
//               int remove = 0;
//               while(remove < ele){
//                   arr.remove(a);
//                   remove++;
//               }
//               break;
//           }
//       }

//       max = 0;
//       for(int i = ele; i < arr.size(); i++){
//           for(int j = i; j < i+ ele; j++){
//               sum += arr.get(j - ele);
//           }
//           for(int j = i; j < i+ ele; j++){
//               sum2 += arr.get(j - ele + 1);
//           }
//           max = Math.max(max, Math.max(sum, sum2));
//           sum = 0;
//           sum2 = 0;
//       }
//
//       result += max;


        return arr;

   }

   public static ArrayList<Integer> remove( ArrayList<Integer> arr, int target){
        int index = 0;

        for(int i = 0; i < arr.size() - 1; i++){
            int sum = arr.get(i) + arr.get(i + 1);
            if(sum == target){
                index = i;
                break;
            }
        }
        arr.remove(index);
       arr.remove(index);
       return arr;
   }

}
