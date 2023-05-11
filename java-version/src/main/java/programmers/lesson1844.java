package programmers;

import java.util.*;

class lesson1844 {

    private int[] xX = new int[]{-1, 0, 1, 0};
    private int[] yY = new int[]{0, 1, 0, -1};

    public int solution(int[][] maps) {
        int enemyX = maps.length - 1;
        int enemyY = maps[0].length - 1;

        boolean destination = false;
        int answer = 0;
        Queue<int[]> q = new LinkedList<>();

        q.add(new int[]{0,0});

        while(!q.isEmpty()){
            int[] value = q.poll();
            int x = value[0];
            int y = value[1];

            if(x == enemyX && y == enemyY){
                destination = true;
                answer = maps[x][y];
                break;
            }

            for(int i=0; i<4; i++){
                int nX = x - xX[i];
                int nY = y - yY[i];

                if(nX >= 0 && nX <= enemyX && nY >= 0 && nY <= enemyY && maps[nX][nY] == 1){
                    maps[nX][nY] = maps[x][y] + 1;
                    q.add(new int[]{nX,nY});
                }
            }
        }

        if(destination){
            return answer;
        }
        return -1;
    }
}