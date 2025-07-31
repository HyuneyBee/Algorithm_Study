package programmers;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Objects;

public class lesson1021 {
    public String removeOuterParentheses(String s) {
        Deque<String> deque = new LinkedList<>();

        StringBuilder sb = new StringBuilder();

        String[] split = s.split("");
        int left = 0;
        int right = 0;
        for(String v: split){
            deque.add(v);
            if(Objects.equals(v, "(")){
                left += 1;
            }else {
                right += 1;
            }

            if(left == right){
                if(Objects.equals(deque.peekFirst(), "(") && Objects.equals(deque.peekLast(), ")")){
                    deque.pollFirst();
                    deque.pollLast();
                    left = 0;
                    right = 0;
                    while (!deque.isEmpty()){
                        sb.append(deque.poll());
                    }
                }
            }
        }

        return sb.toString();
    }
}
