package Arrays2;

public class SelectionSort {
    public static void main(String[] args) {
        int arr [] = {1,9,3,11,12,7,45};

        selectionSort(arr);
    }

    public static void selectionSort(int[] arr) {

        int n = arr.length;

        for(int i = 0; i < n - 1; i++){
            int min_idx = i;
            for(int j = i + 1; j < n; j++){
                if(arr[j] < arr[min_idx]){
                    min_idx = j;
                }
            }

            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }

       for(int i = 0; i < n; i++){
           System.out.print(arr[i]);
       }

    }

}
