package PriorityQueues2;

public class InplaceHeapSort {

    public static void inplaceHeapSort(int arr[]) {

        // Build the heap
        int n = arr.length;
        for(int i=(n/2)-1; i>=0; i--){
            downHeapify(arr,i,n);
        }

        // Remove elements from starting one by one, and put them at respective last position
        for(int i = n-1; i >= 0; i--){
            int temp = arr[i];
            arr[i] = arr[0];
            arr[0] = temp;
            downHeapify(arr, 0, i);
        }

    }

    private static void downHeapify(int[] arr, int i, int n) {
        int parentIndex = i;
        int leftChildIndex = 2*parentIndex+1;
        int rightChildIndex = 2*parentIndex+2;

        while (leftChildIndex < n){
            int minChildIndex = parentIndex;
            if(arr[leftChildIndex] < arr[minChildIndex]){
                minChildIndex = leftChildIndex;
            }
            if(rightChildIndex < n && arr[rightChildIndex] < arr[minChildIndex]){
                minChildIndex = rightChildIndex;
            }

            if(minChildIndex == parentIndex){
                return;
            }

            int temp = arr[parentIndex];
            arr[parentIndex] = arr[minChildIndex];
            arr[minChildIndex] = temp;
            parentIndex = minChildIndex;
            leftChildIndex = 2*parentIndex+1;
            rightChildIndex = 2*parentIndex+2;
        }

    }

    public static void main(String[] args) {
        int[] arr = {4,7,3,2,8,9,6,1};
        inplaceHeapSort(arr);
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }

}
