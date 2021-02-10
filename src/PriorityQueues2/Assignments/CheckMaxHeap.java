package PriorityQueues2.Assignments;

public class CheckMaxHeap {

    public static boolean checkMaxHeap(int arr[]) {
        int index = 0;
        return helper(arr, index);
    }

    private static boolean helper(int[] arr, int i) {
        if(2*i+2 > arr.length){
            return true;
        }

        boolean left = (arr[i] >= arr[2*i+1]) && helper(arr, 2*i+1);
        boolean right = (2*i+2==arr.length)||(arr[i] >= arr[2*i+2]) && helper(arr, 2*i+2);

        return left && right;
    }

    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5, 6};
        int[] A2 = {6, 5, 4, 3, 2, 1};

        // start with index 0 (the root of the heap)
        int index = 0;

        System.out.println(checkMaxHeap(A));
    }


}
