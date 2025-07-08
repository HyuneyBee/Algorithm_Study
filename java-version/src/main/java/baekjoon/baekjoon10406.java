package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon10406 {
    public static void main(String[] args) throws IOException {
        //input
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] charArray = br.readLine().toCharArray();

        int length = charArray.length;

        int leftSum = 0;

        for(int i = 0; i < length / 2; i++){
            char c = charArray[i];
            leftSum = leftSum + (int) c;
        }

        int rightSum = 0;

        for(int i = length / 2; i < length; i++){
            char c = charArray[i];
            rightSum = rightSum + (int) c;
        }

        if(leftSum == rightSum){
            System.out.println("LUCKY");
        } else {
            System.out.println("READY");
        }
    }
}
