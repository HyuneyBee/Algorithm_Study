package programmers;

public class lesson77485 {
    public int[] solution(int rows, int columns, int[][] queries) {
        int[][] square = new int[rows][columns];
        int[] answer = new int[queries.length];

        int value = 1;
        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                square[i][j] = value;
                value++;
            }
        }
        int minIndex = 0;

        for(int[] q: queries){
            int x1 = q[0] - 1;
            int y1 = q[1] - 1;
            int x2 = q[2] - 1;
            int y2 = q[3] - 1;

            int firstNum = square[x1][y2];
            int minValue = firstNum;

            for(int i=y2-1; i>=y1; i--){
                minValue = Math.min(minValue, square[x1][i]);
                square[x1][i+1] = square[x1][i];
            }

            for(int i=x1+1; i<=x2; i++){
                minValue = Math.min(minValue, square[i][y1]);
                square[i-1][y1] = square[i][y1];
            }

            for(int i=y1+1; i<=y2; i++){
                minValue = Math.min(minValue, square[x2][i]);
                square[x2][i-1] = square[x2][i];
            }

            for(int i=x2-1; i>=x1; i--){
                minValue = Math.min(minValue, square[i][y2]);
                square[i+1][y2] = square[i][y2];
            }

            square[x1+1][y2] = firstNum;
            answer[minIndex] = minValue;
            minIndex++;
        }


        return answer;
    }
}
