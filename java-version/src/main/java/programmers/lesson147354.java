package programmers;

import java.util.Arrays;

public class lesson147354 {
    public int solution(int[][] data, int col, int row_begin, int row_end) {
        Arrays.sort(data, (d1, d2) -> {
            int sortIndex = col - 1;

            if(d1[sortIndex] == d2[sortIndex]){
                return d2[0] - d1[0];
            } else {
                return d1[sortIndex] - d2[sortIndex];
            }
        });

        int answer = 0;
        for(int i=row_begin; i<=row_end; i++){
            int result = 0;
            for(int v : data[i-1]){
                result += v % i;
            }
            answer = answer ^ result;
        }

        return answer;
    }
}
