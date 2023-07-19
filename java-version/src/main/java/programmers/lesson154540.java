package programmers;

import java.util.*;

public class lesson154540 {
    List<Integer> answer = new ArrayList<>();
    int[] dx = new int[]{-1, 0, 1, 0};
    int[] dy = new int[]{0, 1, 0, -1};

    int width;
    int height;

    public int[] solution(String[] maps) {
        char[][] map = new char[maps.length][maps[0].length()];
        boolean[][] visited = new boolean[maps.length][maps[0].length()];

        width = maps[0].length();
        height = maps.length;;

        for(int i=0; i< height; i++){
            for(int j=0; j < width; j++){
                String s = maps[i];
                map[i][j] = s.charAt(j);
            }
        }

        for(int i=0; i< height; i++){
            for(int j=0; j < width; j++){
                if(map[i][j] != 'X' && !visited[i][j]){
                    answer.add(bfs(i, j, map, visited));
                }
            }
        }

        if(answer.isEmpty()){
            return new int[]{-1};
        }

        return answer.stream()
            .mapToInt(Integer::intValue)
            .sorted().toArray();
    }

    private int bfs(int x, int y, char[][] map, boolean[][] visited) {
        int ans = map[x][y] - '0';
        Queue<Pair> q = new LinkedList<>();

        q.add(new Pair(x, y));
        visited[x][y] = true;

        while (!q.isEmpty()){
            Pair p = q.poll();
            for(int i=0; i<4; i++){
                int xX = p.x + dx[i];
                int yY = p.y + dy[i];

                if(xX > -1 && xX < height && yY > -1 && yY < width && map[xX][yY] != 'X' && !visited[xX][yY]){
                    visited[xX][yY] = true;
                    q.add(new Pair(xX, yY));
                    ans += map[xX][yY] - '0';
                }
            }
        }
        return ans;
    }

    private static class Pair {
        int x, y;

        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
