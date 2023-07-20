package programmers;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class lesson17683 {
    private static final SimpleDateFormat format = new SimpleDateFormat("HH:mm");

    public String solution(String m, String[] musicinfos) {
        String answer = "";

        for(String s: musicinfos){
            StringBuilder sb = new StringBuilder();

            String[] value = s.split(",");
            int diffTime = getDiffTime(value[0], value[1]);

            for(int i=0; i<diffTime; i++){

            }
        }

        return answer;
    }

    private int getDiffTime(String startTime, String endTime) {
        try{
            Date date1 = format.parse(startTime);
            Date date2 = format.parse(endTime);
            long diff = date2.getTime() - date1.getTime();
            return Long.valueOf(diff).intValue();
        } catch (ParseException e){
            throw new RuntimeException();
        }

    }
}
