package leetcode;

import java.util.Stack;

public class leetcode20_1 {
    public boolean isValid(String s) {
        if(s.length() == 1) return false;
        char[] chars = s.toCharArray();

        Stack<Character> stack = new Stack<>();

        for(char c: chars){
            if(c == '(' || c == '[' | c == '{'){
                stack.push(c);
            } else {
                if(stack.isEmpty()){
                    return false;
                }
                if (c == ')' && stack.peek() == '(') {
                    stack.pop();
                } else if (c == ']' && stack.peek() == '[') {
                    stack.pop();
                } else if (c == '}' && stack.peek() == '{') {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
