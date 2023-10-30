class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String sum = "" + a + b;
        int sum2 = Integer.parseInt(sum);
        int mul = 2 * a * b;
        
        if(sum2 > mul) {
            answer = sum2;
        } else if(sum2 == mul) {
            answer = sum2;
        } else answer = mul;
        
        return answer;
    }
}