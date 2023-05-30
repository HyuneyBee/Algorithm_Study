package programmers;

public class lesson12900 {
    class Solution {
        public int solution(int n) {
            int[] resultArray = new int[n];

            if(n > 2){
                resultArray[0] = 1;
                resultArray[1] = 2;

                for(int i=2; i<n; i++){
                    resultArray[i] = (resultArray[i-1] + resultArray[i-2]) % 1000000007;
                }

            } else {
                return n;
            }

            return resultArray[n-1];
        }
    }
}
