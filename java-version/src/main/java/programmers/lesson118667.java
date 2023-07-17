package programmers;

import java.util.LinkedList;
import java.util.Queue;

public class lesson118667 {
    public int solution(int[] queue1, int[] queue2) {
        Queue<Double> q1 = new LinkedList<>();
        Queue<Double> q2 = new LinkedList<>();

        double q1Sum = 0.0;
        double q2Sum = 0.0;
        int answer = 0;
        int maxLoop = (queue1.length + queue2.length) * 2;

        for(int i=0; i<queue1.length; i++){
            q1.add(Double.valueOf(queue1[i]));
            q1Sum += Double.valueOf(queue1[i]);

            q2.add(Double.valueOf(queue2[i]));
            q2Sum += Double.valueOf(queue2[i]);
        }

        while(q1Sum != q2Sum){
            answer += 1;

            if(q1Sum > q2Sum){
                Double first = q1.poll();
                q1Sum -= first;
                q2Sum += first;
                q2.add(first);

            } else {
                Double first = q2.poll();
                q2Sum -= first;
                q1Sum += first;
                q1.add(first);

            }

            if(answer > maxLoop){
                answer = -1;
                break;
            }

        }
        return answer;
    }
}
