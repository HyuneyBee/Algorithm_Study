package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;
import java.util.Stack;

public class leetcode394 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] input = br.readLine().toCharArray();

        Stack st = new Stack();

        StringBuilder result = new StringBuilder();

        for(char c : input){
            if(Character.isDigit(c)){
                st.push(c - 48);
            }

            if(c != ']' && Character.isLetter(c) && st.isEmpty()){
                result.append(c);
            }

            if(!st.isEmpty() && c != ']' && !Character.isDigit(c)){
                st.push(c);
            }

            if(c == ']'){
                StringBuilder sv = new StringBuilder();

                while(!st.isEmpty()){
                    String value = String.valueOf(st.pop());
                    if(!Objects.equals(value, "[")){
                        sv.insert(0, value);
                    } else {
                        break;
                    }
                }

                StringBuilder sInt = new StringBuilder();

                while(!st.isEmpty()){
                    Object peek = st.peek();
                    if(peek instanceof Integer){
                        sInt.insert(0, peek);
                        st.pop();
                    } else {
                        break;
                    }
                }
                int n = Integer.parseInt(sInt.toString());
                String origin = sv.toString();
                for(int i = 0; i<n-1; i++){
                    sv.append(origin);
                }

                if(st.isEmpty()){
                    result.append(sv);
                } else {
                    st.push(sv);
                }
            }
        }
        System.out.println(result);
    }
}
