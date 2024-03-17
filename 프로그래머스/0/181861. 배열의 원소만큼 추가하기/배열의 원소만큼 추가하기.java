import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> result = new ArrayList<>();
        
        for(int i = 0; i < arr.length; i++) {
            int value = arr[i];
            for(int j = 0; j < value; j++) {
                result.add(value);
            }
        }
        
        int[] answer = new int[result.size()];
        
        for(int i = 0; i < answer.length; i++) {
            answer[i] = result.get(i);
        }
        
        return answer;
    }
}