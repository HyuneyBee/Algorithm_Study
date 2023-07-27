package programmers;
import java.util.*;

public class lesson86971 {
    int[][] graph;
    public int solution(int n, int[][] wires) {
        int answer = Integer.MAX_VALUE;

        graph = new int[n+1][n+1];

        for(int[] w: wires){
            int from = w[0];
            int to = w[1];

            graph[from][to] = 1;
            graph[to][from] = 1;
        }

        for(int[] w: wires){
            int from = w[0];
            int to = w[1];

            graph[from][to] = 0;
            graph[to][from] = 0;

            answer = Math.min(answer, bfs(n, from));

            graph[from][to] = 1;
            graph[to][from] = 1;
        }

        return answer;
    }

    private int bfs(int n, int from){
        boolean[] visited = new boolean[n+1];
        int count = 1;

        Queue<Integer> q = new LinkedList<>();
        visited[from] = true;
        q.offer(from);

        while(!q.isEmpty()){
            int to = q.poll();

            for(int i=1; i<=n; i++){
                if(graph[to][i] == 1 && !visited[i]){
                    visited[i] = true;
                    q.offer(i);
                    count++;
                }
            }

        }
        return Math.abs(count-(n-count));
    }
}
