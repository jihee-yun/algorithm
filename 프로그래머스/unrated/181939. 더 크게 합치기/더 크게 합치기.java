class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String sum1 = String.valueOf(a) + String.valueOf(b);
        String sum2 =  String.valueOf(b) + String.valueOf(a);
        
        int a1 = Integer.parseInt(sum1);
        int b1 = Integer.parseInt(sum2);
        
        if(a1 > b1) {
            answer = a1;
        } else if(a1 == b1) {
            answer = b1;
        } else answer = b1;
        
        return answer;
    }
}