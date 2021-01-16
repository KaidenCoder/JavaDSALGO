package BonusProblemArrays;

import java.util.Arrays;
import java.util.Scanner;

public class SuccessorProblem {

    public static void main(String[] args) {
            // Write your code here
            Scanner s =new Scanner(System.in);
            int n = s.nextInt();
            int[] arr=numberToA(n);
            findSucessor(arr);
            int ans = AtoI(arr);
            System.out.println(ans);

        }
        public static int length(int n){
            int i=0;
            while(n>0){
                i++;
                n=n/10;
            }
            return i;
        }

        public static int AtoI(int[] a){
            int n=0;
            for(int i=0;i<a.length;i++){
                n=n*10+a[i];
            }
            return n;
        }

        public static int[] numberToA(int n){
            int l=length(n);
            int[] a= new int[l];
            for(int i=l-1;i>=0;i--){
                a[i]=n%10;
                n=n/10;
            }
            return a;
        }
        public static void findSucessor(int [] arr) {
            int n=arr.length;
            if(n==1){
                return;
            }
            int i=n-2;
            while(i>=0) {
                if (arr[i]<arr[i+1]) {
                    break;
                }
                i--;
            }

            if(i!=-1){
                int k=i+1;
                for(int j=i+1;j<n;j++){
                    if(arr[j]>arr[i] && arr[j]<arr[k]){
                        k=j;
                    }
                }

                int t = arr[i];
                arr[i]=arr[k];
                arr[k]=t;
            }

            Arrays.sort(arr,i+1,n);

    }
}

