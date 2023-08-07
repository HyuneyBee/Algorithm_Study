package programmers;

import java.util.*;
import java.util.Queue;

public class lesson81302 {

    int[] dx = {-1, 0, 1, 0};
    int[] dy = {0, 1, 0, -1};

    public int[] solution(String[][] places) {
        int[] answer = new int[places.length];
        int count = 0;
        for(String[] p: places){
            boolean isOk = true;
            for(int i=0; i<5; i++){
                for(int j=0; j<5; j++){
                    if(p[i].charAt(j) == 'P'){
                        if(!bfs(i,j,p)){
                            isOk = false;
                        }
                    }
                }
            }
            answer[count++] = isOk ? 1 : 0;
        }
        return answer;
    }

    private boolean bfs(int x, int y, String[] board){
        Queue<Node> queue = new LinkedList<>();
        queue.offer(new Node(x, y));

        boolean[][] visited = new boolean[board.length][board.length];
        visited[x][y] = true;

        while (!queue.isEmpty()){
            Node node = queue.poll();

            for(int i=0; i<4; i++){
                int nx = node.x + dx[i];
                int ny = node.y + dy[i];

                if(nx > 4 || nx < 0 || ny > 4 || ny< 0 || visited[nx][ny]) continue;

                visited[nx][ny] = true;
                int d = Math.abs(x - nx) + Math.abs(y - ny);

                if(board[nx].charAt(ny) == 'P' && d <= 2){
                    return false;
                } else if (board[nx].charAt(ny) == 'O' && d <= 2){
                    queue.offer(new Node(nx, ny));
                }
            }
        }
        return true;
    }

    private class Node{
        int x;
        int y;

        public Node(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
}
