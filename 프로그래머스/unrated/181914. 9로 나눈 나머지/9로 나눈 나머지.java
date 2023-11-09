class Solution {
    public int solution(String number) {
        int answer = 0;
        int tmp = 0;
        String[] arr = number.split("");
        
        for(String e : arr) {
            tmp += Integer.parseInt(e);
        }
        
        answer = tmp % 9;
        return answer;
    }
}