package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class problem1018 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nm = br.readLine().split(" ");
        String[] orgBoard = {"WBWBWBWB", "BWBWBWBW"};
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);
        String[] board = new String[n];

        for(int i=0; i<n; i++){
            board[i] = br.readLine().strip();
        }
        int min = Integer.MAX_VALUE;
        for(int i=0; i<=n-8; i++){
            for(int j=0; j<=m-8; j++){

                int count = 0;
                for(int x=0; x<8; x++){
                    int row = x + i;
                    for(int y=0; y<8; y++){
                        int col = y + j;
                        if(board[row].charAt(col) != orgBoard[row % 2].charAt(y)) count++;
                    }
                }
                count = Math.min(count, 64 - count);
                if(count < min) min = count;
            }
        }
        System.out.println(min);
    }
}
