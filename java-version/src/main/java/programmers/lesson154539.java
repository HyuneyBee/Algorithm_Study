package programmers;
import java.util.*;

public class lesson154539 {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];

        Stack<int[]> s = new Stack<>();

        for(int i=0; i<numbers.length; i++){

            if(s.isEmpty()){
                s.push(new int[]{numbers[i],i});

            } else {
                int top = s.peek()[0];

                if(top > numbers[i]){
                    s.push(new int[]{numbers[i],i});
                } else {
                    while(top < numbers[i]){
                        int[] topValue = s.pop();
                        answer[topValue[1]] = numbers[i];

                        if(s.isEmpty()){
                            break;
                        }
                        top = s.peek()[0];
                    }
                    s.push(new int[]{numbers[i],i});
                }
            }

        }

        while(!s.isEmpty()){
            int[] top = s.pop();
            answer[top[1]] = -1;
        }


        return answer;
    }
}
