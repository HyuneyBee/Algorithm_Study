package programmers;

public class lessons43165 {
    private int[] numbersArray;
    private int targetValue;
    private int result = 0;
    private int numbersLength;

    private void bfs(int value, int index) {
        if(numbersLength-1 == index){
            if(targetValue == value){
                result += 1;
            }
            return;
        }
        index += 1;

        bfs(value - numbersArray[index], index);
        bfs(value + numbersArray[index], index);
    }

    public int solution(int[] numbers, int target) {
        this.numbersArray = numbers;
        this.targetValue = target;
        this.numbersLength = numbers.length;

        int index = -1;
        bfs(0, index);

        return result;
    }
}
