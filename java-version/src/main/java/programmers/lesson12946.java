package programmers;

import java.util.ArrayList;

public class lesson12946 {
    ArrayList<int[]> list = new ArrayList<>();

    public int[][] solution(int n) {
        hanoi(n,1,3,2);
        int[][] answer = new int[list.size()][2];

        for(int i=0; i<list.size(); i++){
            answer[i][0] = list.get(i)[0];
            answer[i][1] = list.get(i)[1];
        }
        return answer;
    }

    private void hanoi(int n, int start, int end, int waypoint){
        int[] move = {start, end};

        if(n == 1){
            list.add(move);
        }else {
            hanoi(n - 1, start, waypoint, end);
            list.add(move);
            hanoi(n - 1, waypoint, end, start);
        }
    }
}
