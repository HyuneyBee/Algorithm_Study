package leetcode;

import java.util.ArrayList;
import java.util.List;

public class leetcode54 {

    int[][] checkBoard;
    List<Integer> answer = new ArrayList<>();

    int maxHeight;
    int maxWidth;

    int[][] controller;
    public List<Integer> spiralOrder(int[][] matrix) {
        maxHeight = matrix.length;
        maxWidth = matrix[0].length;

        controller = new int[][]{{0,1}, {1,0}, {0,-1}, {-1,0}};

        checkBoard = new int[maxHeight][maxWidth];

        dfs(0, 0, 0, matrix);

        return answer;
    }

    public void dfs(int x, int y, int controllerIndex, int[][] matrix){
        answer.add(matrix[x][y]);
        checkBoard[x][y] = 1;

        if(answer.size() == maxHeight * maxWidth) return;

        int dx = x + controller[controllerIndex][0];
        int dy = y + controller[controllerIndex][1];
        if(dx >= maxHeight || dx < 0 || dy >= maxWidth || dy < 0 || checkBoard[dx][dy] == 1){
            controllerIndex = (controllerIndex + 1) % 4;
            dx = x + controller[controllerIndex][0];
            dy = y + controller[controllerIndex][1];

            if(dx >= maxHeight || dx < 0 || dy >= maxWidth || dy < 0 || checkBoard[dx][dy] == 1){
                return;
            }
        }
        dfs(dx, dy, controllerIndex,  matrix);
    }
}
