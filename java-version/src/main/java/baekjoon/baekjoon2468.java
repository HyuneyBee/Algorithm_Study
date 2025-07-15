package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon2468 {
    public static int[] dx = new int[]{0,1,0,-1};
    public static int[] dy = new int[]{-1,0,1,0};

    public static int mapSize;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        mapSize = n;
        int[][] map = new int[n][n];

        int min_rain = 1;
        int max_rain = 1;

        for(int i = 0; i<n; i++){
            String[] charArray = br.readLine().split(" ");
            for(int j = 0; j < charArray.length; j++){
                map[i][j] = Integer.parseInt(charArray[j]);
                if(map[i][j] > max_rain){
                    max_rain = map[i][j];
                }
            }
        }

        int result = 1;

        for(int r = min_rain; r<= max_rain; r++){
            int[][] checkMap = new int[n][n];
            int count = 0;
            for(int i = 0; i<n; i++){
                for(int j = 0; j<n; j++){
                    if(map[i][j] == r){
                        checkMap[i][j] = 1;
                        continue;
                    }

                    if(checkMap[i][j] == 0){
                        count += dfs(i, j, checkMap, map, r);
                    }
                }
            }
            if(count > result){
                result = count;
            }
        }

        System.out.println(result);
    }

    public static int dfs(int x, int y, int[][] checkMap, int[][] map, int min_rain){
        if(map[x][y] <= min_rain){
            checkMap[x][y] = 1;
        }

        if(checkMap[x][y] == 0){
            for(int i = 0; i<4; i++){
                int nx = x + dx[i];
                int ny = y + dy[i];

                if(nx >= 0 && nx < mapSize && ny >= 0 && ny < mapSize){
                    checkMap[x][y] = 1;
                    dfs(nx, ny, checkMap, map, min_rain);
                }
            }
            return 1;
        }
        return 0;
    }
}
