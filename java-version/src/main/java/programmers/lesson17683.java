package programmers;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class lesson17683 {
    private static final SimpleDateFormat format = new SimpleDateFormat("HH:mm");

    public String solution(String m, String[] musicinfos) {
        String answer = "(None)";
        int maxPlayTime = 0;

        m = changeMelody(m);
        for(String s: musicinfos){
            StringBuilder sb = new StringBuilder();

            String[] value = s.split(",");
            int diffTime = getDiffTime(value[0], value[1]);
            value[3] = changeMelody(value[3]);

            if(diffTime > value[3].length()){
                for(int i=0; i<diffTime; i++){
                    sb.append(value[3].charAt(i % value[3].length()));
                }
            } else {
                sb.append(value[3].substring(0, diffTime));
            }

            if(sb.toString().contains(m) && diffTime > maxPlayTime){
                answer = value[2];
                maxPlayTime = diffTime;
            }
        }

        return answer;
    }

    private int getDiffTime(String startTime, String endTime) {
        try{
            Date date1 = format.parse(startTime);
            Date date2 = format.parse(endTime);
            long diff = (date2.getTime() - date1.getTime()) / 60000;
            return Long.valueOf(diff).intValue();
        } catch (ParseException e){
            throw new RuntimeException();
        }
    }

    private String changeMelody(String oldMelody) {
        oldMelody = oldMelody.replaceAll("C#", "H");
        oldMelody = oldMelody.replaceAll("D#", "I");
        oldMelody = oldMelody.replaceAll("F#", "J");
        oldMelody = oldMelody.replaceAll("G#", "K");
        String newMelody = oldMelody.replaceAll("A#", "L");

        return newMelody;
    }
}
