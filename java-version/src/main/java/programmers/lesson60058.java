package programmers;

import java.util.Stack;

public class lesson60058 {
    StringBuilder answer = new StringBuilder();

    public String solution(String p) {
        if(isCorrect(p)){
            return p;
        }


        createCorrectString(p);
        return answer.toString();
    }

    private void createCorrectString(String p){
        if(p.equals("")){
            return;
        }

        int slideIndex = getSlideIndex(p);

        String u = p.substring(0,slideIndex);
        String v = p.substring(slideIndex);

        if(isCorrect(u)){
            answer.append(u);
            createCorrectString(v);
        } else {
            answer.append('(');
            createCorrectString(v);
            answer.append(')');
            answer.append(revers(u));
        }
    }


    private boolean isCorrect(String p){
        Stack<Character> s = new Stack<>();

        for(char c: p.toCharArray()){
            if(c == '('){
                s.push(c);
            } else {
                if(s.isEmpty()){
                    return false;
                }
                s.pop();
            }
        }
        return true;
    }

    private int getSlideIndex(String p){
        int leftCount = 0;
        int rightCount = 0;

        int count = 0;

        for(char c : p.toCharArray()){
            count += 1;
            if(c == '('){
                leftCount += 1;
            } else {
                rightCount += 1;
            }
            if (leftCount == rightCount){
                break;
            }
        }
        return count;
    }

    private String revers(String p){
        String slideString = p.substring(1, p.length()-1);

        StringBuilder sb = new StringBuilder();

        for(char c : slideString.toCharArray()){
            if(c == '('){
                sb.append(')');
            } else {
                sb.append('(');
            }
        }

        return sb.toString();

    }
}
