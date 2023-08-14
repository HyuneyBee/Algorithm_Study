package programmers;

public class lesson62048 {
    public long solution(int w, int h) {
        int gcd = getGcd(w, h);

        return ((long) w * h) - (((w / gcd) + (h / gcd) - 1) * gcd);
    }

    private int getGcd(int a, int b){
        if(a % b == 0) return b;
        return getGcd(b, a % b);
    }
}
