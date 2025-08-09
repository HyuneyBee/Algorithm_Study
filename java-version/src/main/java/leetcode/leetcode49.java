package leetcode;

import java.util.*;
import java.util.stream.Collectors;

public class leetcode49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for(String str : strs) {
            // 문자열을 정렬하여 키로 사용
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sortedKey = new String(chars);

            // 같은 키(아나그램)끼리 그룹화
            map.computeIfAbsent(sortedKey, k -> new ArrayList<>()).add(str);
        }

        return new ArrayList<>(map.values());
    }
}
