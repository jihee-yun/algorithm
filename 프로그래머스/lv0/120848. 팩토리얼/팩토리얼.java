class Solution {
    public int solution(int n) {
        int answer = 1;
        int count = 1;
        while(answer <= n) {
            count++;
            answer *= count;
            
        }
        return count - 1;
    }
}