class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int max = 0;
        int total = 0;
        for(int i = 0; i < sides.length; i++) {
            total += sides[i];
            if(max < sides[i]) max = sides[i];
            if(max < total - max) {
                answer = 1;
            } else answer = 2;
        }
        return answer;
    }
}