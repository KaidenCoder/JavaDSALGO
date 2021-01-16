package TimeComplexity;

public class test {
    public static void main(String[] args) {
        int n = 10;
        int sum=0;
        for(int i=1;i<n*n;i++)
            sum+=i;
        System.out.println(sum);
    }
}
