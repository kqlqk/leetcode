package main.java;

public class NumberOfIslands {

    public static void main(String[] args) {
        char[][] grid = new char[][]{
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}};

        System.out.println(new NumberOfIslands().numIslands(grid));
    }

    public int numIslands(char[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        boolean[][] visited = new boolean[rows][cols];
        int count = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == '1' && !visited[i][j]) {
                    count++;
                    depthFirstSearch(grid, i, j, visited);
                }
            }
        }

        return count;
    }

    private void depthFirstSearch(char[][] grid, int row, int col, boolean[][] visited) {
        if (row < 0 || col < 0 ||
                row >= grid.length || col >= grid[0].length ||
                grid[row][col] == '0' || visited[row][col]) {
            return;
        }

        visited[row][col] = true;

        depthFirstSearch(grid, row + 1, col, visited);
        depthFirstSearch(grid, row - 1, col, visited);
        depthFirstSearch(grid, row, col + 1, visited);
        depthFirstSearch(grid, row, col - 1, visited);
    }


}
