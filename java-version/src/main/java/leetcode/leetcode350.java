package leetcode;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class leetcode350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> numMap = new HashMap<>();

        for(int i: nums1){
            if(numMap.containsKey(i)){
                numMap.put(i, numMap.get(i) + 1);
            } else {
                numMap.put(i, 1);
            }
        }

        List<Integer> answer = new ArrayList<>();

        for(int j: nums2){
            if(numMap.getOrDefault(j, null) != null){
                Integer i = numMap.get(j);
                if(i > 0){
                    answer.add(j);
                }
                numMap.put(j, i-1);
            }
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
