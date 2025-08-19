package leetcode;

public class leetcode121 {
    public int maxProfit(int[] prices) {
        if(prices.length == 1) return 0;

        int max = Integer.MIN_VALUE;
        int answer = 0;

        int min = prices[0];
        for(int i = 1; i < prices.length; i++){
            if(min < prices[i]){
                int result = prices[i] - min;
                if(result > max){
                    max = result;
                    answer = max;
                }
            } else {
                if(min > prices[i]){
                    min = prices[i];
                }
            }
        }

        return answer;
    }
}
