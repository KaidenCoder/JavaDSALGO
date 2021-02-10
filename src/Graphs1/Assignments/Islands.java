package Graphs1.Assignments;

public class Islands {

    public static int numConnected(int[][] edges, int n) {
        int row = edges[0].length;
        int col = edges.length;
        boolean visited[][] = new boolean[row][col];
        int count = 0;
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                if(edges[i][j] == 1 && !visited[i][j]){
                    DFS(edges, i, j, visited);
                    ++count;
                }
            }
        }
        return count;
    }

    private static void DFS(int[][] edges, int i, int j, boolean[][] visited) {
        int rowNbr[] = new int[] { -1, -1, -1, 0, 0, 1, 1, 1 };
        int colNbr[] = new int[] { -1, 0, 1, -1, 1, -1, 0, 1 };

        visited[i][j] = true;

        for(int k = 0; k < 8; k++){
            if(isSafe(edges, i + rowNbr[k], j + colNbr[k], visited)){
                DFS(edges, i + rowNbr[k], j + colNbr[k], visited);
            }
        }

    }

    private static boolean isSafe(int[][] edges, int i, int j, boolean[][] visited) {
        return (i >= 0) && (i < edges[0].length) && (j >= 0) && (j < edges[0].length) && (edges[i][j] == 1 && !visited[i][j]);
    }

}
