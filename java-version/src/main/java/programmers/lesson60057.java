package programmers;

public class lesson60057 {
    public int solution(String s) {
        int answer = s.length();

        for(int i=1; i <= s.length() /2; i++){
            int count = 1;
            String base = s.substring(0, i);
            StringBuilder sb = new StringBuilder();

            for(int j=i; j <= s.length(); j+=i){
                int end = Math.min(i+j, s.length());
                String compare = s.substring(j, end);

                if(base.equals(compare)){
                    count ++;
                } else {
                    if(count >= 2){
                        sb.append(count);
                    }
                    sb.append(base);
                    base = compare;
                    count = 1;
                }
            }
            sb.append(base);
            answer = Math.min(answer, sb.length());
        }
        return answer;
    }
}
