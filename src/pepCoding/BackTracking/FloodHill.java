package src.pepCoding.BackTracking;

import java.util.Scanner;

public class FloodHill {

    public static void main(String[] args) throws Exception {
// write your code here
        Scanner scn = new Scanner(System.in);
        System.out.println("number of rows : ");
        int n = scn.nextInt();
        System.out.println("number of cols : ");
        int m = scn.nextInt();
        int[][] arr = new int[n][m];

        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[0].length; j++){
                System.out.println("Maze " + i + " row and " + j + " column element");
                arr[i][j] = scn.nextInt();
            }
        }

        boolean[][] visited = new boolean[n][m];
        floodHill(arr, 0, 0, "", visited);

    }

    private static void floodHill(int[][] maze, int row, int col, String psf, boolean[][] visited) {
        if(row < 0 || col < 0 || row == maze.length || col == maze[0].length ||
                maze[row][col] == -1 || visited[row][col]){
                return;
        }
        if(row == maze.length-1 && col == maze[0].length-1){
            System.out.println(psf);
            return;
        }

        visited[row][col] = true;
        floodHill(maze,row-1,col,psf+"t",visited);
        floodHill(maze,row,col-1,psf+"l",visited);
        floodHill(maze,row+1,col,psf+"d",visited);
        floodHill(maze,row,col+1,psf+"r",visited);
        visited[row][col] = false;

    }

}
