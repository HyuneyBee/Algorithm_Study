package programmers;

import java.util.*;

public class lesson72411 {
    List<String> answerList = new ArrayList<>();
    Map<String ,Integer> stringMap = new HashMap<>();

    public String[] solution(String[] orders, int[] course) {

        for(int i=0; i<orders.length; i++){
            char[] chars = orders[i].toCharArray();
            Arrays.sort(chars);
            orders[i] = String.valueOf(chars);
        }

        for(int c: course){
            for(String o: orders) {
                createAllStringOrder("", o, c);
            }

            if(!stringMap.isEmpty()){
                List<Integer> valueList = new ArrayList<>(stringMap.values());
                int max = Collections.max(valueList);

                if(max > 1){
                    for(String key: stringMap.keySet()){
                        if(stringMap.get(key) == max){
                            answerList.add(key);
                        }
                    }
                }
                stringMap.clear();
            }
        }


        Collections.sort(answerList);
        String[] answer = new String[answerList.size()];
        for(int i=0; i<answerList.size(); i++){
            answer[i] = answerList.get(i);
        }

        return answer;
    }

    private void createAllStringOrder(String create, String order, Integer count){
        if(count == 0) stringMap.put(create, stringMap.getOrDefault(create, 0) + 1);

        for(int i=0; i<order.length(); i++){
            createAllStringOrder(create + order.charAt(i), order.substring(i+1), count - 1);
        }
    }
}
