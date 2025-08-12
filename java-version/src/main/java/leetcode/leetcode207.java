package leetcode;

import java.util.*;

public class leetcode207 {
    int[] checkMap;
    Map<Integer, List<Integer>> valueMap = new HashMap<>();
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        if(prerequisites.length == 0) return true;
        for(int i = 0; i< prerequisites.length; i++){
            int[] value = prerequisites[i];
            List<Integer> aDefault = valueMap.getOrDefault(value[1], new ArrayList<>());
            aDefault.add(value[0]);
            valueMap.put(value[1], aDefault);
        }
        checkMap = new int[numCourses];

        for(int i = 0; i<numCourses; i++){
            if (checkMap[i] == 0) {
                if(!dfs(i)){
                    return false;
                }
            }
        }
        return true;
    }

    public boolean dfs(int index){
        if (checkMap[index] == 1) return false;
        if (checkMap[index] == 2) return true;

        checkMap[index] = 1;
        List<Integer> graphList = valueMap.getOrDefault(index, new ArrayList<>());
        for (Integer integer : graphList) {
            if (!dfs(integer)) {
                return false;
            }
        }
        checkMap[index] = 2;

        return true;
    }
}
