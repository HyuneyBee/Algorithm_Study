package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon10798 {
    public static void main(String[] args) throws IOException {
        String[][] board = new String[5][15];

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for(int i = 0; i<5; i++){
            String[] split = br.readLine().split("");
            for(int j =0; j< split.length; j++){
                board[i][j] = split[j];
            }
        }

        StringBuilder s = new StringBuilder();
        for(int i = 0; i<15; i++){
            for(int j = 0; j<5; j++){
                if(board[j][i] != null){
                    s.append(board[j][i]);
                }
            }
        }

        System.out.println(s.toString());
    }
}
