class Solution {
    public int[] solution(int[] num_list) {
        int n = num_list.length;
        int[] answer = new int[n + 1];
        
        for (int i = 0; i < n; i++) {
            answer[i] = num_list[i];
        }
        
        int last = num_list[n - 1];
        int prev = num_list[n - 2];
        answer[n] = (last > prev) ? (last - prev) : (last * 2);
        
        return answer;
    }
}
