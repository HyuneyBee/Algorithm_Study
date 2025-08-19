package leetcode;

import java.util.*;

public class leetcode219 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, List<Integer>> duMap = new HashMap<>();
        
        boolean answer = false;
        for(int i = 0; i<nums.length; i++){
            if(duMap.containsKey(nums[i])){
                duMap.get(nums[i]).add(i);
            } else {
                duMap.put(nums[i], new ArrayList<>(List.of(i)));
            }
        }
        
        for(List<Integer> v: duMap.values()){
            int s = 0;
            int e = 1;

            while (e < v.size()){
                if(Math.abs(v.get(s) - v.get(e)) <= k){
                    return true;
                }else {
                    s += 1;
                    e += 1;
                }
            }
        }
        
        return answer;
    }
}
