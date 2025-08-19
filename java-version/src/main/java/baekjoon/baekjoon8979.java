package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class baekjoon8979 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");

        int n = Integer.parseInt(input[0]);
        int r = Integer.parseInt(input[1]);

        List<Node> nodeList = new ArrayList<>();

        for(int i = 0; i<n; i++){
            String[] value = br.readLine().split(" ");
            int key = Integer.parseInt(value[0]);
            int g = Integer.parseInt(value[1]);
            int s = Integer.parseInt(value[2]);
            int b = Integer.parseInt(value[3]);

            nodeList.add(new Node(key, g, s, b, 0));
        }

        nodeList.sort((a, b) ->{
            if(b.gold != a.gold) return b.gold - a.gold;
            if(b.silver != a.silver) return b.silver - a.silver;
            return b.bronze - a.bronze;
        });

        Node prev = nodeList.get(0);
        prev.rate = 1;
        int end_point = 0;
        for(int i = 1; i<n; i++){
            Node cur = nodeList.get(i);

            if(cur.key == r){
                end_point = i;
            }

            if(cur.gold == prev.gold && cur.silver == prev.silver && cur.bronze == prev.bronze){
                cur.rate = prev.rate;
            } else {
                cur.rate = i + 1;
            }
            prev = cur;
        }
        System.out.println(nodeList.get(end_point).rate);

    }
    public static class Node{
        int key, gold, silver, bronze, rate;
        Node(int key, int gold, int silver, int bronze, int rate) {
            this.key = key;
            this.gold = gold;
            this.silver = silver;
            this.bronze = bronze;
            this.rate = rate;
        }
    }
}

