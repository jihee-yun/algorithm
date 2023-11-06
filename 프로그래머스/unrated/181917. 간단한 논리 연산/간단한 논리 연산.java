class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean answer = true;
        boolean tmp = true;
        boolean tmp2 = true;
        
        if(!x1 && !x2) {
            tmp = false;
        }
        
        if(!x3 && !x4) {
            tmp2 = false;
        }
        
        if(tmp && tmp2) {
            answer = true;
        } else answer = false;
        
        return answer;
    }
}