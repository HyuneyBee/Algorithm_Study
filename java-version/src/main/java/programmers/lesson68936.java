package programmers;

public class lesson68936 {
    private int[] answer = new int[2];

    public int[] solution(int[][] arr) {

        int totalSize = arr[0].length;

        dp(0, 0, totalSize, arr);
        return answer;
    }

    private void dp(int x, int y, int size, int[][] arr){
        if(check(x, y, size, arr)){
            answer[arr[x][y]] += 1;
            return;
        }

        dp(x, y, size / 2, arr);
        dp(x + size / 2, y, size / 2, arr);
        dp(x, y + size / 2, size / 2, arr);
        dp(x + size / 2, y + size / 2, size / 2, arr);
    }

    private boolean check(int x, int y, int size, int[][] arr){
        for(int i = x; i< x + size; i++){
            for(int j = y; j < y + size; j++){
                if(arr[x][y] != arr[i][j]) return false;
            }
        }
        return true;
    }
}
