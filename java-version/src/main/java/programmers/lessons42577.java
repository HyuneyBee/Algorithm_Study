package programmers;

import java.util.Arrays;
import java.util.HashMap;

public class lessons42577 {
    public boolean solution(String[] phone_book) {
        HashMap<String, Boolean> numberMap = new HashMap<>();
        Arrays.sort(phone_book, (String s1, String s2) -> s1.length() - s2.length());
        boolean answer = true;

        for(String number: phone_book){
            StringBuilder phone = new StringBuilder();
            for(char c: number.toCharArray()){
                phone.append(c);
                if(numberMap.containsKey(phone.toString())){
                    answer = false;
                    break;
                }
            }
            numberMap.put(number, true);
            if(!answer){
                break;
            }
        }
        return answer;
    }
}
