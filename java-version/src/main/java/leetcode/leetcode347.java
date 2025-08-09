package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class leetcode347 {
    public int[] topKFrequent(int[] nums, int k) {
        int[] answer = new int[k];
        Map<Integer, Integer> countMap = new HashMap<>();

        PriorityQueue<Map.Entry<Integer, Integer>> maxHeap = new PriorityQueue<>(
                (e1, e2) -> -Integer.compare(e1.getValue(), e2.getValue()) // value 기준 내림차순
        );

        for(int i: nums){
            countMap.put(i, countMap.getOrDefault(i, 0) + 1);
        }

        maxHeap.addAll(countMap.entrySet());

        for(int i = 0; i<k; i++){
            answer[i] = maxHeap.poll().getKey();
        }

        return answer;
    }
}
