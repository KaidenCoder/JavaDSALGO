package Arrays2.Assignments;

public class CheckArrayRotation {

    public static void main(String[] args) {
        int arr [] = {0};
        int a = arrayRotateCheck(arr);
        System.out.print(a);
    }

    public static int arrayRotateCheck(int[] arr){
        int min = arr[0];
        int index = 0;
        for(int i = 0;  i < arr.length; i++){
            if(min > arr[i]){
                min = arr[i];
                index = i;
            }
        }
        return index;
    }
}
