public class Solution {
    public int solution(int a, int b) {
        // a와 b가 모두 홀수인지 확인
        boolean bothOdd = (a % 2 == 1) && (b % 2 == 1);
        // a와 b 중 하나만 홀수인지 확인
        boolean oneOdd = (a % 2 == 1) || (b % 2 == 1);
        
        // 얻는 점수 계산
        int score;
        if (bothOdd) {
            score = a * a + b * b;
        } else if (oneOdd) {
            score = 2 * (a + b);
        } else {
            score = Math.abs(a - b);
        }
        
        return score;
    }
}
