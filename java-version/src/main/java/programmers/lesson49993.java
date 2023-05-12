package programmers;

import java.util.*;

public class lesson49993 {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        char[] skillArray = skill.toCharArray();
        Map<Character, Boolean> skillMap = new HashMap<>();

        for(char c: skillArray){
            skillMap.put(c, true);
        }

        for(String s: skill_trees){
            int index = 0;
            boolean flag = true;

            for(char c: s.toCharArray()){
                if(skillMap.containsKey(c)){
                    if(skillArray[index] == c){
                        index += 1;
                    } else {
                        flag = false;
                        break;
                    }
                }
            }

            if(flag){
                answer += 1;
            }
        }
        return answer;
    }
}
