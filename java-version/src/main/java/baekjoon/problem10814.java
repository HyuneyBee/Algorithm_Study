package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class problem10814 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        PriorityQueue<Member> queue = new PriorityQueue<>();

        for(int i=0; i<n; i++){
            String[] ageName = br.readLine().split(" ");
            queue.add(new Member(Integer.parseInt(ageName[0]), ageName[1].strip()));
        }

        for(int i=0; i<n; i++){
            Member m = queue.poll();
            System.out.println(m.age + " " +m.name);
        }
    }

    static class Member implements Comparable<Member>{
        int age;
        String name;

        public Member(int age, String name) {
            this.age = age;
            this.name = name;
        }

        @Override
        public int compareTo(Member o) {
            return Integer.compare(this.age, o.age);
        }
    }
}
