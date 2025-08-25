package leetcode;

public class leetcode121_1 {
    public int maxProfit(int[] prices) {
        int answer = 0;

        int min = prices[0];

        for(int i = 1; i<prices.length; i++){
            if(prices[i] - min >= 0 && answer < prices[i] - min){
                answer = prices[i] - min;
            }
            if(prices[i] < min){
                min = prices[i];
            }
        }

        return answer;
    }
}
