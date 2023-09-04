package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class problem1620 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nm = br.readLine().split(" ");

        Map<String, Integer> nameMap = new HashMap<>();
        Map<Integer,String> numberMap = new HashMap<>();

        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);

        for(int i = 1; i <= n; i++){
            String name = br.readLine().strip();
            nameMap.put(name, i);
            numberMap.put(i, name);
        }

        for(int i=0; i<m; i++){
            String value = br.readLine().strip();
            if(Character.isDigit(value.charAt(0))){
                System.out.println(numberMap.get(Integer.parseInt(value)));
            } else {
                System.out.println(nameMap.get(value));
            }
        }
    }
}
