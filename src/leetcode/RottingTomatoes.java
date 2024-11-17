package src.leetcode;

import java.util.LinkedList;
import java.util.Queue;

class RottingTomatoes {
    public static void main(String[] args) {
        int[][] grid = {
                {0, 1, 2, 0},
                {1, 0, 0, 1},
                {2, 0, 1, 0},
                {0, 1, 0, 2}
        };
        int[][] grid2 = {{0}};
        System.out.println(orangesRotting(grid2));
    }

    public static int orangesRotting(int[][] grid) {
        if (grid.length == 0 || grid[0].length == 0) {
            return 0;
        }
        int rows = grid.length;
        int cols = grid[0].length;
        int totalEmpty = 0;
        int totalFresh = 0;
        int totalRotten = 0;

        Queue<int[]> queue = new LinkedList<>();
        // Count fresh and rotten oranges, add rotten oranges to the queue
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 0) {
                    totalEmpty++;
                }
                if (grid[i][j] == 1) {
                    totalFresh++;
                } else if (grid[i][j] == 2) {
                    totalRotten++;
                    queue.offer(new int[] { i, j });
                }
            }
        }
        if (grid.length * grid[0].length == totalEmpty) {
            return 0;
        }

        // If there are no rotten oranges, return -1
        if (totalRotten == 0) {
            return -1;
        }

        // Perform BFS to rot the oranges
        int minutes = 0;
        int[][] directions = { { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 } };

        while (!queue.isEmpty()) {
            int size = queue.size();
            int freshOrangesRottenInThisLevel = 0;

            for (int i = 0; i < size; i++) {
                int[] current = queue.poll();
                int x = current[0];
                int y = current[1];

                for (int[] dir : directions) {
                    int newX = x + dir[0];
                    int newY = y + dir[1];

                    if (newX >= 0 && newX < rows && newY >= 0 && newY < cols && grid[newX][newY] == 1) {
                        grid[newX][newY] = 2;
                        totalFresh--;
                        freshOrangesRottenInThisLevel++;
                        queue.offer(new int[] { newX, newY });
                    }
                }
            }

            // If no fresh oranges were rotten in this level, it means the remaining fresh
            // oranges cannot rot
            if (freshOrangesRottenInThisLevel == 0 && totalFresh > 0) {
                return -1;
            }

            if (!queue.isEmpty()) {
                minutes++;
            }
        }

        // If all fresh oranges have rotted, return the elapsed minutes
        return minutes;


    }
}