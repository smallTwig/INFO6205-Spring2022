package com.company;

public class Question2 {

    public int numIslands(char[][] grid) {
        int count = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == '1') {
                    count++;
                    traverse(grid, i, j);
                }
            }
        }
        return count;
    }


    private void traverse(char[][] grid, int i, int j){
        if (i < 0 || j < 0 || i > grid.length-1 || j > grid[i].length-1
        || grid[i][j] == '0') {
            return;
        }

        grid[i][j] = '0';
        traverse(grid, i, j+1);
        traverse(grid, i, j-1);
        traverse(grid, i+1, j);
        traverse(grid, i-1, j);
    }
}
