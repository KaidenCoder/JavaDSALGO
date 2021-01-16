package Test5;

public class mat{
    int [][] matrix; // 2d array

    mat(int [][] mat)
    {
        matrix=mat;
    }


    public static mat add(mat a,mat b)
    {
        if(a.matrix == null && b.matrix == null){
            return null;
        }
        if(a.matrix == null ){
            return b;
        }
        if(b.matrix == null ){
            return a;
        }

        int row = a.matrix.length;
        int col = a.matrix[0].length;
        int [][] res = new int[row][col];


        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                res[i][j] = a.matrix[i][j] + b.matrix[i][j];
            }
        }
        mat ress = new mat(res);
        return ress;
    }
    public static mat multiply(mat a,mat b)
    {
        if(a.matrix == null || b.matrix == null){
            return null;
        }


        int row1 = a.matrix.length;
        int col1 = a.matrix[0].length;
        int row2 = b.matrix.length;
        int col2 = b.matrix[0].length;
        if(row2 != col1){
            return null;
        }
        int [][] res = new int[row1][col2];


        for(int i = 0; i < row1; i++){
            for(int j = 0; j < col1; j++){
                for(int k = 0;  k < row2; k++){
                    res[i][j] += a.matrix[i][k] * b.matrix[k][j];
                }
            }
        }
        mat ress = new mat(res);
        return ress;
    }
    public static mat transpose(mat m)
    {
        if(m.matrix == null ){
            return null;
        }

        int row = m.matrix.length;
        int col = m.matrix[0].length;
        int [][]res = new int[row][col];
       for(int i = 0; i < row; i++){
           for(int j = 0; j < col; j++){
               res[i][j] = m.matrix[j][i];
           }
       }
       mat ress = new mat(res);
       return ress;
    }
    public static mat rotate(mat m)
    {
        if(m.matrix == null ){
            return null;
        }
        int row = m.matrix.length;
        int col = m.matrix[0].length;
        int [][]res = new int[row][col];
        for(int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                int temp = m.matrix[i][j];
                res[i][j] = m.matrix[j][row - 1 - i];
                res[j][row - 1 - i] = m.matrix[row - 1 - i][row - 1- j];
                res[row - 1 - i][row - 1 - j] = m.matrix[row - 1 - j][i];
                res[row - 1 - j][i] = temp;
            }
        }
        mat ress = new mat(res);
        return ress;
    }
    public  void print()
    {
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
