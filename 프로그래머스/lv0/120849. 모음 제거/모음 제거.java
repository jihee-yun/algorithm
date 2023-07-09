class Solution {
    public String solution(String my_string) {
        String answer = my_string;
        String[] keyword = {"a", "e", "i", "o", "u"};
        
        for(String r : keyword) { 
            answer = answer.replaceAll(r, "");    
        }
        return answer;
    }
}