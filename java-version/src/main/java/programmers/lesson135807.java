package programmers;

public class lesson135807 {
    public int solution(int[] arrayA, int[] arrayB) {
        int answer = 0;
        int valueA = 0;
        int valueB = 0;
        int gcdA = arrayA[0];
        int gcdB = arrayB[0];

        for(int i=1; i<arrayA.length; i++){
            gcdA = getGcd(gcdA, arrayA[i]);
            gcdB = getGcd(gcdB, arrayB[i]);
        }

        if(notDivision(arrayB, gcdA)){
            valueA = gcdA;
        }

        if(notDivision(arrayA, gcdB)){
            valueB = gcdB;
        }

        answer = Math.max(valueA, valueB);
        return answer;
    }

    private int getGcd(int a, int b){
        if(a % b == 0) return b;
        return getGcd(b, a % b);
    }

    private boolean notDivision(int[] array, int b){
        for(int a : array){
            if(a % b == 0) return false;
        }
        return true;
    }
}
