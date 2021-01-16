package Arrays2.Assignments;

public class Sort0123 {

    public static void main(String[] args) {
        int arr[] = {0,1,2,0,2,0,1};
        sort012(arr);
    }

    public static void sort012(int[] arr){

        int count0 = 0, count1 = 0, count2 = 0;
        int n = arr.length;

        for(int i = 0; i < n; i++){
            if(arr[i] == 0){
                count0++;
            }
            if(arr[i] == 1){
                count1++;
            }
            if(arr[i] == 1){
                count2++;
            }
        }

        for (int i = 0; i < count0; i++){
            arr[i] = 0;
        }

        for (int i = count0; i < (count0 + count1); i++){
            arr[i] = 1;
        }

        for (int i = (count0 + count1); i < n; i++){
            arr[i] = 2;
        }


//        for(int i = 0; i < n; i++){
//            while(i < count0){
//                arr[i] = 0;
//            }
//            while(i >= count0 && i < (count0+count1)){
//                arr[i] = 1;
//            }
//            while(i >= (count0+count2)){
//                arr[i] = 2;
//            }
//
//        }

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]);
        }
    }

}
