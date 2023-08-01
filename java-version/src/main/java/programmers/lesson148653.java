package programmers;

public class lesson148653 {
    public int solution(int storey) {
        int answer = 0;
        int unit = 10;

        while(storey > 0){
            int value = storey % unit;
            storey = (int) storey / unit;

            if(value > 5){
                value = 10 - value;
                storey += 1;
            } else if(value == 5){
                if(storey % unit >= 5){
                    value = 10 - value;
                    storey += 1;
                }
            }
            answer += value;
        }
        return answer;
    }
}
