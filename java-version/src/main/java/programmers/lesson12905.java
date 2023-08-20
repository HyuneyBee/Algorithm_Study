package programmers;

public class lesson12905 {
    public int solution(int [][]board){
        int[][] map = new int[board.length + 1][board[0].length + 1];

        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[i].length; j++){
                map[i+1][j+1] = board[i][j];
            }
        }

        int answer = 0;

        for(int i=1; i<map.length; i++){
            for(int j=1; j<map[i].length; j++){
                if(map[i][j] == 1){
                    int left = map[i-1][j];
                    int up = map[i][j-1];
                    int leftUp = map[i-1][j-1];

                    int min = Math.min(left, Math.min(up, leftUp)) + 1;

                    map[i][j] = min;

                    answer = Math.max(answer, min);
                }
            }
        }

        return answer * answer;
    }
}
