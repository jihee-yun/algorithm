class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] arr = s.split(" ");
        
        for (int i = 0; i < arr.length; i++) {
            if (!arr[i].equals("Z")) {
                int num = Integer.parseInt(arr[i]);
                answer += num;
            } else {
                int prevNum = Integer.parseInt(arr[i - 1]);
                answer -= prevNum;
            }
        }
        
        return answer;
    }
}