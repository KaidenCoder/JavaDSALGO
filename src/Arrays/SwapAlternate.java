package Arrays;

public class SwapAlternate {

    public static void main(String[] args) {
        int arr[] = {9,3,6,12,4,32,33}; // 0,1 ,2 ,3,4,5
        swapAlternate(arr);
    }

    public static void swapAlternate(int arr[]){
        int len = arr.length;
        if(len % 2 == 0){
            for(int  i = 0; i < len; i=i+2){
                    int temp = arr[i];
                    arr[i]= arr[i+1];
                    arr[i+1] = temp;

            }
        }else{
            for(int  i = 0; i < len-1; i=i+2){
                int temp = arr[i];
                arr[i]= arr[i+1];
                arr[i+1] = temp;

            }
        }
        for(int i =0; i < len; i++){
            System.out.print(arr[i]);
        }
    }
}
