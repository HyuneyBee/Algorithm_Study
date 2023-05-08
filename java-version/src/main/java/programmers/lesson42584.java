package programmers;

import java.util.*;

public class lesson42584 {
    public int[] solution(int[] prices) {
        Stack<int[]> stack = new Stack<>();
        int[] answer = new int[prices.length];

        for(int i=0; i < prices.length; i++){
            int[] valueArray = new int[]{i, prices[i]};

            if(!stack.empty()){
                int[] topValue = stack.peek();

                while(topValue[1] > prices[i] && !stack.empty()){
                    answer[topValue[0]] = i - topValue[0];
                    stack.pop();
                    if(!stack.empty()){
                        break;
                    }
                    topValue = stack.peek();
                }
            }
            stack.push(valueArray);
        }

        while(!stack.empty()){
            int[] topValue = stack.pop();
            answer[topValue[0]] = (prices.length - 1) - topValue[0];
        }

        return answer;
    }
}
