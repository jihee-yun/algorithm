class Solution {
    public int solution(int num, int k) {
        int answer = -1;
        String a = num + "";
        char b = (char)(k + '0');
         
        for(int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            if(c == b) {
                answer = i+1;
                break;
            }
        }
        
        return answer;
    }
}