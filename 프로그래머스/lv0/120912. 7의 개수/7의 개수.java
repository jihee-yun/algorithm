import java.util.*;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        for (int num : array) {
            String numStr = String.valueOf(num); 
            for (char digit : numStr.toCharArray()) {
                if (digit == '7') {
                    answer++;
                }
            }
        }
        
        return answer;
    }
}