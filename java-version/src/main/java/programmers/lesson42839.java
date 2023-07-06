package programmers;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.stream.IntStream;

public class lesson42839 {
    List<Boolean> visited = new ArrayList<>();
    List<Character> paper = new ArrayList<>();
    HashSet<Integer> hset = new HashSet<>();

    public int solution(String numbers) {
        init(numbers);
        bfs("", 0);
        return hset.size();
    }

    private void bfs(String str, int index){
        if(str != ""){
            int num = Integer.parseInt(str);
            if(isPrime(num)) hset.add(num);
        }

        if(index == paper.size()) return;

        for(int i=0; i<paper.size(); i++){
            if(visited.get(i)) continue;
            visited.set(i, true);
            bfs(str + paper.get(i), index+1);
            visited.set(i, false);
        }
    }

    private void init(String number){
        IntStream.range(0, number.length()).forEach(i -> {
            visited.add(false);
        });

        for(char c : number.toCharArray()){
            paper.add(c);
        }
    }

    public boolean isPrime(int num){
        if(num==0||num==1) return false;
        for(int i=2; i*i<=num;i++){
            if(num%i==0) return false;
        }
        return true;
    }
}
