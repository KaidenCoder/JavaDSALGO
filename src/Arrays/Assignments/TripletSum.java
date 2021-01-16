package Arrays.Assignments;

public class TripletSum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int x = 12;

//        ArrayList<Integer> arr2 = new ArrayList<Integer>();
        int count = 0;

        for(int i = 0; i < arr.length-2; i++){
            for(int j = i + 1; j < arr.length-1; j++){
                for(int k = j +1; k < arr.length; k++){
                    if((arr[i] + arr[j] + arr[k]) == x){
                        count = count + 1;
                    }
                }

            }
        }
        System.out.print(count);

    }
}
