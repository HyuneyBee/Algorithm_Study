package programmers;

import java.util.PriorityQueue;

    public class lesson42626 {

        public int solution(int[] scoville, int K) {
            PriorityQueue<Integer> queue = new PriorityQueue<>();
            int answer = 0;

            for (int j : scoville) {
                queue.add(j);
            }

            int min = queue.peek();

            while (K > min && queue.size() > 1) {
                answer += 1;

                int firstValue = queue.poll();
                int secondValue = queue.poll();

                int result = firstValue + (secondValue * 2);

                queue.add(result);
                min = queue.peek();
            }

            if(K > min){
                return -1;
            }
            return answer;
        }
    }
