package programmers;

import java.util.HashMap;

public class lesson131127 {

    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        int start = 0;
        int end = 9;

        int length = want.length;
        int discountLength = discount.length;

        HashMap<String, Integer> hyunProductMap = new HashMap<>();
        HashMap<String, Integer> discountProductMap = new HashMap<>();

        for(int i=0; i<length; i++){
            hyunProductMap.put(want[i], number[i]);
        }

        for(int i=start; i<=end; i++){
            if(discountProductMap.containsKey(discount[i])){
                int productTotal = discountProductMap.get(discount[i]);
                discountProductMap.put(discount[i], productTotal + 1);
            } else{
                discountProductMap.put(discount[i], 1);
            }
        }

        while (true){
            int cnt = 0;

            for(String key: hyunProductMap.keySet()){
                if(discountProductMap.containsKey(key) &&
                    hyunProductMap.get(key) <= discountProductMap.get(key)){
                    cnt += 1;
                }
            }

            if(cnt == length){
                answer += 1;
            }

            start += 1;
            end += 1;

            if(discountLength == end){
                break;
            }

            Integer startProductValue = discountProductMap.get(discount[start-1]);
            discountProductMap.put(discount[start-1], startProductValue - 1);

            if(discountProductMap.containsKey(discount[end])){
                Integer endProductValue = discountProductMap.get(discount[end]);
                discountProductMap.put(discount[end], endProductValue + 1);
            } else {
                discountProductMap.put(discount[end], 1);
            }

        }
        return answer;
    }
}
