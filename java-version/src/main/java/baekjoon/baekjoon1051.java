package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon1051 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);

        if(n == 1 || m == 1){
            System.out.println(1);
            return;
        }
        int[][] map = new int[n][m];

        for(int i = 0; i < n; i++) {
            char[] charArray = br.readLine().toCharArray();
            for(int j = 0; j < charArray.length; j++){
                map[i][j] = (int) charArray[j] - 48;
            }
        }

        int max = 1;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                int currentValue = map[i][j];
                for(int z = m - 1; z > j; z--){
                  if(currentValue == map[i][z]){
                      int next = z - j;
                      if(i + next < n){
                          if((map[i][z] == map[next + i][j]) && (map[next + i][j] == map[next + i][z])){
                              int result = z - j + 1;
                              if(result > max){
                                  max = result;
                              }
                          }
                      }
                  }
                }
            }
        }

        System.out.println(max * max);
    }
}
