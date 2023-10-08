class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int a = 0;
        int b = 0;
        int cnt = 0;
        
        if(sides[0] > sides[1]) {
            a = sides[0];
            b = sides[1];
        } else {
            a = sides[1];
            b = sides[0];
        }
        
        for (int i = 1; i <= 2000; i++) {
        if ((i <= a && i + b > a) || (i > a && i < a + b)) {
            cnt++;
            }
        }

        
        return answer = cnt;
    }
}