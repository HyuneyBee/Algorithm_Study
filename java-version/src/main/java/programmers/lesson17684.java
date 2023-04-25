package programmers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class lesson17684 {

    public int[] solution(String msg) {
        Map<String, Integer> dict = new HashMap<>();

        for(int i=0; i < 26; i++){
            dict.put(String.valueOf((char)('A'+i-1)), i);
        }

        int length = msg.length();
        List<Integer> answer = new ArrayList<>();
        int end = 0;
        int nextValue = 26;
        char[] msgCharArray = msg.toCharArray();

        while(end < length){
            StringBuilder s = new StringBuilder();
            s.append(msgCharArray[end]);
            while (true){
                end += 1;
                if(end == length){
                    break;
                }
                s.append(msgCharArray[end]);
                if(!dict.containsKey(s.toString())){
                    nextValue += 1;
                    dict.put(s.toString(), nextValue);
                    break;
                }
            }

            if(length != end){
                s.deleteCharAt(s.length()-1);
            }

            answer.add(dict.get(s.toString()));

        }
        int[] result = answer.stream().mapToInt(Integer::intValue).toArray();
        return result;
    }
}
