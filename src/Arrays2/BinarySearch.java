package Arrays2;

public class BinarySearch {
    public static void main(String[] args) {
        int arr [] = {1,3,7,9,11,12,45};
        int target = 9;

        System.out.print(binarySearch(arr, target));


    }

    public static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length;



        while(start < end){
            int mid = (start + end)/2;
            if(arr[mid] == target){
                return mid;
            } else if(arr[mid] < target){

                start = mid + 1;

            } else{
                end = mid- 1;
            }
            // start = start + 1;
            // end = end -1;
        }
        return -1;
    }
}
