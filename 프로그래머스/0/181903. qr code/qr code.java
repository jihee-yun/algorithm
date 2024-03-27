class Solution {
    public String solution(int q, int r, String code) {
        String answer = "";
        
        String[] strArr = code.split("");

        for(int i = 0; i < strArr.length; i++) {
	        if(i % q == r) {
		    answer += strArr[i];
        	    }
            }
        
        return answer;
    }
}