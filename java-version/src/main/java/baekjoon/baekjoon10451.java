package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon10451 {
    public static int count = 0;
    public static void main(String[] args) throws IOException {
        //input
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        int[][] valueArray = new int[t][1001];
        int[][] checkArray = new int[t][1001];

        for(int i = 0; i<t; i++) {
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());

            int[] arr = new int[n+1];
            for(int j = 1; j < arr.length; j++){
                arr[j] = Integer.parseInt(st.nextToken());
            }
            valueArray[i] = arr;
        }

        for(int i = 0; i<t; i++) {
            int[] arr = valueArray[i];
            int[] check = checkArray[i];
            for(int j = 1; j < arr.length; j++){
                if(check[j] == 0){
                    count = count + dfs(j, arr, check);
                }
            }
            System.out.println(count);
            count = 0;
        }
    }

    public static int dfs(int index, int[] valueArray, int[] checkArray){
        if(checkArray[index] == 1){
            return 1;
        }
        checkArray[index] = 1;
        return dfs(valueArray[index], valueArray, checkArray);
    }
}
