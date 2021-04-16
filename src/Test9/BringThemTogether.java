package Test9;

import java.util.Scanner;

public class BringThemTogether {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int arr[] = new int[a];
        for(int i = 0; i < a; i++){
            arr[i] = s.nextInt();
        }
        int ele = s.nextInt();
        System.out.print(helper(a, arr, ele));

    }

    public static int helper(int a, int []arr, int ele){
//        int count = 0;
//
//        for(int i = 0; i < a; i++){
//            if(arr[i] <= ele){
//                count++;
//            }
//        }
//        int res[] = new int[count];
//        for(int i = 0; i < count; i++){
//            res[i] = arr[i];
//        }
//        int result = 0;
//        for(int i = 0; i < count; i++){
//            if(res[i] > ele){
//                result++;
//            }
//        }
//        return result;
        int count = 0;
        for(int i = 0; i < a; i++){
            if(arr[i] <= ele){
                count++;
            }
        }
        int greater = 0;
        for(int i = 0; i < count; i++){
            if(arr[i] > ele){
                greater++;
            }
        }

        int res = greater;
        for(int i = 0, j = count; j < a; ++i, ++j){
            if(arr[i] > ele){
                --greater;
            }
            if(arr[j] > ele){
                ++greater;
            }
            res = Math.min(res, greater);
        }
        return res;
    }
}
