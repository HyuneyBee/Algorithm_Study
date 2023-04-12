package programmers;

public class lesson92335 {

    private boolean isPrime(long number) {
        if(number < 2) {
            return false;
        }

        if(number == 2) {
            return true;
        }

        for(int i = 2; i <= Math.sqrt(number); i++) {
            if(number % i == 0) {
                return false;
            }
        }
        return true;
    }
    public int solution(int n, int k) {
        String value = Long.toString(n, k);
        StringBuilder stringQ = new StringBuilder();

        int answer = 0;


        for(char c: value.toCharArray()){
            if(c == '0'){
                if(stringQ.length() > 0){
                    long number = Long.parseLong(stringQ.toString());
                    if(isPrime(number)){
                        answer += 1;
                    }
                    stringQ.delete(0, stringQ.length());
                }
            } else {
                stringQ.append(c);
            }
        }

        if(stringQ.length() > 0){
            long number = Long.parseLong(stringQ.toString());
            if(isPrime(number)){
                answer += 1;
            }
        }

        return answer;
    }
}
