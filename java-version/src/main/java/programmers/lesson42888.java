package programmers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class lesson42888 {
    public String[] solution(String[] record) {
        List<String> answer = new ArrayList<>();
        Map<String, String> uidMap = new HashMap<>();

        for(String s: record){
            String[] r = s.split(" ");

            if(r[0].equals("Enter") || r[0].equals("Change")){
                uidMap.put(r[1], r[2]);
            }
        }

        for (String s : record) {
            String[] r = s.split(" ");

            if (r[0].equals("Enter")) {
                answer.add(String.format("%s님이 들어왔습니다.", uidMap.get(r[1])));
            } else if (r[0].equals("Leave")) {
                answer.add(String.format("%s님이 나갔습니다.", uidMap.get(r[1])));
            }
        }

        return answer.toArray(new String[0]);
    }
}
