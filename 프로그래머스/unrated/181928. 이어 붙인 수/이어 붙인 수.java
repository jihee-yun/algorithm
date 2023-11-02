class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        String tmp = "";
        String tmp2 = "";
        
        for(int i = 0; i < num_list.length; i++) {
            if(num_list[i] % 2 == 0) {
                tmp += "" + num_list[i];
            } else tmp2 += "" + num_list[i];
        }
        
        answer = Integer.parseInt(tmp) + Integer.parseInt(tmp2);
        
        return answer;
    }
}