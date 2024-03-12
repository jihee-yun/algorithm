class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        
        String tempString = myString.toLowerCase();
        String tempPat = pat.toLowerCase();
        
        if(tempString.contains(tempPat)) {
            answer = 1;
        }
        
        return answer;
    }
}