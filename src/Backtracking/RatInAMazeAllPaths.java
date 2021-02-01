package Backtracking;

import java.util.Scanner;

public class RatInAMazeAllPaths {

    public static void ratInAMaze(int maze[][]){

        int n = maze.length;
        int path[][] = new int[n][n];
        solveMaze(maze, 0, 0, path);

    }



    public static void solveMaze(int maze[][], int i, int j, int path[][]){
        int n = maze.length;

        // check if not valid
        if(i < 0 || i >= n || j < 0 || j >= n || maze[i][j] == 0 || path[i][j] == 1){
            return;
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
            System.out.println();
            path[i][j] = 0;
            return ;
        }
        // top
        solveMaze(maze, i-1, j, path);

        // right
        solveMaze(maze, i, j + 1, path);

        // down
        solveMaze(maze, i+1, j, path);


        // left
        solveMaze(maze, i, j-1, path);

        path[i][j] = 0;
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
        ratInAMaze(maze);
    }

}
