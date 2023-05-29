package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class lesson84512 {
    private final List<String> alphaList = new ArrayList<>(Arrays.asList("A", "E", "I", "O", "U"));
    private int answer = 0;
    private int count = 0;

    public int solution(String word) {
        StringBuilder sb = new StringBuilder();
        findValue(sb, word);
        return answer;
    }

    public void findValue(StringBuilder sb, String word){
        if(sb.toString().equals(word)){
            this.answer = this.count;
            return;
        }

        if(sb.length() == 5) {
            return;
        }
        for(String s: this.alphaList){
            count += 1;
            sb.append(s);
            findValue(sb, word);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}
