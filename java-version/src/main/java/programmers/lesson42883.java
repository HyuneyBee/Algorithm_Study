package programmers;

public class lesson42883 {
    public String solution(String number, int k) {
        StringBuilder answer = new StringBuilder();
        int resultSize = number.length() - k;
        int start = 0;

        while(start < number.length() && answer.length() != resultSize){
            int slide = k + answer.length() + 1;
            int max = 0;
            for(int i=start; i<slide; i++){
                if(max < number.charAt(i) - '0'){
                    max = number.charAt(i) - '0';
                    start = i + 1;
                }
            }
            answer.append(max);
        }
        return answer.toString();
    }
}
