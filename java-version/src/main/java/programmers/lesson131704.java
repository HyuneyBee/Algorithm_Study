package programmers;

import java.util.Stack;

public class lesson131704 {
    public int solution(int[] order) {
        int answer = 0;
        int currentGoods = 1;

        Stack<Integer> stack = new Stack<>();

        for (int currentLoadGoods : order) {
            while (currentLoadGoods >= currentGoods) {
                stack.push(currentGoods);
                currentGoods += 1;
            }

            if (stack.pop() == currentLoadGoods) {
                answer += 1;
            } else {
                break;
            }

        }
        return answer;
    }
}
