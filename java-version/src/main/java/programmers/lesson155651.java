package programmers;

import java.util.*;

public class lesson155651 {
    private static int HOUR = 60;

    public int solution(String[][] book_time) {
    int[][] time = new int[book_time.length][book_time[0].length];

    for(int i=0; i<book_time.length; i++){
        String startTime = book_time[i][0];
        String endTime = book_time[i][1];

        int startHour = Integer.parseInt(startTime.split(":")[0]);
        int startMinute = Integer.parseInt(startTime.split(":")[1]);

        int endHour = Integer.parseInt(endTime.split(":")[0]);
        int endMinute = Integer.parseInt(endTime.split(":")[1]);

        time[i][0] = startHour * HOUR + startMinute;
        time[i][1] = endHour * HOUR + (endMinute + 10);
    }

    Arrays.sort(time, (a, b) -> a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]);

    PriorityQueue<Integer> queue = new PriorityQueue<>();

    for(int[] t: time){
        if(queue.isEmpty()){
            queue.add(t[1]);
        } else if (queue.peek() <= t[0]) {
            queue.poll();
            queue.add(t[1]);
        } else {
            queue.add(t[1]);
        }
    }

    return queue.size();

    }
}
