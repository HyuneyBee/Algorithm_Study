package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class baekjoon1063 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List<String> chessOrder = List.of("", "A", "B", "C", "D", "E", "F", "G", "H");
        Map<String, List<Integer>> map = new HashMap<>();
        map.put("R", List.of(0,1));
        map.put("L", List.of(0,-1));
        map.put("B", List.of(-1,0));
        map.put("T", List.of(1,0));
        map.put("RT", List.of(1,1));
        map.put("LT", List.of(1,-1));
        map.put("RB", List.of(-1,1));
        map.put("LB", List.of(-1,-1));

        String[][] chessBoard = new String[9][9];

        for(int i = 1; i < 9; i++){
            for(int j = 1; j < 9; j++){
                chessBoard[i][j] = chessOrder.get(j) + i;
            }
        }

        String[] input = br.readLine().split(" ");
        String kingValue = input[0];
        String stoneValue = input[1];
        int n = Integer.parseInt(input[2]);

        int[] king = new int[2];
        int[] stone = new int[2];

        for(int i = 1; i < 9; i++){
            for(int j = 1; j < 9; j++){
                if(chessBoard[i][j].equals(kingValue)){
                    king[0] = i;
                    king[1] = j;
                }

                if(chessBoard[i][j].equals(stoneValue)){
                    stone[0] = i;
                    stone[1] = j;
                }
            }
        }

        for(int i = 0; i < n; i++){
            String v = br.readLine();
            int[] nextKing = new int[2];
            List<Integer> vMap = map.get(v);
            nextKing[0] = king[0] + vMap.get(0);
            nextKing[1] = king[1] + vMap.get(1);

            if(nextKing[0] > 0 && nextKing[0] < 9 && nextKing[1] > 0 && nextKing[1] < 9){
                if(nextKing[0] == stone[0] && nextKing[1] == stone[1]){
                    int[] nextStone = new int[2];
                    nextStone[0] = stone[0] + vMap.get(0);
                    nextStone[1] = stone[1] + vMap.get(1);
                    if(nextStone[0] > 0 && nextStone[0] < 9 && nextStone[1] > 0 && nextStone[1] < 9){
                        stone[0] = nextStone[0];
                        stone[1] = nextStone[1];
                        king[0] = nextKing[0];
                        king[1] = nextKing[1];
                    }
                } else {
                    king[0] = nextKing[0];
                    king[1] = nextKing[1];
                }
            }
        }

        System.out.println(chessBoard[king[0]][king[1]]);
        System.out.println(chessBoard[stone[0]][stone[1]]);
    }
}
