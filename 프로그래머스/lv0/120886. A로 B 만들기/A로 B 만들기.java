import java.util.*;

class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        int count = 0;
        String[] a = before.split("");
        String[] b = after.split("");
        
        Arrays.sort(a);
        Arrays.sort(b);
        
        for(int i = 0; i < a.length; i++) {
            if(a[i].equals(b[i])) {
                count++;
            }
            
            if(count == a.length) {
                answer = 1;
            } else answer = 0;
        }
        
        return answer;
    }
}