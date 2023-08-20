import java.util.Arrays;

class Solution {
    public int[] solution(String my_string) {
        String[] arr = my_string.split("");
        int count = 0;
        for(int i = 0; i < arr.length; i++) {
            char c = arr[i].charAt(0);
        if('0' <= c && c <= '9')
            count++;
        }
        
        int[] answer = new int[count];
        int index = 0;
        for(int i = 0; i < arr.length; i++) {
            char c = arr[i].charAt(0);
        if('0' <= c && c <= '9') {
            answer[index] = Character.getNumericValue(c);
            index++;
            }
        }
        
        Arrays.sort(answer);
              
        return answer;
    }
}