package programmers;

import java.util.HashMap;
import java.util.Map;

public class lesson132265 {
    public int solution(int[] topping) {
        if(topping.length == 1) return 0;

        int answer = 0;

        Map<Integer, Integer> leftMap = new HashMap<>();
        Map<Integer, Integer> rightMap = new HashMap<>();


        for(int t:topping){
            int v = rightMap.computeIfAbsent(t, k -> 0) + 1;
            rightMap.put(t, v);
        }

        for(int t:topping){
            int lv = leftMap.computeIfAbsent(t, k -> 0) + 1;
            leftMap.put(t, lv);

            int rv = rightMap.computeIfPresent(t, (k,v) -> v - 1);
            if(rv == 0) rightMap.remove(t);

            if(leftMap.keySet().size() == rightMap.keySet().size()) answer += 1;
        }

        return answer;
    }
}
