package Arrays2d;

public class test2 {
    public static void  fun(int[][] arr2d)
    {

        for(int i=0;i<arr2d.length;i++)
        {
            for(int j=0;j<arr2d[i].length;j++)
            {
                arr2d[i][j]=2*i+j;
            }
        }
    }
    public static void main(String[] args)
    {
        int arr[][]=new int [4][];
        System.out.print(arr[2].length);
    }
}
