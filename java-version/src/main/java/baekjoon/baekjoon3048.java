package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class baekjoon3048 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");

        Map<String, String> antMap = new HashMap<>();

        int first = Integer.parseInt(input[0]);
        int second = Integer.parseInt(input[1]);

        String[] antList = new String[first + second];

        char[] firstAnt = br.readLine().toCharArray();

        for(int i = firstAnt.length - 1; i >= 0; i--){
            char c = firstAnt[i];
            antList[firstAnt.length - i - 1] = String.valueOf(c);
            antMap.put(String.valueOf(c), "R");
        }

        char[] secondAnt = br.readLine().toCharArray();

        for(int i = firstAnt.length; i < first + second; i++){
            char c = secondAnt[i - firstAnt.length];
            antList[i] = String.valueOf(c);
            antMap.put(String.valueOf(c), "L");
        }

        int t = Integer.parseInt(br.readLine());

        for(int i = 0; i < t; i++){
            int index = 0;
            while (index < (first + second)){
                String currentAnt = antList[index];
                if(index + 1 >= (first + second)){
                    break;
                }
                String nextAnt = antList[index + 1];

                if (antMap.get(currentAnt).equals("R") && antMap.get(nextAnt).equals("L")) {
                    String temp = nextAnt;
                    antList[index + 1] = currentAnt;
                    antList[index] = temp;
                    index += 2; // 건너뛰기
                } else {
                    index += 1;
                }
            }
        }

        System.out.println(String.join("", antList));
    }
}
