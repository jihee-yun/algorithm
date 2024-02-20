class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        if(num_list.length < 11) {
            answer = 1;
            for(int e : num_list) {
                answer *= e;
            }
        } else {
            for(int e : num_list) {
                answer += e;
            }
        }
        return answer;
    }
}