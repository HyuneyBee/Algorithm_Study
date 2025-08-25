package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class leetcode242 {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        String[] sString = s.split("");
        Map<String, Integer> sMap = new HashMap<>();

        for(String v: sString){
            sMap.put(v, sMap.getOrDefault(v, 0) + 1);
        }

        String[] tString = t.split("");
        for(String v: tString){
            Integer orDefault = sMap.getOrDefault(v, null);
            if(orDefault == null || orDefault == 0){
                return false;
            }
            sMap.put(v, orDefault - 1);
        }

        return true;
    }
}
