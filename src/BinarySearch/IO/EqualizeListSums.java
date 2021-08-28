package BinarySearch.IO;

public class EqualizeListSums {

    public static void main(String[] args) {
        int a[] = {1,5};
        int b[] = {6,5,5};
        System.out.println(solve(a, b));
    }

    public static int solve(int[] a, int[] b) {
        int sum1 = 0;
        int sum2 = 0;

        int arr[] = {1,2,3,4,5,6};

        for(int i = 0; i < a.length; i++){
            sum1 += a[i];
        }

        for(int i = 0; i < b.length; i++){
            sum2 += b[i];
        }

        System.out.println("sum2: " + sum2);

        int count = 0;
        if(sum2 > sum1){
            int i = 0, j = 0;
            while( sum1 != sum2 && i < a.length && j < b.length){

                if(sum1 == sum2){
                    return count;
                }


                sum1 += arr[arr.length-1 - i];
                sum1 -= arr[i];
                int x = arr[arr.length-1 - i];
                System.out.println("sum1: " + sum1);
                System.out.println("arr.length-1 - i]: " + x);


                sum2 -= arr[arr.length-1 - j];
                sum2 += arr[j];
                System.out.println("sum2: " + sum2);
                int y = arr[arr.length-1 - j];
                int z = arr[j];
                System.out.println("arr.length-1 - i]j]: " + y);
                System.out.println("z: " + z);

                count+=2;


                i++;
                j++;

            }


        }


    return count;



    }

}
