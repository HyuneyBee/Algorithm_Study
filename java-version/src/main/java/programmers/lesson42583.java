package programmers;
import java.util.*;

public class lesson42583 {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Deque<Integer> deque = new ArrayDeque<>();
        int answer = 0;

        for(int i=0; i<bridge_length; i++){
            deque.addFirst(0);
        }

        int truck_index = 0;
        int total_weight = truck_weights[truck_index];

        while(!deque.isEmpty()){
            answer += 1;
            Integer last = deque.removeLast();
            total_weight -= last;

            if(total_weight <= weight){
                deque.addFirst(truck_weights[truck_index]);
                truck_index += 1;

                if(truck_index == truck_weights.length){
                    break;
                }

                total_weight += truck_weights[truck_index];

            } else {
                deque.addFirst(0);
            }
        }
        return answer + deque.size();
    }
}
