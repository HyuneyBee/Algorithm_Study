package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class baekjoon2980 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] insert = br.readLine().split(" ");

        int n = Integer.parseInt(insert[0]);
        int arrive = Integer.parseInt(insert[1]);

        Map<Integer, int[]> signMap = new HashMap<>();

        Integer time = 0;
        Integer position = 0;

        for(int i = 0; i < n; i++){
            String[] input = br.readLine().split(" ");
            int D = Integer.parseInt(input[0]);
            int G = Integer.parseInt(input[1]);
            int R = Integer.parseInt(input[2]);

            time += D - position;
            position = D;

            int cycle = time % (G + R);
            if(cycle < G){
                time += G - cycle;
            }
        }

        time += arrive - position;

        System.out.println(time);
    }
}
