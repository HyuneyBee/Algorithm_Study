package programmers;

public class lesson87946 {
    private int maxValue = 0;
    private int[] visited = {0,0,0,0,0,0,0,0};

    public void dfs(int cnt, int firo, int[][] dungeons){
        if(cnt > maxValue){
            maxValue = cnt;
        }

        for(int i=0; i < dungeons.length; i++){
            int dFiro = dungeons[i][0];
            if(firo >= dFiro && visited[i] == 0){
                visited[i] = 1;
                dfs(cnt+1, firo - dungeons[i][1], dungeons);
                visited[i] = 0;
            }
        }
    }

    public int solution(int k, int[][] dungeons) {
        dfs(0, k, dungeons);
        return maxValue;
    }
}
