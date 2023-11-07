import java.util.*;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        
        int tmp = n;
        list.add(n);
        
        while(tmp != 1) {
            if(tmp % 2 == 0) {
                tmp = tmp / 2;
                list.add(tmp);
            } else {
                tmp = 3 * tmp + 1;
                list.add(tmp);
            }
        }
        
        int[] answer = new int[list.size()];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
    
        return answer;
    }
}