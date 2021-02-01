package Backtracking;

import java.util.Scanner;

public class RatinAMaze {

    public static boolean ratInAMaze(int maze[][]){
        int m = maze.length;
        int n = maze[0].length;
        int[] s = {0,0};
        int[] d = {m-1,n-1};
        boolean[][] visited = new boolean[m][n];
        int[][] dirs = {{1,0}, {0,1}, {-1,0}, {0,-1}};
        return visit(maze, s, d, visited, m, n, dirs);

    }

    public static boolean ratInAMaze2(int maze[][]){
        int n = maze.length;
        int path[][] = new int[n][n];
        return solveMaze(maze, 0, 0, path);

    }

    public static boolean solveMaze(int maze[][], int i, int j, int path[][]){
        int n = maze.length;

        // check if not valid
        if(i < 0 || i >= n || j < 0 || j >= n || maze[i][j] == 0 || path[i][j] == 1){
            return false;
        }

        // include the cell in the path
        path[i][j] = 1;

        // destination
        if(i == n-1 && j == n-1){
            for(int r = 0; r < n; r++){
                for(int c = 0; c < n; c++){
                    System.out.print(path[r][c]+" ");
                }
                System.out.println();
            }
            return true;
        }

        // top
        if(solveMaze(maze, i-1, j, path)){
            return true;
        }

        // right
        if(solveMaze(maze, i, j + 1, path)){
            return true;
        }

        // down
        if(solveMaze(maze, i+1, j, path)){
            return true;
        }

        // left
        if(solveMaze(maze, i, j-1, path)){
            return true;
        }

        return false;

    }

    private static boolean visit(int[][] maze, int[] s, int[] d, boolean[][] visited, int m, int n, int[][] dirs){
        if(s[0]==d[0] && s[1]==d[1]){
            return true;
        }
        visited[s[0]][s[1]]=true;
        for(int[] dir: dirs){
            int x = s[0], y = s[1];
            while(x+dir[0]<m && y+dir[1]<n && x+dir[0]>=0 && y+dir[1]>=0 && maze[x+dir[0]][y+dir[1]]==0){
                x += dir[0];
                y += dir[1];
            }
            if(!visited[x][y] && visit(maze, new int[]{x,y}, d, visited, m, n, dirs)) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int maze[][] = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                maze[i][j] = s.nextInt();
            }
        }
        System.out.println(ratInAMaze(maze));
    }

}
