package leetcode;

public class leetcode200 {
    int[][] checkGrid;
    int[][] dir = {{-1,0}, {0,1}, {1,0}, {0,-1}};
    int m,n;
    public int numIslands(char[][] grid) {
        int answer = 0;
        m = grid.length;
        n = grid[0].length;

        checkGrid = new int[m][n];

        for(int i = 0; i<m; i++){
            for(int j= 0; j<n; j++){
                if(checkGrid[i][j] == 0 && grid[i][j] == '1'){
                    answer++;
                    checkGrid[i][j] = 1;
                    dfs(i, j, grid);
                }
            }
        }

        return answer;
    }

    public void dfs(int x, int y, char[][] grid){
        for(int[] d:dir){
            int dx = x + d[0];
            int dy = y + d[1];
            if(dx >= 0 && dx < m && dy >= 0 && dy < n
                    && checkGrid[dx][dy] == 0
                    && grid[dx][dy] == '1'){
                checkGrid[dx][dy] = 1;
                dfs(dx, dy, grid);
            }
        }
    }
}
