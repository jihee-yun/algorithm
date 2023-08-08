class Solution {
    public int solution(int n, int t) {
        int answer = 0;
        double result = Math.pow(2, t);
        answer = (int) (n * result);
        return answer;
    }
}