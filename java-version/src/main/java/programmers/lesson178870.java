package programmers;

public class lesson178870 {
    public int[] solution(int[] sequence, int k) {
        if(sequence[0] == k){
            return new int[]{0,0};
        }

        int[] answer = new int[2];


        int start = 0;
        int last = 1;
        int sum = sequence[0] + sequence[1];

        Integer size = Integer.MAX_VALUE;

        while((last < sequence.length - 1) || sum > k){
            if(sum == k){
                int currentSize = last - start;

                if(size > currentSize){
                    answer[0] = start;
                    answer[1] = last;
                    size = currentSize;
                }
                last += 1;
                sum += sequence[last];
            } else if(sum > k){
                sum -= sequence[start];
                start += 1;
            } else {
                last += 1;
                sum += sequence[last];
            }
        }
        return answer;
    }
}
