package programmers;

public class lesson17687 {
    public String solution(int n, int t, int m, int p) {
        StringBuilder answer = new StringBuilder();
        StringBuilder value = new StringBuilder();

        int currentValue = 0;
        int currentSequence = 1;

        while (answer.length() < t){
            if(value.length() == 0){
                value.append(Integer.toString(currentValue,n));
                currentValue += 1;
            }

            for(char c: value.toString().toCharArray()){
                if(answer.length() == t){
                    break;
                }

                if(m < currentSequence){
                    currentSequence = 1;
                }
                if(p == currentSequence){
                    answer.append(c);
                }
                currentSequence += 1;
            }

            value.delete(0, value.length());
        }

        return answer.toString().toUpperCase();
    }
}
