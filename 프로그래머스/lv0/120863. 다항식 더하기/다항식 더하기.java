class Solution {
    public String solution(String polynomial) {
        String answer = "";
        int tmp = 0;
        int tmp2 = 0;
        String[] arr = polynomial.split(" ");
        
        for(String e : arr) {
            if (e.equals("+")) {
                continue;
            } else if(e.contains("x")) {
                int num = (e.replace("x", "").equals("")) ? 1 
                    : Integer.parseInt(e.replace("x", ""));
                tmp += num;
            } else {
                tmp2 += Integer.parseInt(e);
            }
        }
        
        if (tmp != 0 && tmp != 1) {
            answer += tmp + "x";
        } else if(tmp == 1) {
            answer += "x";
        } 
        
        if (tmp2 != 0) {
            if (tmp != 0) {
                answer += " + ";
            }
            answer += tmp2;
        }
        
         if (answer.equals("")) {
            return "0"; 
        }
        
        return answer;
    }
}