package programmers;

import java.util.*;

public class lesson67257 {

    List<String[]> orderList = new ArrayList<>();
    boolean[] visited = new boolean[3];
    String[] operators = new String[]{"*", "+", "-"};

    public long solution(String expression) {
        List<Long> answerList = new ArrayList<>();
        List<String> stringList = new ArrayList<>();

        StringTokenizer st = new StringTokenizer(expression, "*-+", true);
        while (st.hasMoreTokens()){
            stringList.add(st.nextToken());
        }

        OrderOperator(new StringBuilder());

        for (String[] strings : orderList) {
            List<String> copyList = new ArrayList<>(stringList);
            for (int k = 0; k < 3; k++) {
                for (int j = 0; j < copyList.size(); j++) {
                    if (Objects.equals(strings[k], copyList.get(j))) {
                        copyList.set(j - 1, calcValue(copyList.get(j - 1), copyList.get(j + 1), copyList.get(j)));
                        copyList.remove(j);
                        copyList.remove(j);
                        j--;
                    }
                }
            }
            answerList.add(Math.abs(Long.parseLong(copyList.get(0))));
        }

        return Collections.max(answerList);
    }

    private String calcValue(String num1, String num2, String op){
        long value = 0;
        if(Objects.equals(op, "*")){
            value += Long.parseLong(num1) * Long.parseLong(num2);
        } else if(Objects.equals(op, "+")){
            value += Long.parseLong(num1) + Long.parseLong(num2);
        } else {
            value += Long.parseLong(num1) - Long.parseLong(num2);
        }

        return String.valueOf(value);
    }

    private void OrderOperator(StringBuilder operatorOrder){
        if(operatorOrder.length() == 3){
            orderList.add(operatorOrder.toString().split(""));
            return;
        }

        for(int i=0; i<operators.length; i++){
            if(!visited[i]){
                visited[i] = true;
                operatorOrder.append(operators[i]);
                OrderOperator(operatorOrder);
                operatorOrder.deleteCharAt(operatorOrder.length()-1);
                visited[i] = false;
            }
        }
    }
}
