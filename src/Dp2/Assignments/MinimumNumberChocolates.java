package Dp2.Assignments;

public class MinimumNumberChocolates {


    public static int getMin(int arr[], int N){

        int []B = new int[N];

        for(int i = 0; i < N; i++){
            B[i] = 1;
        }

        for(int i = 1; i < N; i++){
            if(arr[i] > arr[i-1]){
                B[i] = B[i-1] + 1;
            } else{
                B[i] = 1;
            }
        }

        for(int i = N-2; i >= 0; i--){
            if(arr[i] > arr[i+1]){
                B[i] = Math.max(B[i+1] + 1, B[i]);
            } else {
                B[i] = Math.max(B[i], 1);
            }
        }

        int sum = 0;

        for(int i= 0; i < N; i++){
            sum += B[i];
        }

        return sum;

    }

    public static void main(String[] args)
    {

        // Given array
        int A[] = { 23, 14, 15, 14,
                56, 29, 14 };

        // Size of the given array
        int N = A.length;
        System.out.println(getMin(A, N));
    }


}
