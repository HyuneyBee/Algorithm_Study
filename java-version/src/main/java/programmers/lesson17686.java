package programmers;
import java.util.*;
public class lesson17686 {
    public String[] solution(String[] files) {
        Arrays.sort(files, (s1, s2) -> {
            String s1Head = s1.split("[0-9]")[0].toLowerCase();
            String s2Head = s2.split("[0-9]")[0].toLowerCase();
            int compareHead = s1Head.compareTo(s2Head);

            if(compareHead == 0){
                String s1SliceHead = s1.substring(s1Head.length());
                String s2SliceHead = s2.substring(s2Head.length());
                return calcNumber(s1SliceHead) - calcNumber(s2SliceHead);
            } else {
                return compareHead;
            }
        });
        return files;
    }

    private Integer calcNumber(String sliceHaed){
        StringBuilder sb = new StringBuilder();

        for(char c: sliceHaed.toCharArray()){
            if(Character.isDigit(c) && sb.length() < 5){
                sb.append(c);
            } else {
                break;
            }
        }

        return Integer.parseInt(sb.toString());
    }
}
