package Test7;

import java.util.ArrayList;
import java.util.Scanner;

public class BestSection {
    public static void main(String[] args) {
        /* Your class should be named Main.
         * Read input as specified in the question.
         * Print output as specified in the question.
         */

        // Write your code here
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int arr[] = new int[a];

        for(int i = 0;  i < a; i++){
            arr[i] = s.nextInt();
        }

        ArrayList<Integer> res = new ArrayList<>();

        int nocontact = 0;
        for(int i = arr.length - 1; i  > 0; i--){
            if(arr[i] > arr[i-1]){
                nocontact += 1;
                continue;
            }

            res.add(arr[i]);

        }

        if(nocontact == 0){
       //     return 0;
        }

        //arr2[k] = arr[0];
        res.add(arr[0]);
        // 1 2 3 4 5
        int notfound = res.size();
        int l = 0;
        int i = 0;
       while(notfound == 0){
            if(res.get(i) > res.get(i+1)){
//                res.add(arr[i]);
                i++;
                continue;
            }

            res.set(i,res.get(i));
            notfound -= 1;
            i++;

        }

    }
}
