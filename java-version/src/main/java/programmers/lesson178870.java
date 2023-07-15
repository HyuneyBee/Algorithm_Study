package programmers;

public class lesson178870 {
    public int[] solution(int[] sequence, int k) {
        if(sequence[0] == k){
            return new int[]{0,0};
        }
        int[] answer = new int[2];

        int start = 0;
        int last = 0;
        int sum = sequence[0];

        int length = sequence.length;

        Integer size = Integer.MAX_VALUE;

        while(true){
            if(sum == k){
                int currentSize = last - start;

                if(size > currentSize){
                    answer[0] = start;
                    answer[1] = last;
                    size = currentSize;
                }
            }

            if(start == length && last == length) break;

            if(sum <= k && last < length){
                last += 1;
                if(last < length) sum += sequence[last];
            } else {
                if(start < length) sum -= sequence[start];
                start += 1;
            }
        }

        return answer;
    }
}
