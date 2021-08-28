package BinarySearch.IO;

public class ListMinReplacement {
    public static void main(String[] args) {
        int []arr = {10, 5, 7, 9};

        int []res = solve(arr);

        for(int i = 0; i < res.length; i++){
            System.out.print(res[i] + " ");
        }
    }

    public static int[] solve(int[] nums) {
        int arr[] = new int[nums.length];
        if(nums.length > 1){
            arr[1] = nums[0];
        }

        for(int i = 2; i < nums.length; i++){
            arr[i] = Math.min(Math.min(arr[i-1], nums[i]), nums[i-1]);
        }

        return arr;

    }
}
