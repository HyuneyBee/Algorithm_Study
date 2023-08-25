package programmers;

import java.util.LinkedList;
import java.util.Queue;

public class lesson159993 {
    int[] xX = {-1, 0, 1, 0};
    int[] yY = {0, 1, 0, -1};

    public int solution(String[] maps) {
        Pair startPoint = findStartPoint(maps, 'S');
        Pair startLever = findStartPoint(maps, 'L');

        int startResult = bfs(maps, startPoint, 'L');
        int leverResult = bfs(maps, startLever, 'E');

        if(startResult == -1 || leverResult == -1){
            return -1;
        }
        return startResult + leverResult;
    }

    private Pair findStartPoint(String[] maps, char p){
        for(int i=0; i< maps.length; i++){
            for(int j=0; j<maps[0].length(); j++){
                if(p == maps[i].charAt(j)) return new Pair(i, j, 0);
            }
        }
        throw new RuntimeException("잘못된 문자열 입니다.");
    }

    private int bfs(String[] maps, Pair pair, char find){
        Queue<Pair> queue = new LinkedList<>();
        int height = maps.length;
        int width = maps[0].length();

        queue.offer(pair);
        boolean[][] visited = new boolean[height][width];
        visited[pair.x][pair.y] = true;

        while (!queue.isEmpty()){
            Pair p = queue.poll();
            if(maps[p.x].charAt(p.y) == find){
                return p.count;
            }
            for(int i=0; i<4; i++){
                int nX = p.x + xX[i];
                int nY = p.y + yY[i];
                if(nX >= 0 && nX < height && nY >= 0 && nY < width && !visited[nX][nY] && maps[nX].charAt(nY) != 'X'){
                    visited[nX][nY] = true;
                    queue.offer(new Pair(nX, nY, p.count + 1));
                }
            }
        }
        return -1;
    }

    private static class Pair{
        int x;
        int y;
        int count;

        public Pair(int x, int y, int count) {
            this.x = x;
            this.y = y;
            this.count = count;
        }
    }
}
