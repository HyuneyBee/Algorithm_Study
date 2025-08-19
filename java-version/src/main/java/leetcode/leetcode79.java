package leetcode;

public class leetcode79 {
    boolean answer = false;
    int[][] dirs = {{-1,0}, {0,1}, {1,0}, {0,-1}};
    int[][] checkMap;
    char[] wordChar;

    int m;
    int n;
    public boolean exist(char[][] board, String word) {
        m = board.length;
        n = board[0].length;
        checkMap = new int[m][n];

        wordChar = word.toCharArray();
        for(int i = 0; i<m; i++){
            for(int j = 0; j<n; j++){
                if(answer){
                    return true;
                }
                if(board[i][j] == wordChar[0]){
                    checkMap[i][j] = 1;
                    dfs(i, j, 0, board);
                    checkMap[i][j] = 0;

                }
            }
        }
        return answer;
    }

    public void dfs(int x, int y, int index, char[][] board){
        if(index == wordChar.length - 1){
            answer = true;
            return;
        }
        int nextIndex = index + 1;
        for(int[] dir: dirs){
            int dx = x + dir[0];
            int dy = y + dir[1];
            if(dx > -1 && dx <m && dy >-1 && dy<n && checkMap[dx][dy] == 0){
                if(board[dx][dy] == wordChar[nextIndex]){
                    checkMap[dx][dy] = 1;
                    dfs(dx, dy, nextIndex, board);
                    checkMap[dx][dy] = 0;
                }
            }
        }
    }
}
