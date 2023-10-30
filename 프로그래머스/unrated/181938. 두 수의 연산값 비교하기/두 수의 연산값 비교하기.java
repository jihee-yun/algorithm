class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String sum = "" + a + b;
        int sum2 = Integer.parseInt(sum);
        
        if(sum2 >= 2 * a * b) {
            answer = sum2;
        } else answer = 2 * a * b;
        
        return answer;
    }
}