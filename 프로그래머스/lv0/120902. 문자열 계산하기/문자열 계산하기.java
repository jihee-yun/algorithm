class Solution {
    public int solution(String my_string) {
        String[] tokens = my_string.split(" ");
        int answer = 0;
        int sign = 1;
        
        for (String token : tokens) {
            if (token.equals("+")) {
                sign = 1;
            } else if (token.equals("-")) {
                sign = -1;
            } else {
                answer += sign * Integer.parseInt(token);
            }
        }
        return answer;
    }
}