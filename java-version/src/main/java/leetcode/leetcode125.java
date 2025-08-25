package leetcode;

public class leetcode125 {
    public boolean isPalindrome(String s) {
        boolean answer = true;
        s = s.trim();
        s = s.toLowerCase();

        if(s.isEmpty()) return answer;

        int start = 0;
        int end = s.length() - 1;

        char[] charArray = s.toCharArray();

        while (start < end){
            char startCharacter = charArray[start];
            char endCharacter = charArray[end];

            if(!Character.isAlphabetic(startCharacter) && !Character.isDigit(startCharacter)){
                start++;
            } else if (!Character.isAlphabetic(endCharacter) && !Character.isDigit(endCharacter)) {
                end--;
            } else {
                if(startCharacter != endCharacter){
                    answer = false;
                    break;
                }
                start++;
                end--;
            }

        }
        return answer;
    }
}
