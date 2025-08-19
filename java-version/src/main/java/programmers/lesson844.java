package programmers;

import java.util.Stack;

public class lesson844 {
    public boolean backspaceCompare(String s, String t) {
        Stack<String> Sstack = new Stack<>();
        Stack<String> Tstack = new Stack<>();

        String[] sInput = s.split("");
        String[] tInput = t.split("");

        for(String v: sInput){
            if(v.equals("#")){
                if(!Sstack.isEmpty()){
                    Sstack.pop();
                }
            } else {
                Sstack.push(v);
            }
        }
        StringBuilder sbr = new StringBuilder();

        while (!Sstack.isEmpty()){
            sbr.append(Sstack.pop());
        }

        for(String v: tInput){
            if(v.equals("#")){
                if(!Tstack.isEmpty()){
                    Tstack.pop();
                }
            } else {
                Tstack.push(v);
            }
        }

        StringBuilder tbr = new StringBuilder();
        while (!Tstack.isEmpty()){
            tbr.append(Tstack.pop());
        }


        return tbr.toString().contentEquals(sbr);
    }
}
