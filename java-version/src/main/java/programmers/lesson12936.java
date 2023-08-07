package programmers;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class lesson12936 {

    public int[] solution(int n, long k) {
        int[] answer = new int[n];
        ArrayList<Integer> people = new ArrayList<>();
        int index = 0;

        long f = 1;
        for(int i=1; i<=n; i++){
            f *= i;
            people.add(i);
        }

        k--;
        while(n > 0){
            f /= n;
            answer[index++] = people.get((int) (k / f));
            people.remove((int) (k / f));
            k %= f;
            n--;
        }

        return answer;
    }
}
