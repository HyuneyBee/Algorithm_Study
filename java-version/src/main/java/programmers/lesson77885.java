package programmers;

public class lesson77885 {
    public long[] solution(long[] numbers) {
        long[] answer = new long[numbers.length];

        for(int i=0; i < numbers.length; i++){
            if(numbers[i] % 2 == 0){
                answer[i] = numbers[i] + 1;
            } else {
                StringBuilder binary = new StringBuilder(Long.toBinaryString(numbers[i]));
                int length = binary.length();
                if(binary.toString().contains("01")){
                    for(int j=length; j > 0; j--){
                        if(binary.substring(j-2, j).equals("01")){
                            binary.setCharAt(j-2, '1');
                            binary.setCharAt(j-1, '0');
                            break;
                        }
                    }
                } else {
                    binary.deleteCharAt(0);
                    binary.insert(0, "10");
                }
                answer[i] = Long.parseLong(binary.toString(), 2);
            }
        }

        return answer;
    }
}
