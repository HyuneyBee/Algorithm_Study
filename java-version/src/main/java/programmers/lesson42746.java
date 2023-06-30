package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class lesson42746 {
    public String solution(int[] numbers) {
        StringBuilder sb = new StringBuilder();
        String[] strArr = new String[numbers.length];

        for(int i=0; i< numbers.length; i++){
            strArr[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(strArr, (s1, s2) -> {
            return (s2+s1).compareTo(s1+s2);
        });

        if(strArr[0].equals("0")) return "0";

        for(String s: strArr){
            sb.append(s);
        }

        return sb.toString();
    }
}
