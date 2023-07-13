package programmers;

public class lesson68645 {
    public int[] solution(int n) {
        int[] answer = new int[(n*(n+1))/2];
        int[][] map = new int[n][n];

        int x = -1;
        int y = 0;
        int sequence = 1;

        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                if(i % 3 == 0){
                    x += 1;
                } else if(i % 3 == 1){
                    y += 1;
                } else if (i % 3 == 2){
                    x -= 1;
                    y -= 1;
                }
                map[x][y] = sequence++;
            }
        }

        int answerIndex = 0;

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(map[i][j] == 0) break;
                answer[answerIndex++] = map[i][j];
            }
        }


        return answer;
    }
}
