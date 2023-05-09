package programmers;

import java.util.Arrays;
import java.util.Collections;

public class lesson12913 {
    int solution(int[][] land) {
        int[][] answer = land;

        for (int i = 0; i < land.length - 1; i++) {

            answer[i+1][0] = Collections.max(Arrays.asList(answer[i][1], answer[i][2], answer[i][3])) + answer[i+1][0];
            answer[i+1][1] = Collections.max(Arrays.asList(answer[i][0], answer[i][2], answer[i][3])) + answer[i+1][1];
            answer[i+1][2] = Collections.max(Arrays.asList(answer[i][0], answer[i][1], answer[i][3])) + answer[i+1][2];
            answer[i+1][3] = Collections.max(Arrays.asList(answer[i][0], answer[i][1], answer[i][2])) + answer[i+1][3];

        }

        return Arrays.stream(answer[land.length -1]).max().getAsInt();
    }
}
