package programmers;

public class lesson12978 {
    boolean[] visited;
    int[][] graph;
    int answer;

    public int solution(int N, int[][] road, int K) {
        answer = 0;
        graph = new int[N+1][N+1];
        visited = new boolean[N+1];

        for(int[] r: road){
            int from = r[0];
            int to = r[1];
            int time = r[2];

            graph[from][to] = graph[from][to] > 0 ? Math.min(graph[from][to], time) : time;
            graph[to][from] = graph[to][from] > 0 ? Math.min(graph[from][to], time) : time;
        }

        boolean[] graphVisited = new boolean[N+1];
        graphVisited[1] = true;
        dfs(N, 1, 0, K, graphVisited);


        return answer;
    }

    private void dfs(int n, int from, int time, int K, boolean[] graphVisited){
        if(!visited[from]){
            visited[from] = true;
            answer += 1;
        }

        for(int i=1; i<=n; i++){
            if(graph[from][i] >= 1 && !graphVisited[i] && graph[from][i] + time <= K){
                graphVisited[i] = true;
                dfs(n, i, graph[from][i] + time, K, graphVisited);
                graphVisited[i] = false;
            }
        }
    }
}
