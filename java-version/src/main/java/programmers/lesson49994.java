package programmers;

import java.util.*;

public class lesson49994 {
    public int solution(String dirs) {
        int answer = 0;
        Map<String, Integer> visitedMap = new HashMap<>();
        int cX = 5;
        int cY = 5;
        StringBuilder sb = new StringBuilder();

        for(char c: dirs.toCharArray()){
            int nX = cX;
            int nY = cY;

            switch(c){
                case 'U':
                    nY = cY - 1;
                    break;
                case 'D':
                    nY = cY + 1;
                    break;
                case 'L':
                    nX = cX - 1;
                    break;
                case 'R':
                    nX = cX + 1;
                    break;
            }

            if(nX < 11 && nX > -1 && nY < 11 && nY > -1){
                sb.append(cX);
                sb.append(cY);
                sb.append("|");
                sb.append(nX);
                sb.append(nY);

                if(!visitedMap.containsKey(sb.toString())){
                    answer += 1;
                    visitedMap.put(sb.toString(), 1);
                    String[] xy = sb.toString().split("\\|");
                    visitedMap.put(xy[1] + "|" + xy[0], 1);
                }

                cX = nX;
                cY = nY;
                sb.delete(0, sb.length());
            }
        }

        return answer;
    }
}
