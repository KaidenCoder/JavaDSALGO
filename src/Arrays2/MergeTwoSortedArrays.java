package Arrays2;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        int arr1 [] = {1,3,4,7,11};
        int arr2[] = {2,4,6,13};

       int [] a = merge(arr1,arr2);
       for(int i = 0; i < a.length; i++){
           System.out.print(a[i] + " ");
       }
    }

    public static int[] merge(int arr1[], int arr2[]) {
        //Your code goes here
        int m = arr1.length;
        int n = arr2.length;
        int i = 0;
        int j = 0;
        int k = 0;

        int newarr[] = new int[m+n];

        while(i < m && j < n &&  k < (m+n)){

            if(arr1[i] < arr2[j]){
                newarr[k] = arr1[i];
                i = i +1;
            }
            else{
                newarr[k] = arr2[j];
                j = j + 1;
            }

               k=k+1;
        }

        while(i < m){
            newarr[k] = arr1[i];
            i = i +1;
            k = k + 1;
        }
        while(j < n){
            newarr[k] = arr2[j];
            j = j +1;
            k = k + 1;
        }

        return newarr;
    }

}
