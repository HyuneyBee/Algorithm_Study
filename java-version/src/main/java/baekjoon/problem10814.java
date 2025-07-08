package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class problem10814 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        List<Member> list = new ArrayList<>();

        for(int i=0; i<n; i++){
            String[] ageName = br.readLine().split(" ");
            list.add(new Member(Integer.parseInt(ageName[0]), ageName[1].strip()));
        }

        list.sort(Comparator.comparingInt(value -> value.age));

        for(Member m : list){
            System.out.println(m.age + " " +m.name);
        }
    }

    static class Member{
        int age;
        String name;

        public Member(int age, String name) {
            this.age = age;
            this.name = name;
        }
    }
}
