package Arrays2.Assignments;

public class RotateArray {
    public static void main(String[] args) {
        int arr[] = {1,3,6,11,12,17,22,26,30,33,38};
        int d = 7;
        rotate(arr, d);
    }

    public static void rotate(int[] arr, int d) {
        //Your code goes here
        int newArr[] = new int[arr.length];
        for(int i = d; i < arr.length; i++){
            newArr[i-d] = arr[i];
        }

        for(int i = arr.length - d, j= 0; j < d && i < arr.length; i++){
            newArr[i] = arr[j];
            j = j +1;
        }

        for(int i = 0 ; i < arr.length; i++){
            System.out.print(newArr[i]+" ");
        }
    }
}
