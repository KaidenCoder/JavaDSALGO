package Test10;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class RottenOranges {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int r = s.nextInt();
        int c = s.nextInt();
        int arr[][] = new int[r][c];
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                arr[i][j] = s.nextInt();
            }
        }

        System.out.print(orangesRotTime(arr));
    }
    static Queue<int[]> queue = new LinkedList<>();
    static int[][] directions = {{-1,0},{0,1},{1,0},{0,-1}};
    private static int orangesRotTime(int[][] arr) {
        int height = arr.length, width = arr[0].length;
        int mins = 0;
        int fresh = 0;

        for(int r = 0; r < height; r++){
            for(int c = 0; c < width; c++){
                if(arr[r][c] == 2){
                    addFreshNeigh(r,c, height, width, arr);
                }
                if(arr[r][c] == 1){
                    fresh++;
                }
            }
        }

        while(queue.size() > 0){
            int len = queue.size(), rot = 0;
            for (int i = 0; i < len; i++){
                int [] position = queue.remove();
                int row = position[0];
                int col = position[1];
                if(arr[row][col] == 1){
                    arr[row][col] = 2;
                    rot++;
                    addFreshNeigh(row, col, height, width, arr);
                }

            }
            if(rot > 0){
                mins++;
                fresh -= rot;
            }
        }

        return (fresh == 0) ? mins : -1;

    }

    private static void addFreshNeigh(int row, int col, int height, int width, int[][] arr){
        for(int[] dir : directions){
            int x = row+dir[0], y = col+dir[1];
            if(x < 0 || x >= height || y < 0 || y >= width){
                continue;
            }
            if(arr[x][y] == 1){
                queue.add(new int[]{x,y});
            }
        }
    }

}
