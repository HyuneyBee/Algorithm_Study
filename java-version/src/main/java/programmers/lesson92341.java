package programmers;

import java.time.Duration;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;


public class lesson92341 {
    public int[] solution(int[] fees, String[] records) {
        Map<String, String> inMap = new HashMap<>();
        Map<String, Integer> timeMap = new HashMap<>();
        Map<String, Integer> resultMap = new HashMap<>();
        LocalTime lastTime = LocalTime.parse("23:59");

        int dTime = fees[0];
        int dPay = fees[1];
        int uTime = fees[2];
        int uPay = fees[3];

        for(String r: records){
            String[] s = r.split(" ");
            if(s[2].equals("IN")){
                inMap.put(s[1], s[0]);
            }else{
                LocalTime inTime = LocalTime.parse(inMap.get(s[1]));
                LocalTime outTime = LocalTime.parse(s[0]);

                long diffMinute = Duration.between(inTime, outTime).toMinutes();

                Integer time = timeMap.computeIfAbsent(s[1], v -> 0);
                timeMap.put(s[1], time + (int) diffMinute);
                inMap.remove(s[1]);
            }
        }

        for(String k: inMap.keySet()){
            LocalTime inTime = LocalTime.parse(inMap.get(k));

            long diffMinute = Duration.between(inTime, lastTime).toMinutes();
            Integer time = timeMap.computeIfAbsent(k, v -> 0);
            timeMap.put(k, time + (int) diffMinute);
        }

        for(String k: timeMap.keySet()){
            double totalParkingTime = (double) timeMap.get(k);
            if(totalParkingTime >= dTime){
                int result = (int) (dPay + Math.ceil((totalParkingTime - dTime) / uTime) * uPay);
                resultMap.put(k, result);
            } else {
                resultMap.put(k, dPay);
            }
        }

        return resultMap.keySet().stream()
            .sorted()
            .mapToInt(resultMap::get)
            .toArray();
    }
}
