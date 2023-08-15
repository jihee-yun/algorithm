class Solution {
    public int solution(int hp) {
        int answer = 0;
        int a = hp / 5;
        int b = hp % 5;
        int c = b / 3;
        int d = b % 3;
        int e = d / 1;
        answer = a + c + e;
        return answer;
    }
}