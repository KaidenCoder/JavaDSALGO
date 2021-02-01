package Hashmaps;

public class PairSum {

    public static int PairSum(int[] input, int size) {
      int total = 0;

      for(int i =0;  i < size; i++){
          for(int j = i + 1; j < size; j++){
              if(input[i] + input[j] == 0){
                  total = total + 1;
              }
          }
      }
        return total;
    }

    public static void main(String[] args) {
        int arr[] = {2,1,-2,2,3};
        int res = PairSum(arr, arr.length);
        System.out.println(res);
    }

}
