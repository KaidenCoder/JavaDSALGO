package Arrays2;

public class BubbleSort {
    public static void main(String[] args) {
        int arr [] = {1,9,3,11,12,7,45};

        bubbleSort(arr);
    }

    public static void bubbleSort(int[] arr) {

        int n = arr.length;

        for(int i = 0; i < n - 1; i++){
            for(int j = 0; j < n-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

       for(int i = 0; i < n; i++){
           System.out.print(arr[i]);
       }

    }

}
