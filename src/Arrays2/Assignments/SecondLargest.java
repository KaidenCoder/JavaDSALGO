package Arrays2.Assignments;

public class SecondLargest {
    public static void main(String[] args) {
        int arr[] = {3,3,3,3};
        int a = secondLargestElement(arr);
        System.out.print(a);
    }

    public static int secondLargestElement(int[] arr) {
        //Your code goes here
        int first, second;
        if(arr.length < 2){
            return Integer.MIN_VALUE;
        }
        first = second = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){

            if(arr[i] > first){
                second = first;
                first = arr[i];
            }
            else if(arr[i]> second && arr[i] != first) {
                second = arr[i];
            }


        }

        return second ;
    }
}
