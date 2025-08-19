package leetcode;

public class leetcode167 {
    public int[] twoSum(int[] numbers, int target) {
        int[] answer = new int[2];

        int start = 0;
        int end = numbers.length - 1;

        while (start < end){
            if(numbers[start] + numbers[end] > target){
                end -= 1;
            } else if (numbers[start] + numbers[end] < target) {
                start += 1;
            } else {
                answer[0] = start + 1;
                answer[1] = end + 1;
                break;
            }
        }

        return answer;
    }
}
