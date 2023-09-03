package programmers;

import java.util.StringTokenizer;

public class lessons12951 {
    public String solution(String s) {

        StringTokenizer st = new StringTokenizer(s, " ", true);
        StringBuilder answer = new StringBuilder();

        while (st.hasMoreTokens()){
            String word = st.nextToken();
            if(word.equals(" ")){
                answer.append(" ");
            } else {
                answer.append(word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase());
            }
        }
        return answer.toString();
    }
}
