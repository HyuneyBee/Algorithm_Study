package leetcode;

import java.util.Stack;

public class leetcode20 {
    public boolean isValid(String s) {
        Stack<String> stack = new Stack<>();

        String[] split = s.split("");

        for(String v : split){
            if(v.equals("(") || v.equals("[") || v.equals("{")){
                stack.push(v);
            } else {
                String top = stack.peek();
                if(v.equals(")") && top.equals("(")){
                    stack.pop();
                } else if (v.equals("]") && top.equals("[")) {
                    stack.pop();
                } else if (v.equals("}") && top.equals("{")) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
