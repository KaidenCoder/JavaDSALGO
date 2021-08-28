package demo;

public class ProductArrayExceptItself {
    public static void main(String[] args) {
        int arr[] = {5,2,2};
        int arr2[] = getProductArrayExceptSelf(arr);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr2[i] + " ");
        }
    }


    public static int[] getProductArrayExceptSelf(int[] arr) {
        //Your code goes here
        int prod = 1;
        for(int i = 0; i < arr.length; i++){
            prod *= arr[i]%1000000007;
        }

        for(int i = 0; i < arr.length; i++){
            arr[i] = (int)prod/arr[i];
        }

        return arr;
    }
}
