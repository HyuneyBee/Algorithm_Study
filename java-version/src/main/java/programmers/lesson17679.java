package programmers;
import java.util.*;
public class lesson17679 {
    public int solution(int m, int n, String[] board) {
        int answer = 0;
        char[][] charBoard = new char[m][n];
        boolean[][] visited;

        for(int i=0; i<m; i++){
            charBoard[i] = board[i].toCharArray();
        }

        boolean flag = true;

        while(flag){

            flag = false;
            visited = new boolean[m][n];

            // check
            for(int i=0; i<m-1; i++){
                for(int j=0; j<n-1; j++){
                    char target = charBoard[i][j];
                    if(target != '#' && target == charBoard[i+1][j]
                            && target == charBoard[i][j+1] && target == charBoard[i+1][j+1]){

                        visited[i][j] = true;
                        visited[i+1][j] = true;
                        visited[i][j+1] = true;
                        visited[i+1][j+1] = true;
                        flag = true;
                    }
                }
            }

            if(!flag){
                break;
            }

            for(int j=0; j<n; j++){
                List<Character> lengthList = new ArrayList<>();


                for(int i=m-1; i>-1; i--){
                    if(!visited[i][j]){
                        lengthList.add(charBoard[i][j]);
                    } else {
                        answer += 1;
                    }
                }

                for(int i=m-1, index=0; i>-1; i--, index++){
                    if(index< lengthList.size()){
                        charBoard[i][j] = lengthList.get(index);
                    } else {
                        charBoard[i][j] = '#';
                    }
                }


            }
        }
        return answer;
    }
}
