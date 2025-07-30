package programmers;

import java.util.HashMap;
import java.util.Map;

public class lesson387 {
    public int firstUniqChar(String s) {
        Map<String, Node> stringMap = new HashMap<>();

        String[] split = s.split("");

        for(int i = 0; i < split.length; i++){
            if(stringMap.getOrDefault(split[i], null) != null){
                Node node = stringMap.get(split[i]);
                node.countUp();
            } else {
                stringMap.put(split[i], new Node(i, 0));
            }
        }
        int answer = -1;
        int min = Integer.MAX_VALUE;
        for(Node node : stringMap.values()){
            if(node.count == 0){
                if(node.index < min){
                    answer = node.index;
                    min = node.index;
                }
            }
        }

        return answer;
    }

    public class Node{
        private int index;
        private int count;

        public Node(int index, int count) {
            this.index = index;
            this.count = count;
        }

        public void countUp(){
            this.count += 1;
        }
    }
}


